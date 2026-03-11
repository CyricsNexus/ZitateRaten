package org.zitateraten.entity;

import java.util.ArrayList;

public class ErzeugerListe {

    public static ArrayList<Zitat> erzeugeListe(){
        ArrayList<Zitat> zitatListe = new ArrayList<>();

        zitatListe.add(new Zitat("Mailand oder Madrid, Hauptsache Italien", "Andreas Möller"));
        zitatListe.add(new Zitat("How much is the fish?", "H.P Baxxter"));


        return zitatListe;
    }
}
