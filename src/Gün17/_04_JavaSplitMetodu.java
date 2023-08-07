package Gün17;

public class _04_JavaSplitMetodu {

    public static void main(String[] args) {

        //karakter ve karslıgı gelen harf sistemine ascii tablosu denir.

        int sayi=65;
        System.out.println("sayi="+sayi);

        char harf=(char)65;
        System.out.println("harf="+harf);

        //ascii tablosunu

        for (int i = 0; i <255 ; i++) {
            harf=(char) i;
            System.out.println(i+"nolu harf="+harf);
        }



    }
}
