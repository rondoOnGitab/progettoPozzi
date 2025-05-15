package com.example.demo.DAO;

import com.example.demo.DTO.viaggioDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class viaggioDAO {

    public void inserisci(int idNave, Date dataPartenza, int idPortoPartenza, int idPortoArrivo, Date dataAllibramento) {
        String query = "INSERT INTO viaggio (idNave, data_partenza, idPortoPartenza, idPortoArrivo, dataAllibramento) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idNave);
            stmt.setDate(2, dataPartenza);
            stmt.setInt(3, idPortoPartenza);
            stmt.setInt(4, idPortoArrivo);
            stmt.setDate(5, dataAllibramento);

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<viaggioDTO> getAllViaggi() {
        List<viaggioDTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM viaggio";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                viaggioDTO v = new viaggioDTO();
                v.setIdViaggio(rs.getInt("idViaggio"));
                v.setIdNave(rs.getInt("idNave"));
                v.setDataPartenza(rs.getDate("data_partenza"));
                v.setIdPortoPartenza(rs.getInt("idPortoPartenza"));
                v.setIdPortoArrivo(rs.getInt("idPortoArrivo"));
                v.setDataAllibramento(rs.getDate("dataAllibramento"));
                lista.add(v);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

}
