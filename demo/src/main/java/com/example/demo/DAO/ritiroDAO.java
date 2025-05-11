package com.example.demo.DAO;

import com.example.demo.DTO.ritiroDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ritiroDAO {

    public void inserisci(int idBuono, String targaCamion, int idAutista, Date dataRitiro, int pesoRitirato) {
        String query = "INSERT INTO ritiro (idBuono, targaCamion, idAutista, data_ritiro, peso_ritirato) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idBuono);
            stmt.setString(2, targaCamion);
            stmt.setInt(3, idAutista);
            stmt.setDate(4, dataRitiro);
            stmt.setInt(5, pesoRitirato);

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ritiroDTO> getAllRitiri() {
        List<ritiroDTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM ritiro";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ritiroDTO r = new ritiroDTO();
                r.setIdRitiro(rs.getInt("idRitiro"));
                r.setIdBuono(rs.getInt("idBuono"));
                r.setTargaCamion(rs.getString("targaCamion"));
                r.setIdAutista(rs.getInt("idAutista"));
                r.setDataRitiro(rs.getDate("data_ritiro"));
                r.setPesoRitirato(rs.getInt("peso_ritirato"));
                lista.add(r);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
