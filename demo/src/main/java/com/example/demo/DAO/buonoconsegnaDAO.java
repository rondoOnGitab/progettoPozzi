package com.example.demo.DAO;

import com.example.demo.DTO.buonoconsegnaDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class buonoconsegnaDAO {

    public void inserisci(int idPolizza, int pesoKg, int cliente) {
        String sql = "INSERT INTO buonoconsegna (idPolizza, peso_kg, cliente) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idPolizza);
            stmt.setDouble(2, pesoKg);
            stmt.setInt(3, cliente);

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<buonoconsegnaDTO> getAllBuoni() {
        List<buonoconsegnaDTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM buonoconsegna";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                buonoconsegnaDTO b = new buonoconsegnaDTO();
                b.setIdBuono(rs.getInt("idBuono"));
                b.setIdPolizza(rs.getInt("idPolizza"));
                b.setPesoKg(rs.getInt("peso_kg"));
                b.setCliente(rs.getInt("cliente"));
                lista.add(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
