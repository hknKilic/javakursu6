package Gün05;

import java.util.Scanner;

public class _04_ornek {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("adınızı giriniz");
        String ad=oku.nextLine();

        System.out.print("soyadınızı giriniz");
        String soyad=oku.nextLine();

        System.out.println("ad="+ad);
        System.out.println("soyad="+soyad);
        System.out.println("Adınız ve Soyadınız="+ad+soyad);



    }
}
