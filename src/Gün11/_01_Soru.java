package Gün11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayıları aralarında bir bosluk olarak giriniz=");
        String sayılar= oku.nextLine();

        int boslukIndex=sayılar.indexOf(" ");
        String strSayı1=sayılar.substring(0,boslukIndex);//45 sayı görünümlü string
        String strSayı2=sayılar.substring(0,boslukIndex+1);//657 sayı görünümlü string

        int sayı1=Integer.parseInt(strSayı1);
        int sayı2=Integer.parseInt(strSayı2);

        if (sayı1==sayı2)
            System.out.println("Esit mi");
        else
            System.out.println("Esit Degil");








    }

}
