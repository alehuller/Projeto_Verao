package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.JogadorDTO;
import br.com.fiap.LoL.model.Jogador;
import br.com.fiap.LoL.service.JogadorService;

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
@RequestMapping("jogadores")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public ResponseEntity<Page<Jogador>> listAll(
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageRequest
    ) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todos os jogadores");
        return ResponseEntity.ok(jogadorService.listAll(pageRequest));
    }

    @GetMapping("{id}")
    public ResponseEntity<Jogador> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo jogador por ID: " + id);
        return ResponseEntity.ok(jogadorService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Jogador> create(@RequestBody @Valid JogadorDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando novo jogador: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Jogador> update(@PathVariable Long id, @RequestBody @Valid JogadorDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando jogador por ID: " + id);
        return ResponseEntity.ok(jogadorService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando jogador por ID: " + id);
        jogadorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
