package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.DragaoDTO;
import br.com.fiap.LoL.model.Dragao;
import br.com.fiap.LoL.service.DragaoService;

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
@RequestMapping("dragoes")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DragaoController {

    @Autowired
    private DragaoService dragaoService;

    @GetMapping
    public ResponseEntity<Page<Dragao>> listAll(
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageRequest
    ) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todos os dragões");
        return ResponseEntity.ok(dragaoService.listAll(pageRequest));
    }

    @GetMapping("{id}")
    public ResponseEntity<Dragao> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo dragão por ID: " + id);
        return ResponseEntity.ok(dragaoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Dragao> create(@RequestBody @Valid DragaoDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando novo dragão: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(dragaoService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Dragao> update(@PathVariable Long id, @RequestBody @Valid DragaoDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando dragão por ID: " + id);
        return ResponseEntity.ok(dragaoService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando dragão por ID: " + id);
        dragaoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
