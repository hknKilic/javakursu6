package Gün09;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Not Giriniz=");
        int not= oku.nextInt();

        if (not>=50)
            System.out.println("gectiniz=");

        if (not<50)
            System.out.println("kaldınız=");


    }
}
