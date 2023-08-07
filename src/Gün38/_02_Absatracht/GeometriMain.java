package Gün38._02_Absatracht;

public class GeometriMain {


    public static void main(String[] args) {

        Diktorgen d=new Diktorgen(5,4);
        d.setName("Yeni Diktorgen");
        d.ciz();
        System.out.println(d);
        System.out.println("----------");

        Daire dr=new Daire(4);
        dr.setName("Yeni Daire");
        dr.ciz();
        System.out.println(dr);
    }
}
