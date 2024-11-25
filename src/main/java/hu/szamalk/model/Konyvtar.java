package hu.szamalk.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Konyvtar {
    private List<Konyv> konyvek;
    public Konyvtar() {
        konyvek = new ArrayList<>();
    }

    public Konyvtar(List<Konyv> konyvek) {
        this.konyvek = konyvek;
    }

    public void ujKonyv(Konyv konyv) {
        konyvek.add(konyv);
    }

    public Konyv kolcsonoz(Konyv konyv){
        return new Konyv("a","a",1,1);
    }
    public Konyv kolcsonoz(int i){
        return new Konyv("a","a",1,1);
    }

    public List<Konyv> getKonyvek() {
        return Collections.unmodifiableList(konyvek);
    }



    @Override
    public String toString() {
        return "Konyvtar{" +
                "konyvek=" + konyvek +
                '}';
    }
}
