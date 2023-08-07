package Gün05;

import java.util.Scanner;

public class _09_ornek {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("kilonuz(kg)=");
        double kilo= oku.nextDouble();

        System.out.println("boyunuz(m)=");
        double boy= oku.nextDouble();


        double vucutKitInd=kilo/(boy*boy);

        System.out.println("kilonuz="+kilo+"kg, boy=+boy+m");
        System.out.println("vucutKitle Indeksiniz="+vucutKitInd);



    }
}
