package Gün19;

public class _02_java2DArrays {

    public static void main(String[] args) {

        int[][]tablo=new int[2][3];

        int[][]tablo2={//5 satir 4 sütün
                {4,55},
                {3,56,77},
                {23,2,3,1,55,4,66,77},
                {13,44,55},
                {43}
        };

        for (int i = 0; i <tablo2.length; i++) {// satir sayısı

            for (int j = 0; j < tablo2[i].length; j++)
                System.out.println(tablo2[i][j] + " ");
            System.out.println();


            }

        }

    }

