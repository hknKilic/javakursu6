package Gün33._03_Soru;

public class GenelMüdür extends Calisan{

    private double tazminat;


    public GenelMüdür(String isim, double maas, double maaskatSayisi,double tazminat) {
        super(isim, maas, maaskatSayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+this.tazminat;
    }

    @Override
    public String toString() {
        return super.toString()+", tazminat="+this.tazminat;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }
}
