package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.PartidaDTO;
import br.com.fiap.LoL.model.Partida;

import br.com.fiap.LoL.service.PartidaService;
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
@RequestMapping("partidas")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @GetMapping
    public ResponseEntity<Page<Partida>> listAll(
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageRequest
    ) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todas as partidas");
        return ResponseEntity.ok(partidaService.listAll(pageRequest));
    }

    @GetMapping("{id}")
    public ResponseEntity<Partida> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo partida por ID: " + id);
        return ResponseEntity.ok(partidaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Partida> create(@RequestBody @Valid PartidaDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando nova partida: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(partidaService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Partida> update(@PathVariable Long id, @RequestBody @Valid PartidaDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando partida por ID: " + id);
        return ResponseEntity.ok(partidaService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando partida por ID: " + id);
        partidaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
