package Gün08;

import java.util.Scanner;

public class _08_soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("Birinci Sayı =");
        int sayı1=oku.nextInt();

        System.out.println("ikinci sayı=");
        int sayı2= oku.nextInt();

        System.out.println("esit mi="+(sayı1==sayı2));
    }
}
