package org.zitateraten;

import org.zitateraten.entity.ListeZitat;
import org.zitateraten.entity.Zitat;

/**
 * Spielstart für das Zitateraten
 * <p>
 *     Initialisiert die Liste mit den Zitaten und zeigt eine vom Benutzer bestimmte Anzahl Zitate
 *     zum Raten des Urhebers an.
 * </p>
 */

public class Main {
    /**
     * Hauptmethode des Spiels Zitate raten
     * @throws InterruptedException für Thread.sleep() in {@link ListeZitat#spielen(int)}
     */
    public static void main() throws InterruptedException {
        ListeZitat neueListe = new ListeZitat();

        // Beginnt das Spiel
        neueListe.spielen(0);   // 0 = alle Zitate ansonsten Anzahl Runden
    }
}
