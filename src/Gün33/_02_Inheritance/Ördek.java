package Gün33._02_Inheritance;

public class Ördek extends Hayvan{

    private int kanatAcikligi;
    public Ördek(String renk, int kilo, String cinsi,int kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vak vak");
    }

    @Override
    public String toString() {
        return super.toString()+"kanatAcikligi="+this.kanatAcikligi;
    }

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }
}
