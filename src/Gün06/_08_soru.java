package Gün06;

import java.util.Scanner;

public class _08_soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("adSoyad giriniz=");
        String adSoyad= oku.nextLine();// ismet temur

        char ilkHarf=adSoyad.charAt(0);//I

        int boslukIndex=adSoyad.indexOf(" ");
        char soyadİlkHarf=adSoyad.charAt(boslukIndex+1);

        System.out.println(ilkHarf+"."+soyadİlkHarf+".");







    }
}
