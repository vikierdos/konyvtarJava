package hu.szamalk;

import hu.szamalk.model.Konyv;
import hu.szamalk.model.Konyvtar;

import java.util.ArrayList;
import java.util.List;

public class KonyvtarProgram {
    Konyvtar k = new Konyvtar();
    public KonyvtarProgram() {
        k.ujKonyv(new Konyv("cim1", "szerzo1",2000,2000,true));
        k.ujKonyv(new Konyv("nem kölcsönözhető2", "szerzo2",1995,3000,false));

        List<String> szerzoList = new ArrayList<>();
        szerzoList.add("szerzo3");
        szerzoList.add("szerzo3-2");
        k.ujKonyv(new Konyv("nem kölcsönözhető3", szerzoList,1789,10000,false));
        szerzoList.clear();
        szerzoList.add("szerzo4");
        szerzoList.add("szerzo4-2");
        szerzoList.add("szerzo4-3");
        szerzoList.add("szerzo4-4");
        k.ujKonyv(new Konyv("cim4", szerzoList,2020,4550));
    }

    public void run(){
        System.out.println("Kölcsönözhető könyvek:");
        System.out.println(kolcsonozhetoKonyvek());
        System.out.println("Legdrágább könyv:");
        System.out.println(legDragabb().toString());
        System.out.println("Van-e kölcsönözhető 2000-es kiadásu könyv?");
        System.out.println(kolcsonozhetoKetezres());
    }

    public String kolcsonozhetoKonyvek(){
        String txt = "";
        for (Konyv konyv : k.getKonyvek()) {
            if(konyv.isKolcsonozheto()){
                txt+="\n" + konyv;
            }
        }

        return txt;
    }

    public Konyv legDragabb(){
        int ldragabb = 0;
        for (int i = 1; i < k.getKonyvek().size(); i++) {
            if(k.getKonyvek().get(i).getAr() > k.getKonyvek().get(ldragabb).getAr()){
                ldragabb = i;
            }
        }

        return k.getKonyvek().get(ldragabb);

    }

    public boolean kolcsonozhetoKetezres(){
        boolean vanE = false;
        int i = 0;
        while(i >= 0 && i < k.getKonyvek().size() && !(k.getKonyvek().get(i).getEv() == 2000 && k.getKonyvek().get(i).isKolcsonozheto())){
            i++;
        }
        vanE = i < k.getKonyvek().size();
        return vanE;
    }
}
