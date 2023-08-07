package Gün11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {

        // Otopark ücretleri : (Ternary operatör ile yapınız.)
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("saat giriniz=");
        int saat= oku.nextInt();

        String ücretStr=(saat<=3)?"10 tl":(saat<=5)?"15 tl":"20 tl";
        System.out.println("ücterStr="+ücretStr);

        // 2.yol
        System.out.println((saat<=3)?"10 tl": (saat<=5)? "15 tl":"20 tl");






    }
}
