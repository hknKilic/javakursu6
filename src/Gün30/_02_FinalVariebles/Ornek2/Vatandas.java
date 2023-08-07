package Gün30._02_FinalVariebles.Ornek2;

public class Vatandas {

    String isim;
    String adres;
    final int TcNo;

    private static int TcNoSayac=1;

    public Vatandas(String isim,String adres){
        this.isim=isim;
        this.adres=adres;
        this.TcNo=TcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", TcNo=" + TcNo +
                '}';
    }
}
