package Gün13;

import java.util.Scanner;

public class _05_WhileLoop {

    public static void main(String[] args) {

        //Girilen  5 sayının toplamının sonucunu yazdırınız

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;

        while (sayac<=5){

            System.out.println("sayı giriniz=");
            int sayı= oku.nextInt();
            toplam=toplam+sayı;

            sayac++;


            System.out.println("toplam="+toplam);

        }



    }
}
