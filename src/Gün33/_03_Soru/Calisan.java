package Gün33._03_Soru;
public class Calisan {
    private String isim;
    private double maas;
    private double maaskatSayisi;
    public Calisan(String isim, double maas, double maaskatSayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaaskatSayisi(maaskatSayisi);
    }
public double maasHesapla(){
        return this.maas*this.maaskatSayisi;
}
    @Override
    public String toString() {
        return "Bordro{" +
                "\nisim='" + this.isim +
                "\n maas=" + this.maas +
                "\nmaaskatSayisi=" + this.maaskatSayisi +
                "\nÖdenecek Maaş="+maasHesapla()
                ;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaaskatSayisi() {
        return maaskatSayisi;
    }

    public void setMaaskatSayisi(double maaskatSayisi) {
        this.maaskatSayisi = maaskatSayisi;
    }
}


