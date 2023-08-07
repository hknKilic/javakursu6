package Gün14;

import java.util.Scanner;

public class _05_forLoop {

    public static void main(String[] args) {

        // kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("kaca kadar toplanacak=");
        int sinir= oku.nextInt();

        int toplam=0;
        // baslangıc:0 bitis:sınır, 1 er

        for (int i=1; i<= sinir;i++){

            toplam=toplam+i;

            System.out.println("toplam="+toplam);



        }



    }
}
