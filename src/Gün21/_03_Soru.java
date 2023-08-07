package Gün21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {

    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Integer>notlar=new ArrayList<>();
        double toplam=0;
        String cevap="";

        do {
            System.out.println("Not giriniz=");
            int not= okuInt.nextInt();

            notlar.add(not);
            toplam=toplam+not;

            System.out.println("devam etmek istiyor musunuz? (E/H)");
            cevap= okuStr.next();

        }while (cevap.equalsIgnoreCase("E"));
            double ort=toplam/notlar.size();
        System.out.println("ort="+ort);


        double ortalama=toplam/ notlar.size();
        System.out.println("ort="+ort);

        int gecensayisi=0;
        for (int i = 0; i < notlar.size() ; i++) {
            if (notlar.get(i)>=ort)
                gecensayisi++;
        }
        System.out.println("gecensayisi="+gecensayisi);

    }


}
