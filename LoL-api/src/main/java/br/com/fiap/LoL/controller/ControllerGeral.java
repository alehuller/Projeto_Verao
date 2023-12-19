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
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.timeVermelho(timeVermelho);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarTopAzul")
    public String enviarTopAzul(@ModelAttribute("topazul") String topAzul) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.topAzul(topAzul);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarJungleAzul")
    public String enviarJungleAzul(@ModelAttribute("jungleazul") String jungleAzul) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.jungleAzul(jungleAzul);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarMidAzul")
    public String enviarMidAzul(@ModelAttribute("midazul") String midAzul) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.midAzul(midAzul);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarAdcAzul")
    public String enviarAdcAzul(@ModelAttribute("adcazul") String adcAzul) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.adcAzul(adcAzul);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarSuppAzul")
    public String enviarSuppAzul(@ModelAttribute("suppazul") String suppAzul) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.suppAzul(suppAzul);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarTopVermelho")
    public String enviarTopVermelho(@ModelAttribute("topvermelho") String topVermelho) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.topVermelho(topVermelho);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarJungleVermelho")
    public String enviarJungleVermelho(@ModelAttribute("junglevermelho") String jungleVermelho) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.jungleVermelho(jungleVermelho);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarMidVermelho")
    public String enviarMidVermelho(@ModelAttribute("midvermelho") String midVermelho) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.midVermelho(midVermelho);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarAdcVermelho")
    public String enviarAdcVermelho(@ModelAttribute("adcvermelho") String adcVermelho) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.adcVermelho(adcVermelho);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarSuppVermelho")
    public String enviarSuppVermelho(@ModelAttribute("suppvermelho") String suppVermelho) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.suppVermelho(suppVermelho);
        return "redirect:/paginaEstatisticaLck";
    }
}
