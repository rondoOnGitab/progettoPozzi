package com.example.demo.DAO;

import com.example.demo.DTO.camionDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class camionDAO {

    public void inserisci(String targa) {
        String query = "INSERT INTO camion (targa) VALUES (?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, targa);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<camionDTO> getAllCamion() {
        List<camionDTO> lista = new ArrayList<>();
        String query = "SELECT * FROM camion";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                camionDTO c = new camionDTO();
                c.setTarga(rs.getString("targa"));
                lista.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
