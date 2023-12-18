package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.CampeonatoDTO;
import br.com.fiap.LoL.model.Campeonato;
import br.com.fiap.LoL.service.CampeonatoService;

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
@RequestMapping("campeonatos")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CampeonatoController {

    @Autowired
    private CampeonatoService campeonatoService;

    @GetMapping
    public ResponseEntity<Page<Campeonato>> listAll(
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageRequest
    ) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todos os campeonatos");
        return ResponseEntity.ok(campeonatoService.listAll(pageRequest));
    }

    @GetMapping("{id}")
    public ResponseEntity<Campeonato> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo campeonato por ID: " + id);
        return ResponseEntity.ok(campeonatoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Campeonato> create(@RequestBody @Valid CampeonatoDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando novo campeonato: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(campeonatoService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Campeonato> update(@PathVariable Long id, @RequestBody @Valid CampeonatoDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando campeonato por ID: " + id);
        return ResponseEntity.ok(campeonatoService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando campeonato por ID: " + id);
        campeonatoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
