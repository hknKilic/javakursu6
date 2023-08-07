package Gün09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Cümle Giriniz=");
        String cümle= oku.nextLine();

        cümle=cümle.toLowerCase();

        if (cümle.contains("a"))
            System.out.println("VAR");

        if (!cümle.contains("a"))
            System.out.println("YOK");




    }
}
