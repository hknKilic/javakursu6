package Gün16;

import java.util.Scanner;

public class _06_JavaArray {

    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[]tvler={"trt","atv","show","habertürk"};
        int rndIndex=(int) (Math.random()* tvler.length);
        System.out.println("rasgele secilen tv="+tvler[rndIndex]);


    }
}
    // TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
   // TODO : fakat bir buldunu tekrar bulmasın