package Gün09;

import java.util.Scanner;

public class _01_soru {
    public static void main(String[] args) {

        //girilen bir sayının tek sayı olup olmadıgını yazdırınız.
        //true ya da false

        //024681012
        //135791113

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı=");
        int sayı= oku.nextInt();

        int kalan=sayı%2; //1 ise tektir
        boolean tekMi=(kalan==1);

        System.out.println("tekMi="+tekMi);





    }
}
