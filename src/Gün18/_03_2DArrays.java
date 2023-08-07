package Gün18;

import java.util.Arrays;

public class _03_2DArrays {

    public static void main(String[] args) {
        int[][] tablo = {//2 satır 3 sütun

                {2, 3, 44},//1.satir 3 elemanli
                {45, 66, 5}//2.satir  3 elemanlı

        };
        System.out.println(Arrays.toString(tablo[0]));//0. satır tümü
        System.out.println(Arrays.toString(tablo[1]));//1.satir tümü
        System.out.println("tablo[0].length=" + tablo[0].length);//0. satır uzunlugu
        System.out.println("tablo[0].length=" + tablo[1].length);//1. satır uzunlugu

        System.out.println("tablo=" + tablo.length);// kac satır var satır uzunlugu

        for (int satir = 0; satir < tablo.length; satir++) {//0,1

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)// her bir satirin sütünlarını yazdıran for
                System.out.println(tablo[satir][sutun] + " ");

            System.out.println();

        }

    }
}