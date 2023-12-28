package br.com.fiap.LoL.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import br.com.fiap.LoL.model.PartidaAtual;
import br.com.fiap.LoL.model.PartidaAtualDois;

@Repository
public class PartidaAtualDoisDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/projeto_verao";
    private static final String USER = "root";
    private static final String PASSWORD = "admin1234";
    
    public PartidaAtualDois pegarTudo() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
        String sql = "select * from partidaatualdois where id_partidaatualdois = ?;";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, 1);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    PartidaAtualDois partidaAtualDois = new PartidaAtualDois();
                    partidaAtualDois.setId(rs.getLong("id_partidaatualdois"));

                    return partidaAtualDois;
                }
                return null; // Retorna null se não encontrou o usuário com o CPF especificado
            }
        }
    }
    }
}
