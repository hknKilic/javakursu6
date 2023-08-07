package Gün12;

import java.util.Scanner;

public class _04_IfElseIf {

    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        Scanner okustr=new Scanner(System.in);

        System.out.println("sayı1=");
        int sayı1= oku.nextInt();

        System.out.println("sayı2=");
        int sayı2= oku.nextInt();

        System.out.println("Toplama icin T");
        System.out.println("Çıkarma icin Ç");
        System.out.println("Çarpma icin P");
        System.out.println("Bölme icin B");
        System.out.println("secimimiz=");
        String secim= oku.next();

        if (secim.equalsIgnoreCase("T"))
            System.out.println("toplam="+(sayı1+sayı2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("cıkarma="+(sayı1-sayı2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("Çarpma="+(sayı1*sayı2));
                else
                    if(secim.equalsIgnoreCase("B"))
                        System.out.println("Bölme="+(sayı1/sayı2));
                    else
                        System.out.println("Hatalı giris");







    }
}
