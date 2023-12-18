package br.com.fiap.LoL.service;

import br.com.fiap.LoL.dto.KdaDTO;
import br.com.fiap.LoL.model.Kda;
import br.com.fiap.LoL.repository.KdaRepository;
import br.com.fiap.LoL.repository.PartidaRepository;
import br.com.fiap.LoL.repository.JogadorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class KdaService {

    @Autowired
    private KdaRepository kdaRepository;

    @Autowired
    private PartidaRepository partidaRepository;

    @Autowired
    private JogadorRepository jogadorRepository;

    public Page<Kda> listAll(Pageable pageRequest) {
        return kdaRepository.findAll(pageRequest);
    }

    public Kda findById(Long id) {
        return findEntityById(id);
    }

    @Transactional
    public Kda create(KdaDTO newData) {
        Kda entity = convertToEntity(newData);
        return kdaRepository.save(entity);
    }

    @Transactional
    public Kda update(Long id, KdaDTO updatedData) {
        Kda entity = findEntityById(id);
        updateEntityWithDTO(entity, updatedData);
        return kdaRepository.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        Kda entity = findEntityById(id);
        kdaRepository.delete(entity);
    }

    private Kda findEntityById(Long id) {
        return kdaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "KDA não encontrado por ID: " + id));
    }

    private Kda convertToEntity(KdaDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("KdaDTO não pode ser nulo.");
        }
        Kda entity = dto.getId() != null ? findEntityById(dto.getId()) : new Kda();
        updateEntityWithDTO(entity, dto);
        return entity;
    }

    private void updateEntityWithDTO(Kda entity, KdaDTO dto) {
        entity.setPartida(partidaRepository.findById(dto.getIdPartida()).orElseThrow(() -> new IllegalArgumentException("Partida não encontrada.")));
        entity.setJogador(jogadorRepository.findById(dto.getIdJogador()).orElseThrow(() -> new IllegalArgumentException("Jogador não encontrado.")));
        entity.setAbates(dto.getAbates());
        entity.setMortes(dto.getMortes());
        entity.setAssistencias(dto.getAssistencias());
    }
}
