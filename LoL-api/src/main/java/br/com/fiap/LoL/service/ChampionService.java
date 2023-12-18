package br.com.fiap.LoL.service;

import br.com.fiap.LoL.dto.ChampionDTO;
import br.com.fiap.LoL.model.Champion;
import br.com.fiap.LoL.repository.ChampionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ChampionService {

    @Autowired
    private ChampionRepository championRepository;

    public Page<Champion> listAll(Pageable pageRequest) {
        return championRepository.findAll(pageRequest);
    }

    public Champion findById(Long id) {
        return findEntityById(id);
    }

    @Transactional
    public Champion create(ChampionDTO newData) {
        Champion entity = convertToEntity(newData);
        return championRepository.save(entity);
    }

    @Transactional
    public Champion update(Long id, ChampionDTO updatedData) {
        Champion entity = findEntityById(id);
        updateEntityWithDTO(entity, updatedData);
        return championRepository.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        Champion entity = findEntityById(id);
        championRepository.delete(entity);
    }

    private Champion findEntityById(Long id) {
        return championRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Champion não encontrado por ID: " + id));
    }

    private Champion convertToEntity(ChampionDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("ChampionDTO não pode ser nulo.");
        }
        Champion entity = dto.getId() != null ? findEntityById(dto.getId()) : new Champion();
        updateEntityWithDTO(entity, dto);
        return entity;
    }

    private void updateEntityWithDTO(Champion entity, ChampionDTO dto) {
        entity.setNome(dto.getNome());
    }
}
