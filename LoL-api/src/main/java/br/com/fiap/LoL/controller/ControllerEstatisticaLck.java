package br.com.fiap.LoL.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.LoL.model.PartidaAtual;
import br.com.fiap.LoL.model.PartidaAtualDois;

@Controller
@RequestMapping("/paginaEstatisticaLck")
public class ControllerEstatisticaLck {
    
    @GetMapping
    public String init(final Model model) throws SQLException{
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        PartidaAtual partidaAtual = partidaAtualDAO.pegarTudo();

        PartidaAtualDoisDAO partidaAtualDoisDAO = new PartidaAtualDoisDAO();
        PartidaAtualDois partidaAtualDois = partidaAtualDoisDAO.pegarTudo();

        model.addAttribute("partidaAtual", partidaAtual);
        model.addAttribute("partidaAtualDois", partidaAtualDois);
        return "paginaEstatisticaLck";
    }
}
