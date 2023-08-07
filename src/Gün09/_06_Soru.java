package Gün09;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Cümle giriniz=");
        String cümle= oku.nextLine();

        boolean varMi=cümle.contains("a");

        if (varMi==true);
        System.out.println("EVET");

        if (varMi==false);
        System.out.println("HAYIR");

        //2.YOL
        if (cümle.contains("a")==true)
            System.out.println("EVET");
        if (cümle.contains("a")==false)
            System.out.println("HAYIR");

        //3.yol
        if (cümle.contains("a"))
            System.out.println("EVET");
        if (!cümle.contains("a"))  // icerisinde a geciyor DEGİLSE (!)
            System.out.println("HAYIR");
        //alternatif
        cümle.contains("a");
        cümle.indexOf("a");
        if (cümle.indexOf("a")>=0)
            System.out.println("EVET");
        if (cümle.indexOf("a")==-1)
            System.out.println("HAYIR");











    }
}
