package Gün14;

import java.util.Random;

public class _06_forLoop {

    public static void main(String[] args) {

        // 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        // 50 yi gectiginde 50 yi gectiniz.

        int toplam=0;
        boolean sinirAsildi=false;

        for (int i=0; i<=10; i=i+2){

            toplam=toplam+i;
            System.out.println("i="+i);

            if (toplam>50 && sinirAsildi==false)
                System.out.println("50 yi gecti");

            sinirAsildi=true;

        }






    }
}
