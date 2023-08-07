package Gün30._04_Soru;

import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {
        int gün = 0;
        int saat = 0;
        int dak = 0;

        Scanner oku = new Scanner(System.in);

        System.out.println("Gün=");
        gün = oku.nextInt();
        System.out.println("Saat=");
        saat = oku.nextInt();
        System.out.println("Dakika=");
        dak = oku.nextInt();

        int toplamSaniye = gün
                * Sabitler.birGundekiSaatSaiyisi
                * Sabitler.birSaattekiDakikaSaiyisi
                * Sabitler.birDakikadakiSaniyeSayisi
                + saat
                * Sabitler.birSaattekiDakikaSaiyisi
                * Sabitler.birDakikadakiSaniyeSayisi
                + dak
                * Sabitler.birDakikadakiSaniyeSayisi;

        System.out.println("toplamSaniye=" + toplamSaniye);
    }
}









