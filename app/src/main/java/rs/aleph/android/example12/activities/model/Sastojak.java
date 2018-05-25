package rs.aleph.android.example12.activities.model;

public class Sastojak {
    private int id;
    private String nazivSastojka;

    Jelo jelo;

    public Sastojak(){

    }

    public Sastojak(int id, String nazivSastojka) {
        this.id = id;
        this.nazivSastojka = nazivSastojka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }

    @Override
    public String toString() {
        return "Sastojci{" +
                "id=" + id +
                ", nazivSastojka='" + nazivSastojka + '\'' +
                '}';
    }
}
