package br.com.fiap.LoL.service;

import br.com.fiap.LoL.dto.DragaoDTO;
import br.com.fiap.LoL.model.Dragao;
import br.com.fiap.LoL.repository.DragaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DragaoService {

    @Autowired
    private DragaoRepository dragaoRepository;

    public Page<Dragao> listAll(Pageable pageRequest) {
        return dragaoRepository.findAll(pageRequest);
    }

    public Dragao findById(Long id) {
        return findEntityById(id);
    }

    @Transactional
    public Dragao create(DragaoDTO newData) {
        Dragao entity = convertToEntity(newData);
        return dragaoRepository.save(entity);
    }

    @Transactional
    public Dragao update(Long id, DragaoDTO updatedData) {
        Dragao entity = findEntityById(id);
        updateEntityWithDTO(entity, updatedData);
        return dragaoRepository.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        Dragao entity = findEntityById(id);
        dragaoRepository.delete(entity);
    }

    private Dragao findEntityById(Long id) {
        return dragaoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Dragão não encontrado por ID: " + id));
    }

    private Dragao convertToEntity(DragaoDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("DragaoDTO não pode ser nulo.");
        }
        Dragao entity = dto.getId() != null ? findEntityById(dto.getId()) : new Dragao();
        updateEntityWithDTO(entity, dto);
        return entity;
    }

    private void updateEntityWithDTO(Dragao entity, DragaoDTO dto) {
        entity.setNome(dto.getNome());
    }
}
