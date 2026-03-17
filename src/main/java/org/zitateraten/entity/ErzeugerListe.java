package org.zitateraten.entity;

import java.util.ArrayList;

/**
 * Klasse zum Hinzufügen neuer Zitate
 * <p>
 *     Diese Klasse ähnelt dem Simple Factory Pattern. Hier können Zitate ohne viel Aufwand
 *     hinzugefügt werden, ohne dass es die Geschäftslogik beeinflusst.
 * </p>
 */
public class ErzeugerListe {

    /**
     * Die Methode wird von der Subklasse {@link ListeZitat} aufgerufen
     * @return ArrayList Mit Zitaten gefüllte Liste
     */
    public static ArrayList<Zitat> erzeugeListe(){
        ArrayList<Zitat> zitatListe = new ArrayList<>();

        // Hier neue Zitate hinzufügen: Spruch : String, Urheber : String
        zitatListe.add(new Zitat("Mailand oder Madrid, Hauptsache Italien", "Andreas Möller"));
        zitatListe.add(new Zitat("How much is the fish?", "H.P Baxxter"));
        zitatListe.add(new Zitat("Gott ist tot!", "Nietzsche"));
        zitatListe.add(new Zitat("Der Weg ist das Ziel.", "Konfuzius"));
        return zitatListe;
    }
}
