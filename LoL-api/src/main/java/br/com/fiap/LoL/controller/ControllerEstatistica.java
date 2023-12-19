package br.com.fiap.LoL.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fiap.LoL.model.PartidaAtual;

@Controller
@RequestMapping("/paginaEstatisticaLpl")
public class ControllerEstatistica {
    
    @GetMapping
    public String init(final Model model) throws SQLException{
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        PartidaAtual partidaAtual = partidaAtualDAO.pegarTudo();
        model.addAttribute("partidaAtual", partidaAtual);
        return "paginaEstatisticaLpl";
    }
}
