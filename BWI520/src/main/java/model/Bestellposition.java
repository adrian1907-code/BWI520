package model;

public class Bestellposition {
    private int id;
    private int bestellungId;
    private int produktId;
    private int anzahl;

    public Bestellposition() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getBestellungId() { return bestellungId; }
    public void setBestellungId(int bestellungId) { this.bestellungId = bestellungId; }
    public int getProduktId() { return produktId; }
    public void setProduktId(int produktId) { this.produktId = produktId; }
    public int getAnzahl() { return anzahl; }
    public void setAnzahl(int anzahl) { this.anzahl = anzahl; }
}
