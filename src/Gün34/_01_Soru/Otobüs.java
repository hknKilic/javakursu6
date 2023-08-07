package Gün34._01_Soru;

public class Otobüs extends Araç{

    private int yolcuKapasitesi;
    public Otobüs(String renk, double motorHaacmi, String marka,int yolcuKapasitesi) {
        super(renk, motorHaacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString(){
        return super.toString()+",yolcuKapasitesi:"+this.yolcuKapasitesi;
    }
}
