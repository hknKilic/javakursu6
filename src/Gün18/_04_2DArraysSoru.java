package Gün18;

public class _04_2DArraysSoru {

    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][] tablo=new int[2][3];

        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                tablo[satir][sutun]=(int) (Math.random()*100);

            }
        //tabloyu  yazdıralım
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun <tablo[satir].length ; sutun++)
                System.out.println(tablo[satir][sutun]+ " ");
            System.out.println();

            }
           int tekSayiMik=0;

        for (int satir = 0; satir <tablo.length ; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {

                if (tablo[satir][sutun]%2==1)
                    tekSayiMik++;

            }
            System.out.println("teksaYİMİK="+tekSayiMik);
        }
        }
        }





