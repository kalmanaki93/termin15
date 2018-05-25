package rs.aleph.android.example12.activities.model;

import java.util.ArrayList;
import java.util.List;

public class Kategorija {

    private int id;
    private String nazivKategorije;
    private List<Jelo>jela ;

    public Kategorija(){
        jela = new ArrayList<>();

    }

    public Kategorija(int id, String nazivKategorije) {
        this.id = id;
        this.nazivKategorije = nazivKategorije;

        jela = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivKategorije() {
        return nazivKategorije;
    }

    public void setNazivKategorije(String nazivKategorije) {
        this.nazivKategorije = nazivKategorije;
    }

    public void addJelo(Jelo jelo) {

        jela.add(jelo);
    }

    public void removeJelo(Jelo jelo) {

        jela.remove(jelo);
    }



    @Override
    public String toString() {
        return "Kategorija{" +
                "id=" + id +
                ", nazivKategorije='" + nazivKategorije + '\'' +
                '}';
    }
}
