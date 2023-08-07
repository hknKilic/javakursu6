package Gün34._03_Soru;

public class LiseOgrencisi extends Ogrenci {

    private String brans;
    private static int liseSayacID=1;

    public LiseOgrencisi(String isim,String brans) {
        super(isim, OgrTip.LİSE,liseSayacID++);
        setBrans(brans);

    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return super.toString()+",branş="+this.brans;
    }


}
