package Gün17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_soru {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

        int[]dizi=new int[10];

        for (int i = 0; i < 10; i++)

            dizi[i]=(int)(Math.random()*11);
        System.out.println("dizi="+Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.println("aranacak sayı(0-10)=");
        int aranacakRakam= oku.nextInt();



        for (int i = 0; i < dizi.length; i++){
            if (dizi[i]==aranacakRakam)
                System.out.println("var,oda numarası(index)="+i);


    }



    }
}
