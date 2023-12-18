package br.com.fiap.LoL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paginaEscolhaLiga")
public class ControllerEscolhaLiga {
    
    @GetMapping
    public String init(final Model model) {
        return "paginaEscolhaLiga";
    }
}
