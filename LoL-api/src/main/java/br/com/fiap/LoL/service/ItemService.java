package br.com.fiap.LoL.service;

import br.com.fiap.LoL.dto.ItemDTO;
import br.com.fiap.LoL.model.Item;
import br.com.fiap.LoL.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Page<Item> listAll(Pageable pageRequest) {
        return itemRepository.findAll(pageRequest);
    }

    public Item findById(Long id) {
        return findEntityById(id);
    }

    @Transactional
    public Item create(ItemDTO newData) {
        Item entity = convertToEntity(newData);
        return itemRepository.save(entity);
    }

    @Transactional
    public Item update(Long id, ItemDTO updatedData) {
        Item entity = findEntityById(id);
        updateEntityWithDTO(entity, updatedData);
        return itemRepository.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        Item entity = findEntityById(id);
        itemRepository.delete(entity);
    }

    private Item findEntityById(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Item não encontrado por ID: " + id));
    }

    private Item convertToEntity(ItemDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("ItemDTO não pode ser nulo.");
        }
        Item entity = dto.getId() != null ? findEntityById(dto.getId()) : new Item();
        updateEntityWithDTO(entity, dto);
        return entity;
    }

    private void updateEntityWithDTO(Item entity, ItemDTO dto) {
        entity.setNome(dto.getNome());
        entity.setValor(dto.getValor() != null ? new BigDecimal(String.valueOf(dto.getValor())) : BigDecimal.ZERO);
    }
}
