package Gün36._05_Interface;

public class Test implements IGosterir,IYazdirir {
    @Override
    public void goster() {
        System.out.println("gösterdi");
    }

    @Override
    public void yazdir(String msg) {
        System.out.println("yazdirdi");

    }

    @Override
    public void yaz() {
        System.out.println("yazdirildi");

    }

    @Override
    public int yazdirmaSayisiGoster() {
        int sayfaSayisi=5;
        return sayfaSayisi;
    }
}
