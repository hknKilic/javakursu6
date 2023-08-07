package Gün10;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı= oku.nextInt();

        if ((sayı>0)&&(sayı%2==1))
            System.out.println("uygun sayı girildi");

        else
            System.out.println("uygun sayı GİRİLMEDİ");



    }
}
