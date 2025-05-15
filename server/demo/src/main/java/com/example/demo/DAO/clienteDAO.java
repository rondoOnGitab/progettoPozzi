package main.java.com.example.demo.DAO;

import com.example.demo.DAO.DbConnection;
import main.java.com.example.demo.DTO.clienteDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class clienteDAO {

    public void registrazione(String username, String password, String nome, String cognome) {
        String query = "INSERT INTO cliente (username, password, nome, cognome) VALUES (?, MD5(?), ?, ?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, nome);
            stmt.setString(4, cognome);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public clienteDTO login(String username, String password) {
        String query = "SELECT * FROM cliente WHERE username = ? AND password = MD5(?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                clienteDTO c = new clienteDTO();
                c.setId(rs.getInt("id"));
                c.setUsername(rs.getString("username"));
                c.setPassword(rs.getString("password"));
                c.setNome(rs.getString("nome"));
                c.setCognome(rs.getString("cognome"));
                return c;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<clienteDTO> getAllClienti() {
        List<clienteDTO> lista = new ArrayList<>();
        String query = "SELECT * FROM cliente";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                clienteDTO c = new clienteDTO();
                c.setId(rs.getInt("id"));
                c.setUsername(rs.getString("username"));
                c.setPassword(rs.getString("password"));
                c.setNome(rs.getString("nome"));
                c.setCognome(rs.getString("cognome"));
                lista.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
