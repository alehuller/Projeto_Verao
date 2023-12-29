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

    @PostMapping("/resetDois")
    public String resetDois() throws SQLException {
        PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
        partidaAtualDAO.resetDois();
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

    @PostMapping("/enviarItemTop")
    public String enviarItemUmTop(@ModelAttribute("itemtop") String itemTop, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Top".equals(itemTop)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmTop(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisTop(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresTop(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroTop(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoTop(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisTop(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/enviarItemJungle")
    public String enviarItemUmJungle(@ModelAttribute("itemjungle") String itemJungle, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Jungle".equals(itemJungle)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmJungle(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisJungle(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresJungle(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroJungle(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoJungle(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisJungle(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/enviarItemMid")
    public String enviarItemUmMid(@ModelAttribute("itemmid") String itemMid, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Mid".equals(itemMid)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmMid(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisMid(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresMid(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroMid(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoMid(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisMid(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/enviarItemAdc")
    public String enviarItemUmAdc(@ModelAttribute("itemadc") String itemAdc, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Adc".equals(itemAdc)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmAdc(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisAdc(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresAdc(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroAdc(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoAdc(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisAdc(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/enviarItemSupp")
    public String enviarItemUmSupp(@ModelAttribute("itemsupp") String itemSupp, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Supp".equals(itemSupp)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmSupp(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisSupp(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresSupp(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroSupp(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoSupp(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisSupp(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/enviarItemTopVermelho")
    public String enviarItemUmTopVermelho(@ModelAttribute("itemtop") String itemTop, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Top".equals(itemTop)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmTopVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisTopVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresTopVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroTopVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoTopVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Top".equals(itemTop)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisTopVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/enviarItemJungleVermelho")
    public String enviarItemUmJungleVermelho(@ModelAttribute("itemjungle") String itemJungle, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Jungle".equals(itemJungle)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmJungleVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisJungleVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresJungleVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroJungleVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoJungleVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Jungle".equals(itemJungle)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisJungleVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/enviarItemMidVermelho")
    public String enviarItemUmMidVermelho(@ModelAttribute("itemmid") String itemMid, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Mid".equals(itemMid)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmMidVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisMidVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresMidVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroMidVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoMidVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Mid".equals(itemMid)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisMidVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/enviarItemAdcVermelho")
    public String enviarItemUmAdcVermelho(@ModelAttribute("itemadc") String itemAdc, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Adc".equals(itemAdc)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmAdcVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisAdcVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresAdcVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroAdcVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoAdcVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Adc".equals(itemAdc)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisAdcVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }

    @PostMapping("/enviarItemSuppVermelho")
    public String enviarItemUmSuppVermelho(@ModelAttribute("itemsupp") String itemSupp, @ModelAttribute("item") String item) throws SQLException {
        if("Item Um Supp".equals(itemSupp)) {
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemUmSuppVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Dois Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemDoisSuppVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Tres Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemTresSuppVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Quatro Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemQuatroSuppVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Cinco Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemCincoSuppVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else if ("Item Seis Supp".equals(itemSupp)){
            PartidaAtualDAO partidaAtualDAO = new PartidaAtualDAO();
            partidaAtualDAO.enviarItemSeisSuppVermelho(item);
            return "redirect:/paginaEstatisticaLck";
        }
        else {
            return "redirect:/paginaEstatisticaLck";
        }
    }
}
