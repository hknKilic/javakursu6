package Gün17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {

    public static void main(String[] args) {

        String[] isimler={"Ahmet","Zeynep","Kemal","Kaya"};

    //diziyi ekrana direkt ekrana yazdırmak için
        System.out.println("isimler="+ Arrays.toString(isimler));

        int[]a={1,8,3,54};
        System.out.println("a="+Arrays.toString(a));

        //dizi sıralam
        Arrays.sort(isimler);
        System.out.println("isimler="+Arrays.toString(isimler));

        //dizileri esit mi
        int[]b={1,8,3,54};
        int[]c={1,3,8,54};

        System.out.println("Arrays.equals(a,b)="+Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,c)="+Arrays.equals(a,c));

        //contain gibi calısır var ise pozitif sayı verir, yok ise negatif
        //sadece sıralı dizilerde calısır

        System.out.println("Arrays.binarySearch(a,3)="+Arrays.binarySearch(a,3));
        System.out.println("Arrays.binarySearch(c,3)="+Arrays.binarySearch(c,3));

        //diziyi hızlıca bir dger ile doldurmak
        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a)="+Arrays.toString(a));



    }
}
