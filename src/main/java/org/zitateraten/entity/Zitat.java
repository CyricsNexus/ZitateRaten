package org.zitateraten.entity;

public class Zitat {

    private String spruch;
    private String urheber;


    public Zitat(String spruch, String urheber) {
        this.spruch = spruch;
        this.urheber = urheber;
    }

    public String getSpruch() {
        return spruch;
    }

    public String getUrheber() {
        return urheber;
    }
}
