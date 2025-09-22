package dao;

import model.Bestellposition;
import util.DBConnection;

import java.sql.*;

public class BestellpositionDAO {
    public void insert(Bestellposition bp) throws SQLException {
        String sql = "INSERT INTO bestellpositionen (bestellung_id, produkt_id, anzahl) VALUES (?, ?, ?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, bp.getBestellungId());
            ps.setInt(2, bp.getProduktId());
            ps.setInt(3, bp.getAnzahl());
            ps.executeUpdate();
        }
    }
}
