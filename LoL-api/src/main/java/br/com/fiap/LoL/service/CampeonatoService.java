package br.com.fiap.LoL.service;

import br.com.fiap.LoL.dto.CampeonatoDTO;
import br.com.fiap.LoL.model.Campeonato;
import br.com.fiap.LoL.repository.CampeonatoRepository;
import br.com.fiap.LoL.repository.TimeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CampeonatoService {

    @Autowired
    private CampeonatoRepository campeonatoRepository;

    @Autowired
    private TimeRepository timeRepository;

    public Page<Campeonato> listAll(Pageable pageRequest) {
        return campeonatoRepository.findAll(pageRequest);
    }

    public Campeonato findById(Long id) {
        return findEntityById(id);
    }

    @Transactional
    public Campeonato create(CampeonatoDTO newData) {
        Campeonato entity = convertToEntity(newData);
        return campeonatoRepository.save(entity);
    }

    @Transactional
    public Campeonato update(Long id, CampeonatoDTO updatedData) {
        Campeonato entity = findEntityById(id);
        updateEntityWithDTO(entity, updatedData);
        return campeonatoRepository.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        Campeonato entity = findEntityById(id);
        campeonatoRepository.delete(entity);
    }

    private Campeonato findEntityById(Long id) {
        return campeonatoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Campeonato não encontrado por ID: " + id));
    }

    private Campeonato convertToEntity(CampeonatoDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("CampeonatoDTO não pode ser nulo.");
        }
        Campeonato entity = dto.getId() != null ? findEntityById(dto.getId()) : new Campeonato();
        updateEntityWithDTO(entity, dto);
        return entity;
    }

    private void updateEntityWithDTO(Campeonato entity, CampeonatoDTO dto) {
        entity.setNome(dto.getNome());
        entity.setTime(timeRepository.findById(dto.getIdTime())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Time não encontrado por ID: " + dto.getIdTime())));
    }
}
