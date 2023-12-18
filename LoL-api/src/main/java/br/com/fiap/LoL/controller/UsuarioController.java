package br.com.fiap.LoL.controller;

import br.com.fiap.LoL.dto.UsuarioDTO;
import br.com.fiap.LoL.model.Usuario;
import br.com.fiap.LoL.service.UsuarioService;

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
@RequestMapping("usuarios")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<Page<Usuario>> listAll(@PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        log.info("(" + getClass().getSimpleName() + ") - Buscando todos os usuários");
        return ResponseEntity.ok(usuarioService.listAll(pageable));
    }

    @GetMapping("{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Exibindo usuário por ID: " + id);
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody @Valid UsuarioDTO newData) {
        log.info("(" + getClass().getSimpleName() + ") - Cadastrando usuário: " + newData);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.create(newData));
    }

    @PutMapping("{id}")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody @Valid UsuarioDTO updatedData) {
        log.info("(" + getClass().getSimpleName() + ") - Atualizando usuário por ID: " + id);
        return ResponseEntity.ok(usuarioService.update(id, updatedData));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("(" + getClass().getSimpleName() + ") - Deletando usuário por ID: " + id);
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
