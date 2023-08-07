package Gün39._03_Soru;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("et yer");

    }

    @Override
    void yemekMiktari() {
        System.out.println("10 kg yer");

    }

    @Override
    void günlükUykuSuresi() {
        System.out.println("7 saat uyur");

    }

    @Override
    void sesi() {
        System.out.println("ciyakkkk der");

    }
}
