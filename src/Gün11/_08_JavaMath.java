package Gün11;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {

        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.println("a degeri=");
        int a= oku.nextInt();

        System.out.println("b degeri=");
        int b= oku.nextInt();

        System.out.println("c degeri=");
        int c= oku.nextInt();

        // a,b->enAB C,
        int enbABden=Math.max(a,b);
        int enb=Math.max(enbABden,c);

        //2.yol
        System.out.println(Math.max(c,Math.max(a,b)));



    }
}
