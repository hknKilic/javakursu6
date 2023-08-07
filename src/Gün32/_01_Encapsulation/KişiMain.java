package Gün32._01_Encapsulation;

public class KişiMain {

    public static void main(String[] args) {

        Kişi kişi1=new Kişi();

        kişi1.setAd("hakan");
        kişi1.setSoyad("kilic");
        kişi1.yasAta(-25);

        System.out.println(kişi1.getAd());
        System.out.println(kişi1.getSoyad());
        System.out.println(kişi1.yasVer());

        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gonderme ve alma
        // işlemine Encapsulation denir.

    }
}
