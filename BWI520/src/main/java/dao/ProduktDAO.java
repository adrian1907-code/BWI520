package dao;

import model.Produkt;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProduktDAO {
    public List<Produkt> findAll() throws SQLException {
        List<Produkt> list = new ArrayList<>();
        String sql = "SELECT * FROM produkte";
        try (Connection c = DBConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Produkt p = new Produkt();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPreis(rs.getDouble("preis"));
                p.setBeschreibung(rs.getString("beschreibung"));
                list.add(p);
            }
        }
        return list;
    }
}
