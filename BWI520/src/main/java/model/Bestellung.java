package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Bestellung {
    private int id;
    private int benutzerId;
    private Timestamp datum;
    private List<Bestellposition> positionen = new ArrayList<>();

    public Bestellung() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getBenutzerId() { return benutzerId; }
    public void setBenutzerId(int benutzerId) { this.benutzerId = benutzerId; }
    public Timestamp getDatum() { return datum; }
    public void setDatum(Timestamp datum) { this.datum = datum; }
    public List<Bestellposition> getPositionen() { return positionen; }
    public void setPositionen(List<Bestellposition> positionen) { this.positionen = positionen; }
}
