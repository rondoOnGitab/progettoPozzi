package com.example.demo.DAO;

import com.example.demo.DTO.autistaDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class autistaDAO {

    public void inserisci(String nome, String cognome) {
        String query = "INSERT INTO autista (nome, cognome) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nome);
            stmt.setString(2, cognome);

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<autistaDTO> getAllAutisti() {
        List<autistaDTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM autista";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                autistaDTO a = new autistaDTO();
                a.setIdAutista(rs.getInt("idAutista"));
                a.setNome(rs.getString("nome"));
                a.setCognome(rs.getString("cognome"));
                lista.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
