package Gün12;

import java.util.Scanner;

public class _02_JavaRandom {

    public static void main(String[] args) {


        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("üretilecek sayı sınırı=");
        int sınır= oku.nextInt();

        int tutulanSayı=(int) (Math.random()*sınır);
        System.out.println("tutulan sayı="+tutulanSayı);

        System.out.println("tahmininiz=");
        int tahmin= oku.nextInt();

        if (tutulanSayı==tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedin="+tutulanSayı);



    }
}
