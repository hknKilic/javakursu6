package Gün11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {

        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz=");
        int sayı= oku.nextInt();

        System.out.println(sayı==0?"sıfır":sayı>0?"pozitif":"negatif");






    }
}
