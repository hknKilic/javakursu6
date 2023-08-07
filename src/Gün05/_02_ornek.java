package Gün05;

import java.util.Scanner;

public class _02_ornek {
    public static void main(String[] args) {

        // Girilen bir adı ekrana yazdırınız.
        Scanner okuyucu=new Scanner(System.in);
        System.out.println("isim giriniz=");
        String okunanIsım=okuyucu.next();

        System.out.println("okunanİsim="+okunanIsım);
        System.out.println("bitti");
    }
}
