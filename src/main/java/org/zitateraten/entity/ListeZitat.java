package org.zitateraten.entity;

import java.util.ArrayList;
import java.util.Random;

public class ListeZitat extends ErzeugerListe{

    private ArrayList<Zitat> listeZitat = new ArrayList<>();

    public ListeZitat(){
        listeZitat = ErzeugerListe.erzeugeListe();
    }

    public void spielen() throws InterruptedException{
        Random zufallszahl = new Random();
        int counter = listeZitat.size()-1;

        ausgebenLinie(100);
        System.out.println("Zitateraten");
        ausgebenLinie(100);
        while (counter >= 0){

            int indexListe = zufallszahl.nextInt(0,counter+1);
            System.out.printf("Von wem stammt das Zitat:\n%s",
            listeZitat.get(indexListe).getSpruch());

            System.out.println();
            Thread.sleep(3000);

            for(int i = 5; i>0; i--){
                System.out.print(i + "\t");
                Thread.sleep(1000);
            }


            System.out.println("\nAntwort:\n" + listeZitat.get(indexListe).getUrheber()+ "\n");
            ausgebenLinie(100);

            listeZitat.remove(listeZitat.get(indexListe));
            if(--counter >= 0) {
                Thread.sleep(3000);
            } else {
                Thread.sleep(1000);
            }
        }
        System.out.println("Spiel beendet.");
        ausgebenLinie(100);
        zufallszahl = null;

    }

    public void ausgebenLinie(int x){
        for(int i = 0; i < x; i++){
            System.out.print("~");
        }
        System.out.println();
    }

    public ArrayList<Zitat> getListeZitat() {
        return listeZitat;
    }
}
