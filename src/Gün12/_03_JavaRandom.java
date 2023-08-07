package Gün12;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {

        //  (int)(Math.Random()*10)  -> 0-9 arası üretir, 0-20  0-100
        //  20-30 arası random sayı ?   min birde max lazım, alt sınır ve üst sınır
        // Girilen min ve max aralığında random sayı üreten programı yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("min(alt Sınır)=");
        int min= oku.nextInt();

        System.out.println("max(üst Sınır)=");
        int max= oku.nextInt();

        int rndSayı=(int)(Math.random()*(max-min))+min;
        System.out.println("rndSayı="+rndSayı);



    }

}
