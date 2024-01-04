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

    private static final String URL = "jdbc:mysql://localhost:3307/LoL";
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
                    partidaAtualDois.setItemDoisAdcAzul(rs.getString("itemdoisadcazul"));
                    partidaAtualDois.setItemDoisAdcVermelho(rs.getString("itemdoisadcvermelho"));
                    partidaAtualDois.setItemDoisJungleVermelho(rs.getString("itemdoisjunglevermelho"));
                    partidaAtualDois.setItemDoisMidVermelho(rs.getString("itemdoismidvermelho"));
                    partidaAtualDois.setItemDoisSuppAzul(rs.getString("itemdoissuppazul"));
                    partidaAtualDois.setItemDoisSuppVermelho(rs.getString("itemdoissuppvermelho"));
                    partidaAtualDois.setItemDoisTopVermelho(rs.getString("itemdoistopvermelho"));
                    partidaAtualDois.setItemQuartoAdcAzul(rs.getString("itemquatroadcazul"));
                    partidaAtualDois.setItemQuartoJungleAzul(rs.getString("itemquartojungleazul"));
                    partidaAtualDois.setItemQuatroAdcVermelho(rs.getString("itemquatroadcvermelho"));
                    partidaAtualDois.setItemQuatroJungleVermelho(rs.getString("itemquatrojunglevermelho"));
                    partidaAtualDois.setItemQuatroMidAzul(rs.getString("itemquatromidazul"));
                    partidaAtualDois.setItemQuatroMidVermelho(rs.getString("itemquatromidvermelho"));
                    partidaAtualDois.setItemQuatroSuppAzul(rs.getString("itemquatrosuppazul"));
                    partidaAtualDois.setItemQuatroSuppVermelho(rs.getString("itemquatrosuppvermelho"));
                    partidaAtualDois.setItemQuatroTopVermelho(rs.getString("itemquatrotopvermelho"));
                    partidaAtualDois.setItemSeisAdcAzul(rs.getString("itemseisadcazul"));
                    partidaAtualDois.setItemSeisAdcVermelho(rs.getString("itemseisadcvermelho"));
                    partidaAtualDois.setItemSeisJungleAzul(rs.getString("itemseisjungleazul"));
                    partidaAtualDois.setItemSeisJungleVermelho(rs.getString("itemseisjunglevermelho"));
                    partidaAtualDois.setItemSeisMidAzul(rs.getString("itemseismidazul"));
                    partidaAtualDois.setItemSeisMidVermelho(rs.getString("itemseismidvermelho"));
                    partidaAtualDois.setItemSeisSuppAzul(rs.getString("itemseissuppazul"));
                    partidaAtualDois.setItemSeisSuppVermelho(rs.getString("itemseissuppvermelho"));
                    partidaAtualDois.setItemSeisTopVermelho(rs.getString("itemseistopvermelho"));
                    partidaAtualDois.setItemTresAdcAzul(rs.getString("itemtresadcazul"));
                    partidaAtualDois.setItemTresAdcVermelho(rs.getString("itemtresadcvermelho"));
                    partidaAtualDois.setItemTresJungleAzul(rs.getString("itemtresjungleazul"));
                    partidaAtualDois.setItemTresJungleVermelho(rs.getString("itemtresjunglevermelho"));
                    partidaAtualDois.setItemTresMidAzul(rs.getString("itemtresmidazul"));
                    partidaAtualDois.setItemTresMidVermelho(rs.getString("itemtresmidvermelho"));
                    partidaAtualDois.setItemTresSuppAzul(rs.getString("itemtressuppazul"));
                    partidaAtualDois.setItemTresSuppVermelho(rs.getString("itemtressuppvermelho"));
                    partidaAtualDois.setItemTresTopVermelho(rs.getString("itemtrestopvermelho"));
                    partidaAtualDois.setItemUmAdcAzul(rs.getString("itemumadcazul"));
                    partidaAtualDois.setItemUmAdcVermelho(rs.getString("itemumadcvermelho"));
                    partidaAtualDois.setItemUmJungleAzul(rs.getString("itemumjungleazul"));
                    partidaAtualDois.setItemUmJungleVermelho(rs.getString("itemumjunglevermelho"));
                    partidaAtualDois.setItemUmMidAzul(rs.getString("itemummidazul"));
                    partidaAtualDois.setItemUmMidVermelho(rs.getString("itemummidvermelho"));
                    partidaAtualDois.setItemUmSuppAzul(rs.getString("itemumsuppazul"));
                    partidaAtualDois.setItemUmSuppVermelho(rs.getString("itemumsuppvermelho"));
                    partidaAtualDois.setItemUmTopVermelho(rs.getString("itemumtopvermelho"));

                    return partidaAtualDois;
                }
                return null; // Retorna null se não encontrou o usuário com o CPF especificado
            }
        }
    }
    }
}
