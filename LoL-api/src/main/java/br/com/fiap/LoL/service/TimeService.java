package br.com.fiap.LoL.service;

import br.com.fiap.LoL.dto.TimeDTO;
import br.com.fiap.LoL.model.Time;
import br.com.fiap.LoL.repository.TimeRepository;
import br.com.fiap.LoL.repository.JogadorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;

@Service
public class TimeService {

    @Autowired
    private TimeRepository timeRepository;

    @Autowired
    private JogadorRepository jogadorRepository;

    public Page<Time> listAll(Pageable pageRequest) {
        return timeRepository.findAll(pageRequest);
    }

    public Time findById(Long id) {
        return findEntityById(id);
    }

    @Transactional
    public Time create(TimeDTO newData) {
        Time entity = convertToEntity(newData);
        return timeRepository.save(entity);
    }

    @Transactional
    public Time update(Long id, TimeDTO updatedData) {
        Time entity = findEntityById(id);
        updateEntityWithDTO(entity, updatedData);
        return timeRepository.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        Time entity = findEntityById(id);
        timeRepository.delete(entity);
    }

    private Time findEntityById(Long id) {
        return timeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Time não encontrado por ID: " + id));
    }

    private Time convertToEntity(TimeDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("TimeDTO não pode ser nulo.");
        }
        Time entity = dto.getId() != null ? findEntityById(dto.getId()) : new Time();
        updateEntityWithDTO(entity, dto);
        return entity;
    }

    private void updateEntityWithDTO(Time entity, TimeDTO dto) {
        entity.setNome(dto.getNome());
        entity.setJogador(jogadorRepository.findById(dto.getIdJogador())
                .orElseThrow(() -> new IllegalArgumentException("Jogador não encontrado.")));
        entity.setVitorias(new BigDecimal(String.valueOf(dto.getVitorias())));
        entity.setDerrotas(new BigDecimal(String.valueOf(dto.getDerrotas())));
    }
}
