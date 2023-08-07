package Gün34._02_Soru;

public class LiseOgrencisi extends Ogrenci {

    private String brans;

    public LiseOgrencisi(String isim,String brans) {
        super(isim,OgrTip.LİSE);
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
