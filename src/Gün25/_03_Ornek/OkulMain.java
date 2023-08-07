package Gün25._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {

    public static void main(String[] args) {


        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Ogrenci>ogrenciler=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr = new Ogrenci();


            System.out.print("Ögrencinin Adı=");
            ogr.adı = okuStr.nextLine();
            System.out.print("Ögrencinin Soyadı=");
            ogr.soyadı = okuStr.nextLine();
            System.out.print("Ögrencinin Sınıfı=");
            ogr.sınıfı = okuInt.nextInt();
            System.out.print("Ögrencinin Adresi=");
            ogr.adres = okuStr.nextLine();

            ogrenciler.add(ogr);

        }

        for (Ogrenci o:ogrenciler) {
            System.out.println("o adı="+o.adı);
            System.out.println("o soyadı="+o.soyadı);
            System.out.println("o sınıfı="+o.sınıfı);
            System.out.println("o adres="+o.adres);

        }




        }


    }

