package Gün10;

import java.util.Scanner;

public class _03_Mantıksalİfadeler {
    public static void main(String[] args) {

        //Mantıksal İfadeler(Logic Statement)
        // && ve isareti
        //  || veya isareti

        Scanner oku=new Scanner(System.in);

        System.out.println("Sayı=");
        int sayı= oku.nextInt();

        int kalan=sayı%2;

        if (kalan==1||kalan==-1) // 1 ve ya -1 ken
            System.out.println("tek");
        else
            System.out.println("cift");
    }
}
