package Gün39._03_Soru;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("mama ve balık yerler");

    }

    @Override
    void yemekMiktari() {
        System.out.println("100 gr");

    }

    @Override
    void günlükUykuSuresi() {
        System.out.println("16 saat");

    }

    @Override
    void sesi() {
        System.out.println("miyav miyav");

    }
}
