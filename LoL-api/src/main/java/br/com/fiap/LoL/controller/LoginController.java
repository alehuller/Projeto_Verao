package br.com.fiap.LoL.controller;
import br.com.fiap.LoL.dto.LoginDTO;
import br.com.fiap.LoL.model.Usuario;
import br.com.fiap.LoL.service.UsuarioService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {

    private final UsuarioService usuarioService;

    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<?> autenticarUsuario(@RequestBody LoginDTO loginDTO) {
        Optional<Usuario> usuario = usuarioService.validarLogin(loginDTO);

        if (usuario.isPresent()) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(401).body("Falha na autenticação: credenciais inválidas.");
        }
    }
}