package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.TimeDTO;
import br.com.fiap.LoL.model.Time;
import br.com.fiap.LoL.service.TimeService;

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
@RequestMapping("times")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping
    public ResponseEntity<Page<Time>> listAll(
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageable
    ) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todos(as)");
        return ResponseEntity.ok(timeService.listAll(pageable));
    }

    @GetMapping("{id}")
    public ResponseEntity<Time> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo por ID: " + id);
        return ResponseEntity.ok(timeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Time> create(@RequestBody @Valid TimeDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(timeService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Time> update(@PathVariable Long id, @RequestBody @Valid TimeDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando por ID: " + id);
        return ResponseEntity.ok(timeService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando por ID: " + id);
        timeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
