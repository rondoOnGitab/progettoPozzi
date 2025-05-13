package com.example.demo.DAO;

import com.example.demo.DTO.portoDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class portoDAO {

    public void inserisci(String nome, String nazionalita, String linea) {
        String query = "INSERT INTO porto (nome, nazionalita, linea) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nome);
            stmt.setString(2, nazionalita);
            stmt.setString(3, linea);

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<portoDTO> getAllPorti() {
        List<portoDTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM porto";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                portoDTO p = new portoDTO();
                p.setIdPorto(rs.getInt("idPorto"));
                p.setNome(rs.getString("nome"));
                p.setNazionalita(rs.getString("nazionalita"));
                p.setLinea(rs.getString("linea"));
                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
