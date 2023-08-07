package Gün13;

import java.util.Scanner;

public class _06_WhileLoop {

    public static void main(String[] args) {

        // Girilen 6 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;
        while (sayac<=6){
            System.out.println("sayı giriniz=");
            int sayı=oku.nextInt();
            if (sayı>0)
                toplam=toplam+sayı;

            sayac++;

            System.out.println("toplam="+toplam);



        }




    }
}
