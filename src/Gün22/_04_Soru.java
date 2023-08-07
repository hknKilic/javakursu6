package Gün22;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_Soru {

    public static void main(String[] args) {

        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        System.out.println("*********** 2. Soru ***************");
        Scanner oku=new Scanner(System.in);
        System.out.print("Ders No ( 0-Mat, 1-Fiz, 2-Kim)=");
        int dersNo=oku.nextInt();


        ArrayList<ArrayList<Integer>>notlarListesi=null;
        dersNotlariniYazdir( dersNo,notlarListesi );

        // TODO
        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.

    }


    public static void dersNotlariniYazdir(int dersNo, ArrayList<ArrayList<Integer>>notlarListesi){

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {

            System.out.print( notlarListesi.get(dersNo).get(i)+"\t");

        }

    }


}









