package Gün34._02_Soru;

public class IlkOgrencisi extends Ogrenci {

    private String klup;

    public IlkOgrencisi(String isim,String klup) {
        super(isim, OgrTip.ILK);
        setKlup(klup);

    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return super.toString()+","+this.klup;
    }
}
