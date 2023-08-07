package Gün14;

import java.util.Scanner;

public class _01_S {
    public static void main(String[] args) {

        // kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int toplam=0;

        System.out.println("sayı giriniz=");
        int sayi= oku.nextInt();
        toplam=toplam+sayi;

        while (sayi!=0)
        {
            System.out.println("sayı giriniz=");
            sayi= oku.nextInt();
            toplam=toplam+sayi;

        }
        System.out.println("toplam="+toplam);



    }
}
