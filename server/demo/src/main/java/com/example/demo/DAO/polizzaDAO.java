package com.example.demo.DAO;

import com.example.demo.DTO.polizzaDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class polizzaDAO {

    public void inserisci(int idViaggio, int idPortoCarico, int idPortoDestinazione, String tipologiaMerce,
                          int pesoKg, String fornitore, int giorniFranchigia, double tariffaGiornaliera) {

        String query = "INSERT INTO polizza (idViaggio, idPortoCarico, idPortoDestinazione, tipologia_merce, peso_kg, fornitore, giorniFranchigia, tariffaGiornaliera) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idViaggio);
            stmt.setInt(2, idPortoCarico);
            stmt.setInt(3, idPortoDestinazione);
            stmt.setString(4, tipologiaMerce);
            stmt.setDouble(5, pesoKg);
            stmt.setString(6, fornitore);
            stmt.setInt(7, giorniFranchigia);
            stmt.setDouble(8, tariffaGiornaliera);

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<polizzaDTO> getAllPolizze() {
        List<polizzaDTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM polizza";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                polizzaDTO p = new polizzaDTO();
                p.setIdPolizza(rs.getInt("idPolizza"));
                p.setIdViaggio(rs.getInt("idViaggio"));
                p.setIdPortoCarico(rs.getInt("idPortoCarico"));
                p.setIdPortoDestinazione(rs.getInt("idPortoDestinazione"));
                p.setTipologiaMerce(rs.getString("tipologia_merce"));
                p.setPesoKg(rs.getInt("peso_kg"));
                p.setFornitore(rs.getString("fornitore"));
                p.setGiorniFranchigia(rs.getInt("giorniFranchigia"));
                p.setTariffaGiornaliera(rs.getDouble("tariffaGiornaliera"));
                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
