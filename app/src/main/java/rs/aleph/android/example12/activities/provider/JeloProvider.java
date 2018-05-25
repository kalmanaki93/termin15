package rs.aleph.android.example12.activities.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.activities.model.Jelo;
import rs.aleph.android.example12.activities.model.Kategorija;
import rs.aleph.android.example12.activities.model.Sastojak;

public class JeloProvider {

    public static List<Jelo> getJelo() {
        Kategorija k1 = new Kategorija(0, "dorucak");
        Kategorija k2 = new Kategorija(1, "rucak");
        Kategorija k3 = new Kategorija(2, "vecera");

        List<Sastojak> sastojci = new ArrayList<>();
        Sastojak s1 = new Sastojak(0,"meso i kajmak");
        Sastojak s2 = new Sastojak(1,"meso i pomfrit");
        Sastojak s3 = new Sastojak(2,"sunka,sir,kecap,pavlaka");
        sastojci.add(s1);
        sastojci.add(s2);
        sastojci.add(s3);



        List<Jelo> jela = new ArrayList<>();

        Jelo j1 = new Jelo(0,"cevapi.jpg","cevapi","Sarajevski cevapi",k1,null,150,300);
        Jelo j2 = new Jelo(1,"karadjordjeva.jpeg","karadjordjeva sa pomfritom i kajmakom","124455",k2,null,214,352);
        Jelo j3 = new Jelo(2,"pizza.jpeg","pizza","porodicna pizza",k3,null,78,580);





        }
}
