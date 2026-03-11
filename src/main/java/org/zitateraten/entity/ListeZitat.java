package org.zitateraten.entity;

import org.zitateraten.Main;
import java.util.ArrayList;
import java.util.Random;

/**
 * Liste mit den Zitaten sowie Spielablauf
 * <p>
 *     Die Zitate in der Liste werden durch die vererbte Methode {@link ErzeugerListe#erzeugeListe()} eingelesen.
 *     Beinhaltet den Spielverlauf, in welchem Zitate nacheinander gezeigt werden.
 *     Anzahl der Runden wird in der {@link Main} durch den Parameter bestimmt
 * </p>
 */

public class ListeZitat extends ErzeugerListe{

    private ArrayList<Zitat> listeZitat = new ArrayList<>();

    /**
     * Füllt listeZitat mit Zitaten
     */
    public ListeZitat(){
        listeZitat = ErzeugerListe.erzeugeListe();
    }

    /**
     * Gibt nacheinander die Zitate aus. In einer Runde wird jedes Zitat nur einmalig Gezeigt
     * @param anzahlRunden Bestimmt, wie viele Zitate gezeigt werden soll. 0 = alle Zitate
     * @throws InterruptedException Für checked Exception Thread.sleep()
     */
    public void spielen(int anzahlRunden) throws InterruptedException{
        /*
         *Initialisierung
         */
        Random zufallszahl = new Random();
        int counter;
        ausgebenLinie(100);
        System.out.println("Zitateraten");
        ausgebenLinie(100);

        /*
         * Legt die Anzahl der angezeigten Zitate fest
         */
        if(anzahlRunden == 0){      // Alle Zitate werden angezeigt
            System.out.println("Es werden alle Zitate angezeigt.");
            counter = listeZitat.size()-1;
        } else {
            if(anzahlRunden > listeZitat.size()){   // Wenn mehr Runden als Zitate vorhanden, dann alle Zitate zeigen
                System.out.println("Leider gibt es nur " + listeZitat.size() + " Zitate.");
                counter = listeZitat.size()-1;
            } else {    // Anzahl Runden auf Parameter anzahlRunden beschränken
                System.out.println("Okay, es werden " + anzahlRunden + " gespielt.");
                counter = anzahlRunden-1;
            }

        }

        /*
         * Rundenwiederholer - Anzeige der Zitate + Auflösung
         */

        while (counter >= 0){

            // Zitat ausgeben
            int indexListe = zufallszahl.nextInt(0,counter+1);
            System.out.printf("Von wem stammt das Zitat:\n%s",
            listeZitat.get(indexListe).getSpruch());

            // Pause, um Zitat lesen zu können
            System.out.println();
            Thread.sleep(5000);     // 5 sek

            // 5 Sekunden rückwärts zählen
            for(int i = 5; i>0; i--){
                System.out.print(i + "\t");
                Thread.sleep(1000);
            }

            // Antwort ausgeben
            System.out.println("\nAntwort:\n" + listeZitat.get(indexListe).getUrheber()+ "\n");
            ausgebenLinie(100);

            // Zitat aus Liste entfernen, dass es nicht nochmal in der Runde drankommt
            listeZitat.remove(listeZitat.get(indexListe));
            if(--counter >= 0) {
                Thread.sleep(3000);     // 3 Sek vor neuem Zitat
            } else {
                Thread.sleep(1000);     // 1 Sekunde vor Spielende
            }
        }

        // Spielende
        System.out.println("Spiel beendet.");
        ausgebenLinie(100);
        zufallszahl = null;

    }

    /**
     * Gibt nebeneinander Trennzeichen für bessere Optik aus
     * @param anzahlTrennzeichen
     */
    public void ausgebenLinie(int anzahlTrennzeichen){
        for(int i = 0; i < anzahlTrennzeichen; i++){
            System.out.print("~");
        }
        System.out.println();
    }

    /**
     * Getter für die Liste mit den Zitaten an die Hauptmethode Main
     * @see Main#main()
     */
    public ArrayList<Zitat> getListeZitat() {
        return listeZitat;
    }
}
