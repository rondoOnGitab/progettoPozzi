package main.java.com.example.demo.DAO;

import com.example.demo.DAO.DbConnection;
import com.example.demo.DTO.adminDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class adminDAO {

    public void inserisci(String username, String password, String email) {
        String query = "INSERT INTO admin (username, password, email) VALUES (?, MD5(?), ?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password); // la crittografia avviene nel DB
            stmt.setString(3, email);

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public adminDTO login(String username, String password) {
        String query = "SELECT * FROM admin WHERE username = ? AND password = MD5(?)";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                adminDTO a = new adminDTO();
                a.setId(rs.getInt("id"));
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("password"));
                a.setEmail(rs.getString("email"));
                return a;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<adminDTO> getAllAdmin() {
        List<adminDTO> lista = new ArrayList<>();
        String query = "SELECT * FROM admin";

        try (Connection conn = DriverManager.getConnection(DbConnection.URL, DbConnection.USER, DbConnection.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                adminDTO a = new adminDTO();
                a.setId(rs.getInt("id"));
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("password"));
                a.setEmail(rs.getString("email"));
                lista.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
