package hu.szamalk.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Konyv {
    private String cim;
    private List<String> szerzok;
    private int ev, ar;
    private boolean kolcsonozheto;

    public Konyv(String cim, List<String> szerzok, int ev, int ar, boolean kolcsonozheto) {
        this.cim = cim;
        this.szerzok = szerzok;
        this.ev = ev;
        this.ar = ar;
        this.kolcsonozheto = kolcsonozheto;
    }

    public Konyv(String cim, List<String> szerzok, int ev, int ar) {
        this(cim,szerzok,ev,ar,true);
    }

    public Konyv(String cim, String szerzo, int ev, int ar, boolean kolcsonozheto) {
        List<String> szerzok = new ArrayList<>();
        szerzok.add(szerzo);
        this(cim,szerzok,ev,ar,kolcsonozheto);
    }

    public Konyv(String cim, String szerzo, int ev, int ar) {
        this(cim,szerzo,ev,ar,true);
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "cim='" + cim + '\'' +
                ", szerzok=" + szerzok +
                ", ev=" + ev +
                ", ar=" + ar +
                ", kolcsonozheto=" + kolcsonozheto +
                '}';
    }

    public String getCim() {
        return cim;
    }

    public List<String> getSzerzok() {
        return Collections.unmodifiableList(szerzok);
    }

    public int getEv() {
        return ev;
    }

    public int getAr() {
        return ar;
    }

    public boolean isKolcsonozheto() {
        return kolcsonozheto;
    }

    public void nemKolcsonozheto() {
        this.kolcsonozheto = false;
    }
    public void igenKolcsonozheto() {
        this.kolcsonozheto = true;
    }


}
