package Gün38._01_Absatracht;

public class Ford extends BinekOto{

    public Ford(String marka, int uretimYili, int vitesAdedi, int hizlanmaSuresi) {
        super(marka, uretimYili, vitesAdedi, hizlanmaSuresi);
    }

    @Override
    int hizlanmaSuresi() {
        return 0;
    }
}
