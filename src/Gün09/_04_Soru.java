package Gün09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı giriniz=");
        int sayı= oku.nextInt();

        //eger sayı 2 ye bölümünden kalan var ise tektir.

        if (sayı%2==1)
            System.out.println("tek=");

        if (sayı%2==0)
            System.out.println("cift=");

    }
}
