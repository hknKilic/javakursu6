package Gün06;

import java.util.Scanner;

public class _05_ornek {
    public static void main(String[] args) {

        //girilen bir strıngın sadece son harfini yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle=");
        String cümle= oku.nextLine();

        //012345
        //bugün uzunluk=5 length-1

        int uzunluk=cümle.length();
        char sonHarf=cümle.charAt(uzunluk-1);
        System.out.println("sonHarf="+sonHarf);

        // 2.yöntem
        System.out.println("sonHarf="+cümle.charAt(cümle.length()-1));


    }
}
