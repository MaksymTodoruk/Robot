package com.ua.lesson20;

public class TranslatedMonths {
    String En;
    String Jp;
    String De;

    public TranslatedMonths(String en, String jp, String de) {
        En = en;
        Jp = jp;
        De = de;
    }

    public String getEn() {
        return En;
    }

    public void setEn(String en) {
        En = en;
    }

    public String getJp() {
        return Jp;
    }

    public void setJp(String jp) {
        Jp = jp;
    }

    public String getDe() {
        return De;
    }

    public void setDe(String de) {
        De = de;
    }

    @Override
    public String toString() {
        return "TranslatedMonths{" +
                "En='" + En + '\'' +
                ", Jp='" + Jp + '\'' +
                ", De='" + De + '\'' +
                '}';
    }
}
