package Gün07;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.println("Adınız ve Soyadınız=");//
        String adSoyad= oku.nextLine();

        int boslukIndex=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boslukIndex);
        String soyad=adSoyad.substring(boslukIndex+1);



        System.out.println("ad="+ad);
        System.out.println("soyad="+soyad);


    }
}
