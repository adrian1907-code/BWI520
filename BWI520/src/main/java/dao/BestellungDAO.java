package dao;

import model.Bestellung;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BestellungDAO {
    public int insertReturnId(Bestellung b) throws SQLException {
        String sql = "INSERT INTO bestellungen (benutzer_id) VALUES (?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, b.getBenutzerId());
            ps.executeUpdate();
            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) return keys.getInt(1);
            }
        }
        return -1;
    }
}
