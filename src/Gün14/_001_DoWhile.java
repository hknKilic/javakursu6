package Gün14;

import java.util.Scanner;

public class _001_DoWhile {
    public static void main(String[] args) {

        // kullanıcı 0 değeri girene kadar,
        // girdiği sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayi;


        do { // bu döngü en az bir kez calısır!
            System.out.println("sayı giriniz=");
            sayi= oku.nextInt();

            toplam=toplam+sayi;

        }while (sayi!=0);

        System.out.println("toplam="+toplam);


    }
}
