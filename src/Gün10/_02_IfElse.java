package Gün10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı= oku.nextInt();

        int kalan=sayı%2;
        //ciftler 0(2468....-2-4-6-8),  tekler 1(1357 ve ya -1-3-5-7-9...)

        if (kalan==0)
            System.out.println("çift");
        else // 0 degilken 1 ya da -1 durumunda
            System.out.println("tek");




    }
}
