package Gün11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı=");
        int sayı= oku.nextInt();

        if (sayı%2==0)
            System.out.println("cift");
        else
            System.out.println("tek");
        String sonuc=(sayı%2==0)?"cift":"tek";
        System.out.println(sonuc);

        //2.yol
        System.out.println(((sayı%2==0)?"cift":"tek"));




    }
}
