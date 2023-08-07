package Gün09;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

        //girilen iki sayıdan büyük olanını ekrana yazdırınız.
        //esit ise esit yaz

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı1=");
        int sayı1= oku.nextInt();

        System.out.println("sayı2=");
        int sayı2= oku.nextInt();

        if (sayı1>sayı2)
            System.out.println("sayı1 büyük=");
        if (sayı1<sayı2)
            System.out.println("sayı2 büyük=");
        if (sayı1==sayı2)
            System.out.println("esit=");

    }
}
