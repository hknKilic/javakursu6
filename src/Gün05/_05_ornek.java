package Gün05;

import java.util.Scanner;

public class _05_ornek {
    public static void main(String[] args) {

        Scanner okuyucu=new Scanner(System.in);
        System.out.println("Karenin cevresini ve alanını girinniz=");

        System.out.println("cevresini giriniz=");

        int kenar= okuyucu.nextInt();
        int cevresi=kenar+kenar+kenar+kenar;


        System.out.println("alanını giriniz=");
        int alanı=kenar*kenar;
        int alani= okuyucu.nextInt();

        int toplam=cevresi+alani;
        System.out.println("toplam="+toplam);






    }
}
