package Gün04;

import java.util.Scanner;

public class _05_ornek {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("sayı1=");
        int sayı1= oku.nextInt();

        System.out.print("sayı2=");
        int sayı2= oku.nextInt();

        int toplam=sayı1+sayı2;

        System.out.println("toplam="+toplam);



    }
}
