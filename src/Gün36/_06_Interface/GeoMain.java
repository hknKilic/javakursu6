package Gün36._06_Interface;

public class GeoMain {

    public static void main(String[] args) {

        Diktorgen d=new Diktorgen();
        System.out.println(d.alan(5,6));
        System.out.println(d.cevre(5,6));

        Kare k=new Kare();
        k.alan(5);
        k.cevre(5);

        System.out.println(k.alan(5));
        System.out.println(k.cevre(5));

    }
}
