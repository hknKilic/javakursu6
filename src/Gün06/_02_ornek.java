package Gün06;

import java.util.Scanner;

public class _02_ornek {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        Scanner okuBool=new Scanner(System.in);

        System.out.println("cadde=");
        String cadde=oku.nextLine();

        System.out.println("sokak=");
        String sokak=oku.nextLine();

        System.out.println("postaKodu=");
        int postaKodu= okuInt.nextInt();

        System.out.println("ülke");
        String ülke=oku.nextLine();

        System.out.println("evSahibiMi=f/t");
        boolean evSahibiMi= okuBool.nextBoolean();

        System.out.println("Adres="+cadde+sokak+postaKodu+ülke+evSahibiMi);

    }
}
