package Gün22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer>sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar="+sayilar);

        //sıralama islemi
        Collections.sort(sayilar);
        System.out.println("sayilar="+sayilar);

        //tersine cevirme
        Collections.reverse(sayilar);
        System.out.println("sayilar="+sayilar);

        //bütün elemanları tek bir degerle set etme
        Collections.fill(sayilar,0);

        //replace
        Collections.replaceAll(sayilar,0,5);
        System.out.println("sayilar="+sayilar);

        //tanımlarken deger atama
        int[]dizi={2,3,45,56};
        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(3,4,56,78,89));
        ArrayList<String>strlist=new ArrayList<>(Arrays.asList("ahmet","ayse","kaya"));

        System.out.println("liste="+liste);
        System.out.println("strrList="+strlist);

        //AddAll:bir veya fazla degerleri listeye ekler
        Collections.addAll(sayilar,56,77,88,99,77);
        System.out.println("sayilar="+sayilar);

        //bir diziyi nasıl Arrayliste atarım
        Integer[]dizi2={2,3,45,56};
        ArrayList<Integer>liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3="+liste3);





    }
}
