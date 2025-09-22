package model;

public class Produkt {
    private int id;
    private String name;
    private double preis;
    private String beschreibung;

    public Produkt() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPreis() { return preis; }
    public void setPreis(double preis) { this.preis = preis; }
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
}
