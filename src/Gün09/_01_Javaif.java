package Gün09;

import java.util.Scanner;

public class _01_Javaif {
    public static void main(String[] args) {

        //bakalava dilimi if
        // girilen bir sayı 10 dan büyük ise ekrana 10 dan büyük yazdırınız
        //1-basla
        //2-sayı oku  sayı=oku.nextInt()
        //3-sayı>10 ise "10 dan büyük"yaz if(sayı>10)
        //4-Dur


        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı=");
        int sayı= oku.nextInt();

        if (sayı>10) {//normal parantez sart.
            System.out.println("10 dan büyük=");
            System.out.println("if deyimi kullanıldı=");
        }

        }


}
