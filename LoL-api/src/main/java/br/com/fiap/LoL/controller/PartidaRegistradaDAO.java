package br.com.fiap.LoL.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import br.com.fiap.LoL.model.PartidaAtual;

@Repository
public class PartidaRegistradaDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/projeto_verao";
    private static final String USER = "root";
    private static final String PASSWORD = "admin1234";

    public void enviarPartida(PartidaAtual partidaAtual, Long id) throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("INSERT INTO partidaregistrada (id_partidaregistrada, adcazul, adcvermelho, baronazul, baronvermelho, dragaoanciaoazul, dragaoanciaovermelho, dragaochemtechazul, dragaochemtechvermelho, dragaohextechazul, dragaohextechvermelho, dragaoinfernalazul, dragaoinfernalvermelho, dragaomontanhaazul, dragaomontanhavermelho, dragaonuvemazul, dragaonuvemvermelho, dragaooceanoazul, dragaooceanovermelho, jungleazul, junglevermelho, midazul, midvermelho, pontosazul, pontosvermelho, suppazul, suppvermelho, timeazul, timevermelho, topazul, topvermelho) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
            ps.setLong(1, id + 1);
            ps.setString(2, partidaAtual.getAdcAzul());
            ps.setString(3, partidaAtual.getAdcVermelho());
            ps.setString(4, partidaAtual.getBaronAzul());
            ps.setString(5, partidaAtual.getBaronVermelho());
            ps.setString(6, partidaAtual.getDragaoAnciaoAzul());
            ps.setString(7, partidaAtual.getDragaoAnciaoVermelho());
            ps.setString(8, partidaAtual.getDragaoChemtechAzul());
            ps.setString(9, partidaAtual.getDragaoChemtechVermelho());
            ps.setString(10, partidaAtual.getDragaoHextechAzul());
            ps.setString(11, partidaAtual.getDragaoHextechVermelho());
            ps.setString(12, partidaAtual.getDragaoInfernalAzul());
            ps.setString(13, partidaAtual.getDragaoInfernalVermelho());
            ps.setString(14, partidaAtual.getDragaoMontanhaAzul());
            ps.setString(15, partidaAtual.getDragaoMontanhaVermelho());
            ps.setString(16, partidaAtual.getDragaoNuvemAzul());
            ps.setString(17, partidaAtual.getDragaoNuvemVermelho());
            ps.setString(18, partidaAtual.getDragaoOceanoAzul());
            ps.setString(19, partidaAtual.getDragaoOceanoVermelho());
            ps.setString(20, partidaAtual.getJungleAzul());
            ps.setString(21, partidaAtual.getJungleVermelho());
            ps.setString(22, partidaAtual.getMidAzul());
            ps.setString(23, partidaAtual.getMidVermelho());
            ps.setString(24, partidaAtual.getPontosAzul());
            ps.setString(25, partidaAtual.getPontosVermelho());
            ps.setString(26, partidaAtual.getSuppAzul());
            ps.setString(27, partidaAtual.getSuppVermelho());
            ps.setString(28, partidaAtual.getTimeAzul());
            ps.setString(29, partidaAtual.getTimeVermelho());
            ps.setString(30, partidaAtual.getTopAzul());
            ps.setString(31, partidaAtual.getTopVermelho());
            ps.execute();
        }
    }

    public Long pegarUltimoId() throws SQLException{
        Long lastId = null;

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement getLastIdPs = con.prepareStatement("SELECT MAX(id_partidaregistrada) FROM partidaregistrada");
            ResultSet resultSet = getLastIdPs.executeQuery()) {
        if (resultSet.next()) {
            lastId = resultSet.getLong(1);
        }
    }

    return lastId;
    }
    
}
