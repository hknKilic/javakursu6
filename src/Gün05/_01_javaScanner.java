package Gün05;

import java.util.Scanner;

public class _01_javaScanner {

    public static void main(String[] args) {

        Scanner okuyucu=new Scanner(System.in);

        System.out.println("sayı giriniz");
        int okunan=okuyucu.nextInt();

        System.out.println("okunan="+okunan);
        System.out.println("bitti");

    }
}
