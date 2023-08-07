package Gün10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Notu giriniz=");
        int ogrNot= oku.nextInt();

        //1.yontem bilgisayar bos yere yoruluyor.
        if (ogrNot>=50)
            System.out.println("Gectiniz");
        if (ogrNot<50)
            System.out.println("Kaldınız");

        //2.yontem
        if (ogrNot>=50)
            System.out.println("Gectiniz");
        else //degilse
            System.out.println("Kaldınız");
    }
}
