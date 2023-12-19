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
                    partidaAtual.setSuppAzul("suppazul");
                    partidaAtual.setSuppVermelho("suppvermelho");
                    partidaAtual.setTimeAzul(rs.getString("timeazul"));
                    partidaAtual.setTimeVermelho(rs.getString("timevermelho"));
                    partidaAtual.setTopAzul(rs.getString("topazul"));
                    partidaAtual.setTopVermelho(rs.getString("topvermelho"));

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
    
}
