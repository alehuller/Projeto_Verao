package br.com.fiap.LoL.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerGeral {
    
    @PostMapping("/enviarTimeAzul")
    public String enviarTimeAzul(@ModelAttribute("timeazul") String timeAzul) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.timeAzul(timeAzul);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarTimeVermelho")
    public String enviarTimeVermelho(@ModelAttribute("timevermelho") String timeVermelho) throws SQLException {
        System.out.print(timeVermelho);
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.timeVermelho(timeVermelho);
        return "redirect:/paginaEstatisticaLck";
    }
}
