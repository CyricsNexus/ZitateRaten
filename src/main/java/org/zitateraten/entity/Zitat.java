package org.zitateraten.entity;

/**
 * Entität Zitat
 */
public class Zitat {

    private String spruch;
    private String urheber;

    /**
     * Erstellung des Zitats
     * @param spruch Das Zitat selbst
     * @param urheber Der Urheber des Zitats
     */
    public Zitat(String spruch, String urheber) {
        this.spruch = spruch;
        this.urheber = urheber;
    }

    /**
     * Getter des Zitats, wird in {@link ListeZitat#spielen(int)} genutzt
     * @return das Zitat
     */
    public String getSpruch() {
        return spruch;
    }

    /**
     * Getter des Urhebers, wird in {@link ListeZitat#spielen(int)} genutzt
     * @return der Urheber des Zitats
     */
    public String getUrheber() {
        return urheber;
    }
}
