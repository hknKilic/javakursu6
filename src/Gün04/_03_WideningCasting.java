package Gün04;

public class _03_WideningCasting {
    public static void main(String[] args) {

        // 1. kücük alanı-<büyüge atılabiliyor(genisleme-widening)
        //byte-short-int-long-floot-double

        int sayı=9;
        long toplam=6700;
        double oran=3.2;

        oran=sayı; // int->double
        System.out.println("oran="+oran); //veri kaybı yok

        toplam=sayı; // int->long
        System.out.println("toplam="+toplam); //veri kaybı yok

        oran=toplam; //long->double
        System.out.println("oran="+oran); //veri kaybı yok

    }
}
