package Gün08;

public class _01_StringReplace {
    public static void main(String[] args) {

        //replace: bir string içindeki karakterleri verilenle degistirir.

        String text="Merhaba Dünya";
        System.out.println("text="+text);
        System.out.println("text.replace(a,e)="+text.replace("a","e")); //merhebe dünye
        System.out.println("text.replace(ba,de)="+text.replace("ba","dess"));//merhade dünya
        System.out.println("text.replace(Merhaba,Hello)="+text.replace("Merhaba","Hello"));
        System.out.println("text.replace(a,'')="+text.replace("a",""));// a lar silindi



    }
}
