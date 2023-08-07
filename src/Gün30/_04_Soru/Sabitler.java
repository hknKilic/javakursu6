package Gün30._04_Soru;

public class Sabitler {
    final static int birGundekiSaatSaiyisi= 24;
    final static int birSaattekiDakikaSaiyisi= 60;
    final static int birDakikadakiSaniyeSayisi= 60;

    public static int hesapla(int gün, int saat, int dak) {
        int toplamSaniye = gün
                * Sabitler.birGundekiSaatSaiyisi
                * Sabitler.birSaattekiDakikaSaiyisi
                * Sabitler.birDakikadakiSaniyeSayisi
                + saat
                * Sabitler.birSaattekiDakikaSaiyisi
                * Sabitler.birDakikadakiSaniyeSayisi
                + dak
                * Sabitler.birDakikadakiSaniyeSayisi;

        return toplamSaniye;

    }


}