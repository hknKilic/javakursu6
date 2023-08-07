package Gün33._02_Inheritance;

public class HayvanatBahcesi {

    public static void main(String[] args) {

        Kedi kedi1=new Kedi("siyah",2,"tekir");
        System.out.println("kedi1="+kedi1);
        kedi1.konustu();

        Köpek köpek1=new Köpek("gri",5,"doberman");
        System.out.println("köpek1="+köpek1);
        köpek1.konustu();

        Yılan yılan1=new Yılan("sarı",13,"kobra",8);
        System.out.println("yılan1="+yılan1);
        yılan1.konustu();

        Ördek ördek1=new Ördek("yesil",11,"yaban ördegi",4);
        System.out.println("ördek1="+ördek1);
        ördek1.konustu();
    }
}
