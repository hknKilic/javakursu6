package Gün17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {

    public static void main(String[] args) {

        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.println("cümle giriniz=");
        String cümle= oku.nextLine();

        String[]kelimeler=cümle.split(" ");
        System.out.println("kelimeler.length="+kelimeler.length);

    }

}
       //iklimler çok  değişti

       // String[] kelimeler=cumle.split(" ");
        //kelimeler[0] -> "iklimler"
        //kelimeler[1] -> "çok"
        //kelimeler[2] -> "değişti"
         //kelime.length -> 3