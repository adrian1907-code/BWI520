package dao;

import model.Benutzer;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BenutzerDAO {
    public void insert(Benutzer b) throws SQLException {
        String sql = "INSERT INTO benutzer (name, email, passwort) VALUES (?, ?, ?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, b.getName());
            ps.setString(2, b.getEmail());
            ps.setString(3, b.getPasswort());
            ps.executeUpdate();
            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) b.setId(keys.getInt(1));
            }
        }
    }

    public List<Benutzer> findAll() throws SQLException {
        List<Benutzer> list = new ArrayList<>();
        String sql = "SELECT * FROM benutzer";
        try (Connection c = DBConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Benutzer b = new Benutzer();
                b.setId(rs.getInt("id"));
                b.setName(rs.getString("name"));
                b.setEmail(rs.getString("email"));
                b.setPasswort(rs.getString("passwort"));
                list.add(b);
            }
        }
        return list;
    }
}
