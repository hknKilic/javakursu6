package Gün05;

import java.util.Scanner;

public class _06_orn {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("uzun kenar=");
        int a= oku.nextInt();

        System.out.println("kısa kenar=");
        int b= oku.nextInt();

        System.out.println("cevre="+(a+b+a+b));
        System.out.println("alan="+(a*b));


    }
}
