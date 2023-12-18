package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.KdaDTO;
import br.com.fiap.LoL.model.Kda;
import br.com.fiap.LoL.service.KdaService;

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
@RequestMapping("kdas")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class KdaController {

    @Autowired
    private KdaService kdaService;

    @GetMapping
    public ResponseEntity<Page<Kda>> listAll(
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageRequest
    ) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todos os KDAs");
        return ResponseEntity.ok(kdaService.listAll(pageRequest));
    }

    @GetMapping("{id}")
    public ResponseEntity<Kda> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo KDA por ID: " + id);
        return ResponseEntity.ok(kdaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Kda> create(@RequestBody @Valid KdaDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando novo KDA: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(kdaService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Kda> update(@PathVariable Long id, @RequestBody @Valid KdaDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando KDA por ID: " + id);
        return ResponseEntity.ok(kdaService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando KDA por ID: " + id);
        kdaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
