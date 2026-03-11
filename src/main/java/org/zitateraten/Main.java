package org.zitateraten;

import org.zitateraten.entity.ListeZitat;
import org.zitateraten.entity.Zitat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {
        ListeZitat neueListe = new ListeZitat();

        neueListe.spielen();
    }
}
