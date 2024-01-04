package br.com.fiap.LoL.controller;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAO {

    private static final String URL = "jdbc:mysql://localhost:3307/LoL";
    private static final String USER = "root";
    private static final String PASSWORD = "admin1234";

    public boolean validarUsuario(String email, String senha) throws SQLException{
        var con = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String query = "SELECT * FROM usuario WHERE email_usuario = ? and senha_usuario = ?";
        preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, senha);
        resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
