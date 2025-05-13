package com.example.demo.DAO;

import com.example.demo.DTO.naveDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class naveDAO {

    public void inserisci(String nome) {
        String query = "INSERT INTO nave (nome) VALUES (?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nome);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<naveDTO> getAllNavi() {
        List<naveDTO> lista = new ArrayList<>();
        String query = "SELECT * FROM nave";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                naveDTO nave = new naveDTO();
                nave.setIdNave(rs.getInt("idNave"));
                nave.setNome(rs.getString("nome"));
                lista.add(nave);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
