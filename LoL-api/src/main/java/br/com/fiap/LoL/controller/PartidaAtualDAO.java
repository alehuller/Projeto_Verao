package br.com.fiap.LoL.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import br.com.fiap.LoL.model.PartidaAtual;
import br.com.fiap.LoL.model.Usuario;

@Repository
public class PartidaAtualDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/projeto_verao";
    private static final String USER = "root";
    private static final String PASSWORD = "admin1234";

    public void timeAzul(String time) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set timeazul = ? where id_partidaatual = 1")) {
            ps.setString(1, time);
            ps.execute();
        }
    }

    public PartidaAtual pegarTudo() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
        String sql = "select * from partidaatual where id_partidaatual = ?;";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, 1);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    PartidaAtual partidaAtual = new PartidaAtual();
                    partidaAtual.setId(rs.getLong("id_partidaatual"));
                    partidaAtual.setAdcAzul(rs.getString("adcazul"));
                    partidaAtual.setAdcVermelho(rs.getString("adcvermelho"));
                    partidaAtual.setCampeonato(rs.getString("campeonato"));
                    partidaAtual.setJungleAzul(rs.getString("jungleazul"));
                    partidaAtual.setJungleVermelho(rs.getString("junglevermelho"));
                    partidaAtual.setMidAzul(rs.getString("midazul"));
                    partidaAtual.setMidVermelho(rs.getString("midvermelho"));
                    partidaAtual.setSuppAzul(rs.getString("suppazul"));
                    partidaAtual.setSuppVermelho(rs.getString("suppvermelho"));
                    partidaAtual.setTimeAzul(rs.getString("timeazul"));
                    partidaAtual.setTimeVermelho(rs.getString("timevermelho"));
                    partidaAtual.setTopAzul(rs.getString("topazul"));
                    partidaAtual.setTopVermelho(rs.getString("topvermelho"));
                    partidaAtual.setBaronAzul(rs.getString("baronazul"));
                    partidaAtual.setBaronVermelho(rs.getString("baronvermelho"));
                    partidaAtual.setDragaoAnciaoAzul(rs.getString("dragaoanciaoazul"));
                    partidaAtual.setDragaoAnciaoVermelho(rs.getString("dragaoanciaovermelho"));
                    partidaAtual.setDragaoChemtechAzul(rs.getString("dragaochemtechazul"));
                    partidaAtual.setDragaoChemtechVermelho(rs.getString("dragaochemtechvermelho"));
                    partidaAtual.setDragaoHextechAzul(rs.getString("dragaohextechazul"));
                    partidaAtual.setDragaoHextechVermelho(rs.getString("dragaohextechvermelho"));
                    partidaAtual.setDragaoInfernalAzul(rs.getString("dragaoinfernalazul"));
                    partidaAtual.setDragaoInfernalVermelho(rs.getString("dragaoinfernalvermelho"));
                    partidaAtual.setDragaoMontanhaAzul(rs.getString("dragaomontanhaazul"));
                    partidaAtual.setDragaoMontanhaVermelho(rs.getString("dragaomontanhavermelho"));
                    partidaAtual.setDragaoOceanoAzul(rs.getString("dragaooceanoazul"));
                    partidaAtual.setDragaoOceanoVermelho(rs.getString("dragaooceanovermelho"));
                    partidaAtual.setPontosAzul(rs.getString("pontosazul"));
                    partidaAtual.setPontosVermelho(rs.getString("pontosvermelho"));
                    partidaAtual.setDragaoNuvemAzul(rs.getString("dragaonuvemazul"));
                    partidaAtual.setDragaoNuvemVermelho(rs.getString("dragaonuvemvermelho"));
                    partidaAtual.setPontosAdcAzul(rs.getString("pontosadcazul"));
                    partidaAtual.setPontosAdcVermelho(rs.getString("pontosadcvermelho"));
                    partidaAtual.setPontosJungleAzul(rs.getString("pontosjungleazul"));
                    partidaAtual.setPontosJungleVermelho(rs.getString("pontosjunglevermelho"));
                    partidaAtual.setPontosMidAzul(rs.getString("pontosmidazul"));
                    partidaAtual.setPontosMidVermelho(rs.getString("pontosmidvermelho"));
                    partidaAtual.setPontosSuppAzul(rs.getString("pontossuppazul"));
                    partidaAtual.setPontosSuppVermelho(rs.getString("pontossuppvermelho"));
                    partidaAtual.setPontosTopAzul(rs.getString("pontostopazul"));
                    partidaAtual.setPontosTopVermelho(rs.getString("pontostopvermelho"));
                    partidaAtual.setItemUmTop(rs.getString("itemumtop"));
                    partidaAtual.setItemDoisTop(rs.getString("itemdoistop"));
                    partidaAtual.setItemTresTop(rs.getString("itemtrestop"));
                    partidaAtual.setItemQuatroTop(rs.getString("itemquatrotop"));
                    partidaAtual.setItemCincoTop(rs.getString("itemcincotop"));
                    partidaAtual.setItemSeisTop(rs.getString("itemseistop"));
                    partidaAtual.setItemCincoAdcAzul(rs.getString("itemcincoadcazul"));
                    partidaAtual.setItemCincoAdcVermelho(rs.getString("itemcincoadcvermelho"));
                    partidaAtual.setItemCincoJungleAzul(rs.getString("itemcincojungleazul"));
                    partidaAtual.setItemCincoJungleVermelho(rs.getString("itemcincojunglevermelho"));
                    partidaAtual.setItemCincoMidAzul(rs.getString("itemcincomidazul"));
                    partidaAtual.setItemCincoMidVermelho(rs.getString("itemcincomidvermelho"));
                    partidaAtual.setItemCincoSuppAzul(rs.getString("itemcincosuppazul"));
                    partidaAtual.setItemCincoSuppVermelho(rs.getString("itemcincosuppvermelho"));
                    partidaAtual.setItemCincoTopVermelho(rs.getString("itemcincotopvermelho"));
                    partidaAtual.setItemDoisAdcAzul(rs.getString("itemdoisadcazul"));
                    partidaAtual.setItemDoisAdcVermelho(rs.getString("itemdoisadcvermelho"));
                    partidaAtual.setItemDoisJungleAzul(rs.getString("itemdoisjungleazul"));
                    partidaAtual.setItemDoisJungleVermelho(rs.getString("itemdoisjunglevermelho"));
                    partidaAtual.setItemDoisMidAzul(rs.getString("itemdoismidazul"));
                    partidaAtual.setItemDoisMidVermelho(rs.getString("itemdoismidvermelho"));
                    partidaAtual.setItemDoisSuppAzul(rs.getString("itemdoissuppazul"));
                    partidaAtual.setItemDoisSuppVermelho(rs.getString("itemdoissuppvermelho"));
                    return partidaAtual;
                }
                return null; // Retorna null se não encontrou o usuário com o CPF especificado
            }
        }
    }
    }

    public void timeVermelho(String timeVermelho) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set timevermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, timeVermelho);
            ps.execute();
        }
    }

    public void topAzul(String topAzul) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set topazul = ? where id_partidaatual = 1")) {
            ps.setString(1, topAzul);
            ps.execute();
        }
    }

    public void jungleAzul(String jungleAzul) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set jungleazul = ? where id_partidaatual = 1")) {
            ps.setString(1, jungleAzul);
            ps.execute();
        }
    }

    public void midAzul(String midAzul) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set midazul = ? where id_partidaatual = 1")) {
            ps.setString(1, midAzul);
            ps.execute();
        }
    }

    public void adcAzul(String adcAzul) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set adcazul = ? where id_partidaatual = 1")) {
            ps.setString(1, adcAzul);
            ps.execute();
        }
    }

    public void suppAzul(String suppAzul) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set suppazul = ? where id_partidaatual = 1")) {
            ps.setString(1, suppAzul);
            ps.execute();
        }
    }

    public void topVermelho(String topVermelho) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set topvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, topVermelho);
            ps.execute();
        }
    }

    public void jungleVermelho(String jungleVermelho) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set junglevermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, jungleVermelho);
            ps.execute();
        }
    }

    public void midVermelho(String midVermelho) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set midvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, midVermelho);
            ps.execute();
        }
    }

    public void adcVermelho(String adcVermelho) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set adcvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, adcVermelho);
            ps.execute();
        }
    }

    public void suppVermelho(String suppVermelho) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set suppvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, suppVermelho);
            ps.execute();
        }
    }

    public void baronAzul(String baronAzul) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set baronazul = ? where id_partidaatual = 1")) {
            ps.setString(1, baronAzul);
            ps.execute();
        }
    }

    public void baronVermelho(String baronVermelho) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set baronvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, baronVermelho);
            ps.execute();
        }
    }

    public void dragaoAnciaoAzul(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaoanciaoazul = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoAnciaoVermelho(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaoanciaovermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoChemtechAzul(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaochemtechazul = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoChemtechVermelho(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaochemtechvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoHextechAzul(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaohextechazul = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoHextechVermelho(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaohextechvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoInfernalAzul(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaoinfernalazul = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoInfernalVermhelho(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaoinfernalvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoMontanhaAzul(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaomontanhaazul = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoMontanhaVermelho(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaomontanhavermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoOceanoAzul(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaooceanoazul = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoOceanoVermelho(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaooceanovermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoNuvemAzul(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaonuvemazul = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void dragaoNuvemVermelho(String quantidade) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set dragaonuvemvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, quantidade);
            ps.execute();
        }
    }

    public void reset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("update partidaatual set adcazul = NULL, adcvermelho = NULL, campeonato = NULL, jungleazul = NULL, junglevermelho = NULL, midazul = NULL, midvermelho = NULL, suppazul = NULL, suppvermelho = NULL, topazul = NULL, topvermelho = NULL, timeazul = NULL, timevermelho = NULL, baronazul = NULL, baronvermelho = NULL, dragaoanciaoazul = NULL, dragaoanciaovermelho = NULL, dragaochemtechazul = NULL, dragaochemtechvermelho = NULL, dragaohextechazul = NULL, dragaohextechvermelho = NULL, dragaoinfernalazul = NULL, dragaoinfernalvermelho = NULL, dragaomontanhaazul = NULL, dragaomontanhavermelho = NULL, dragaooceanoazul = NULL, dragaooceanovermelho = NULL, dragaonuvemazul = NULL, dragaonuvemvermelho = NULL, pontosazul = 0, pontosvermelho = 0, pontosadcazul = 0, pontosadcvermelho = 0, pontosjungleazul = 0, pontosjunglevermelho = 0, pontosmidazul = 0, pontosmidvermelho = 0, pontossuppazul = 0, pontossuppvermelho = 0, pontostopazul = 0, pontostopvermelho = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoTopAzul() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontostopazul = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoTopVermelhoReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontostopvermelho = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoTopVermelho() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontostopvermelho = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoTopAzulReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontostopazul = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoJungleAzul() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosjungleazul = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoJungleVermelhoReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosjunglevermelho = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoJungleVermelho() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosjunglevermelho = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
        
    }

    public void pontoJungleAzulReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosjungleazul = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoMidAzul() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosmidazul = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoMidVermelhoReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosmidvermelho = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoMidVermelho() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosmidvermelho = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoMidAzulReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosmidazul = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoAdcAzul() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosadcazul = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoAdcVermelhoReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosadcvermelho = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoAdcVermelho() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosadcvermelho = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoAdcAzulReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontosadcazul = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoSuppAzul() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontossuppazul = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoSuppVermelhoReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontossuppvermelho = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoSuppVermelho() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontossuppvermelho = 1 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontoSuppAzulReset() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set pontossuppazul = 0 where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void pontosTotal() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("update partidaatual set pontosazul = pontostopazul + pontosjungleazul + pontosmidazul + pontosadcazul + pontossuppazul, pontosvermelho = pontostopvermelho + pontosjunglevermelho + pontosmidvermelho + pontosadcvermelho + pontossuppvermelho where id_partidaatual = 1")) {
            ps.execute();
        }
    }

    public void enviarItemUmTop(String itemUmTop) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemumtop = ? where id_partidaatual = 1")) {
            ps.setString(1, itemUmTop);
            ps.execute();
        }
    }

    public void enviarItemDoisTop(String itemTop) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemdoistop = ? where id_partidaatual = 1")) {
            ps.setString(1, itemTop);
            ps.execute();
        }
    }

    public void enviarItemTresTop(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemtrestop = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroTop(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemquatrotop = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoTop(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincotop = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemSeisTop(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemseistop = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemUmJungle(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemumjungleazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemDoisJungle(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemdoisjungleazul = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemTresJungle(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemtresjungleazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroJungle(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemquartojungleazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoJungle(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincojungleazul = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
        
    }

    public void enviarItemSeisJungle(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemseisjungleazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemUmMid(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemummidazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemDoisMid(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemdoismidazul = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemTresMid(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemtresmidazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroMid(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemquatromidazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoMid(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincomidazul = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemSeisMid(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemseismidazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemUmAdc(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemumadcazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemDoisAdc(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemdoisadcazul = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemTresAdc(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemtresadcazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroAdc(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemquatroadcazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoAdc(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincoadcazul = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemSeisAdc(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemseisadcazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemUmSupp(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemumsuppazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemDoisSupp(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemdoissuppazul = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemTresSupp(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemtressuppazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroSupp(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemquatrosuppazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoSupp(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincosuppazul = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemSeisSupp(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemseissuppazul = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemUmTopVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemumtopvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemDoisTopVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemdoistopvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemTresTopVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemtrestopvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroTopVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemquatrotopvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoTopVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincotopvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemSeisTopVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemseistopvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemUmJungleVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemumjunglevermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemDoisJungleVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemdoisjunglevermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemTresJungleVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemtresjunglevermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroJungleVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemquatrojunglevermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoJungleVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincojunglevermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemSeisJungleVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemseisjunglevermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemUmMidVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemummidvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemDoisMidVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemdoismidvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemTresMidVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemtresmidvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroMidVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemquatromidvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoMidVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincomidvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemSeisMidVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemseismidvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemUmAdcVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemumadcvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemDoisAdcVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemdoisadcvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemTresAdcVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemtresadcvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroAdcVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemquatroadcvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoAdcVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincoadcvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemSeisAdcVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemseisadcvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemUmSuppVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemumsuppvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemDoisSuppVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemdoissuppvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemTresSuppVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemtressuppvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemQuatroSuppVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemquatrosuppvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemCincoSuppVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatual set itemcincosuppvermelho = ? where id_partidaatual = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }

    public void enviarItemSeisSuppVermelho(String item) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("UPDATE partidaatualdois set itemseissuppvermelho = ? where id_partidaatualdois = 1")) {
            ps.setString(1, item);
            ps.execute();
        }
    }
    
}
