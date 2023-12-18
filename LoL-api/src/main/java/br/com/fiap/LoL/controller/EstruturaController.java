package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.EstruturaDTO;
import br.com.fiap.LoL.model.Estrutura;
import br.com.fiap.LoL.service.EstruturaService;

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
@RequestMapping("estruturas")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EstruturaController {

    @Autowired
    private EstruturaService estruturaService;

    @GetMapping
    public ResponseEntity<Page<Estrutura>> listAll(
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageRequest
    ) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todas as estruturas");
        return ResponseEntity.ok(estruturaService.listAll(pageRequest));
    }

    @GetMapping("{id}")
    public ResponseEntity<Estrutura> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo estrutura por ID: " + id);
        return ResponseEntity.ok(estruturaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Estrutura> create(@RequestBody @Valid EstruturaDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando nova estrutura: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(estruturaService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Estrutura> update(@PathVariable Long id, @RequestBody @Valid EstruturaDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando estrutura por ID: " + id);
        return ResponseEntity.ok(estruturaService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando estrutura por ID: " + id);
        estruturaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
