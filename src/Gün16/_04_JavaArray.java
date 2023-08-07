package Gün16;

public class _04_JavaArray {

    public static void main(String[] args) {

        int[] dizi = new int[5];// 01234 indexli 5 elemanlı dizi,int sayi;
        int[] dizi2 = {3, 4, 5, 7, 78, 4};//5 elemanlı dizi hem tanımlanıdı hem de deger atandı in sayı05;

        String[] cümleler = new String[5];
        boolean[] dizi3 = new boolean[5];
        double[] oranlar = new double[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi=" + dizi[i]);

        }
        for (int i = 0; i < cümleler.length; i++) {
            System.out.println("cümleller=" + cümleler[i]);

        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("boolean dizi=" + dizi3[i]);
        }
        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar=" + oranlar[i]);
        }
    }
}