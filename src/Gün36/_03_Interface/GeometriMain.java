package Gün36._03_Interface;

public class GeometriMain {

    public static void main(String[] args) {

        Cember c=new Cember();
        c.ciz();

        Diktorgen d=new Diktorgen();
        d.ciz();

        Icizdirir c2=new Cember();
        c2.ciz();

        cizdir(c);
        cizdir(d);
    }

public static void cizdir(Icizdirir g){
        g.ciz();
}
}

    //interface lerden nesne üretilemez fakat referans tipi
    // oluşturulabilir. bu bize Polymorphism sağladı.
    // çember çizildi
   // direk olarak sadece Interface deki
   // ismi verilmiş olanlar metodlara erişebiirsin
