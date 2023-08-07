package Gün28._05_Ornek;

import Gün29.Soru.Hesap;

public class Musteri {

    public int müsteriNo;
    public String ad;
    public String soyad;
    public Hesap musteriHesap;
    String name;
    ElektrikHesabi elektrikHesabi=new ElektrikHesabi();

    public Musteri(String name) {
        this.name = name;
    }

    public Musteri() {
    }
}
