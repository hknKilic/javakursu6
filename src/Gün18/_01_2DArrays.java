package Gün18;

import java.util.Scanner;

public class _01_2DArrays {

    public static void main(String[] args) {

        int sayı=0;
        int[]dizi=new int[100];

        int[]ders1Not=new int[50];
        int[]ders2Not=new int[50];
        int[]ders3Not=new int[50];

        int[][] tümDersNotlari=new int[3][50];

        ders1Not[0]=80;

        tümDersNotlari[0][0]=80;

        System.out.println("tümDersNotlari[0][0]="+tümDersNotlari[0][0]);

        Scanner oku=new Scanner(System.in);
        tümDersNotlari[0][0]= oku.nextInt();





    }
}
