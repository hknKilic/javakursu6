package Gün10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("sifre=");
        String sifre= oku.nextLine();

        if (sifre.length()>=8 && sifre.length()<12 &&
                !sifre.toLowerCase().contains("pass"))
            System.out.println("kurallara uygun");
        else
            System.out.println("sifreniz kurallara uygun degil");

    }
}
