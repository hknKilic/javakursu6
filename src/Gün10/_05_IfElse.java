package Gün10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz=");
        String cümle= oku.nextLine();

        if (cümle.length()>10&& cümle.toLowerCase().contains("study"))
            System.out.println("EVET");
        else
            System.out.println("HAYIR");



    }
}
