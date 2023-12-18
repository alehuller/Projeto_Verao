package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.ItemDTO;
import br.com.fiap.LoL.model.Item;
import br.com.fiap.LoL.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import jakarta.validation.Valid;

@RestController
@RequestMapping("itens")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<Page<Item>> listAll(
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageRequest
    ) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todos os itens");
        return ResponseEntity.ok(itemService.listAll(pageRequest));
    }

    @GetMapping("{id}")
    public ResponseEntity<Item> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo item por ID: " + id);
        return ResponseEntity.ok(itemService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Item> create(@RequestBody @Valid ItemDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando novo item: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(itemService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Item> update(@PathVariable Long id, @RequestBody @Valid ItemDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando item por ID: " + id);
        return ResponseEntity.ok(itemService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando item por ID: " + id);
        itemService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
