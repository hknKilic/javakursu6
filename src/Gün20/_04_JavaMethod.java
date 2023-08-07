package Gün20;

import java.util.Scanner;

public class _04_JavaMethod {

    public static void main(String[] args) {

        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        // bir fonksiyonda buldurup mainden yazdırınız
        // Örn: 5 girildiyse -> 12345 i bulmalısınız

        Scanner oku = new Scanner(System.in);

        System.out.println("bir sayı giriniz=");
        int sayi = oku.nextInt();

        int carpim = faktorye(sayi);
        System.out.println("carpim=" + carpim);
    }

    public static int faktorye(int sayi) {

        int carpim = 1;
        for (int i = 0; i < sayi; i++)
            carpim = carpim * i;

            return carpim;
        }
    }








