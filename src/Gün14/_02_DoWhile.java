package Gün14;

import java.util.Scanner;

public class _02_DoWhile {

    public static void main(String[] args) {

        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("ifade giriniz=");
        String girilen= oku.next();

        while (!girilen.equalsIgnoreCase("x"))
        {

            System.out.println("program calısıyor");
            System.out.println("ifade giriniz=");
            girilen= oku.next();


        }
        System.out.println("program bitti");




    }
}
