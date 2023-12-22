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

    @PostMapping("/enviarBaronAzul")
    public String enviarBaronAzul(@ModelAttribute("baronazul") String baronAzul) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.baronAzul(baronAzul);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarBaronVermelho")
    public String enviarBaronVermelho(@ModelAttribute("baronvermelho") String baronVermelho) throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.baronVermelho(baronVermelho);
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/enviarDragao")
    public String enviarDragao(@ModelAttribute("dragao") String dragao, @ModelAttribute("quantidade") String quantidade) throws SQLException {
        if ("Dragao Anciao Azul".equals(dragao)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoAnciaoAzul(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao Anciao Vermelho".equals(dragao)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoAnciaoVermelho(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao Chemtech Azul".equals(dragao)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoChemtechAzul(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao Chemtech Vermelho".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoChemtechVermelho(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao Hextech Azul".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoHextechAzul(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao Hextech Vermelho".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoHextechVermelho(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao Infernal Azul".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoInfernalAzul(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao Infernal Vermelho".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoInfernalVermhelho(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao da Montanha Azul".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoMontanhaAzul(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao da Montanha Vermelho".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoMontanhaVermelho(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao do Oceano Azul".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoOceanoAzul(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao do Oceano Vermelho".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoOceanoVermelho(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao das Nuvens Azul".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoNuvemAzul(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Dragao das Nuvens Vermelho".equals(dragao)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.dragaoNuvemVermelho(quantidade);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/reset")
    public String reset() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.reset();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoTopAzul")
    public String pontoTopAzul() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoTopAzul();
        partidaAtualDAO.pontoTopVermelhoReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoTopVermelho")
    public String pontoTopVermelho() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoTopVermelho();
        partidaAtualDAO.pontoTopAzulReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoJungleAzul")
    public String pontoJungleAzul() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoJungleAzul();
        partidaAtualDAO.pontoJungleVermelhoReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoJungleVermelho")
    public String pontoJungleVermelho() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoJungleVermelho();
        partidaAtualDAO.pontoJungleAzulReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoMidAzul")
    public String pontoMidAzul() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoMidAzul();
        partidaAtualDAO.pontoMidVermelhoReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoMidVermelho")
    public String pontoMidVermelho() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoMidVermelho();
        partidaAtualDAO.pontoMidAzulReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoAdcAzul")
    public String pontoAdcAzul() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoAdcAzul();
        partidaAtualDAO.pontoAdcVermelhoReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoAdcVermelho")
    public String pontoAdcVermelho() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoAdcVermelho();
        partidaAtualDAO.pontoAdcAzulReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoSuppAzul")
    public String pontoSuppAzul() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoSuppAzul();
        partidaAtualDAO.pontoSuppVermelhoReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }

    @PostMapping("/pontoSuppVermelho")
    public String pontoSuppVermelho() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.pontoSuppVermelho();
        partidaAtualDAO.pontoSuppAzulReset();
        partidaAtualDAO.pontosTotal();
        return "redirect:/paginaEstatisticaLck";
    }
}
