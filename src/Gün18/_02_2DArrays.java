package Gün18;

public class _02_2DArrays {

    public static void main(String[] args) {
        
        int[] dizi=new int[10];
        int[] dizi2={2,3,45,67,8,99,0,44,2};
        
        int[][] tablo=new  int[2][3];//2 satir 3 sütün hepsi default 0 degerine sahip
        
        int[][] tablo2={//2 satır 3 sütun

                {2,3,44},//1.satir 3 elemanli
                {45,66,5}//2.satir  3 elemanlı
                
        };

        for (int satir = 0; satir < 2; satir++) {//0,1

            System.out.println(tablo2[satir][0]);// her bir satirin 0. elemanı
            System.out.println(tablo2[satir][1]);// her bir satirin 1. elemanı
            System.out.println(tablo2[satir][2]);// her bir satirin 2. elemanı
            
        }
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++)
                System.out.println(tablo2[satir][sutun]+" ");
            System.out.println();

            {

            }

        }
    }
}
