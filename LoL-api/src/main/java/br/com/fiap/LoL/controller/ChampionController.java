package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.ChampionDTO;
import br.com.fiap.LoL.model.Champion;
import br.com.fiap.LoL.service.ChampionService;

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
@RequestMapping("champions")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChampionController {

    @Autowired
    private ChampionService championService;

    @GetMapping
    public ResponseEntity<Page<Champion>> listAll(
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageRequest
    ) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todos os champions");
        return ResponseEntity.ok(championService.listAll(pageRequest));
    }

    @GetMapping("{id}")
    public ResponseEntity<Champion> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo champion por ID: " + id);
        return ResponseEntity.ok(championService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Champion> create(@RequestBody @Valid ChampionDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando novo champion: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(championService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Champion> update(@PathVariable Long id, @RequestBody @Valid ChampionDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando champion por ID: " + id);
        return ResponseEntity.ok(championService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando champion por ID: " + id);
        championService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
