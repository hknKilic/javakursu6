package Gün34._04_Protecdet._02_Paket;

import Gün34._04_Protecdet._01_Paket.P1Hayvan;

public class p2Main {
    public static void main(String[] args) {

        P1Hayvan p1h = new P1Hayvan();
        p1h.ad = "karakedi 2"; // public
        // yas default
        // cinsi protected

        P2Kedi p2k = new P2Kedi("", "");

    }
}

