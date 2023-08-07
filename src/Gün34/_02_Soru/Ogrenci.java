package Gün34._02_Soru;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Ogrenci {

    private int id;
    private String isim;
    private OgrTip tipi;

    private static int sayaID=1;

    public Ogrenci(String isim, OgrTip tipi) {
        setIsim(isim);
        setTipi(tipi);
        setId(sayaID++);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    public static int getSayaID() {
        return sayaID;
    }

    public static void setSayaID(int sayaID) {
        Ogrenci.sayaID = sayaID;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}
