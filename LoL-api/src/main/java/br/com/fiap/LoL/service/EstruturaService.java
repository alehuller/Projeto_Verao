package br.com.fiap.LoL.service;

import br.com.fiap.LoL.dto.EstruturaDTO;
import br.com.fiap.LoL.model.Estrutura;
import br.com.fiap.LoL.repository.EstruturaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EstruturaService {

    @Autowired
    private EstruturaRepository estruturaRepository;

    public Page<Estrutura> listAll(Pageable pageRequest) {
        return estruturaRepository.findAll(pageRequest);
    }

    public Estrutura findById(Long id) {
        return findEntityById(id);
    }

    @Transactional
    public Estrutura create(EstruturaDTO newData) {
        Estrutura entity = convertToEntity(newData);
        return estruturaRepository.save(entity);
    }

    @Transactional
    public Estrutura update(Long id, EstruturaDTO updatedData) {
        Estrutura entity = findEntityById(id);
        updateEntityWithDTO(entity, updatedData);
        return estruturaRepository.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        Estrutura entity = findEntityById(id);
        estruturaRepository.delete(entity);
    }

    private Estrutura findEntityById(Long id) {
        return estruturaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Estrutura não encontrada por ID: " + id));
    }

    private Estrutura convertToEntity(EstruturaDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("EstruturaDTO não pode ser nulo.");
        }
        Estrutura entity = dto.getId() != null ? findEntityById(dto.getId()) : new Estrutura();
        updateEntityWithDTO(entity, dto);
        return entity;
    }

    private void updateEntityWithDTO(Estrutura entity, EstruturaDTO dto) {
        entity.setNome(dto.getNome());
    }
}
