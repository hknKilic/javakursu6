package Gün08;

public class _02_StringReplaceFirst {
    public static void main(String[] args) {

        //replaceFirst: Bir string içindeki karakterleri sadece ilkini degistirir.

        String text="Merhaba Dünya";

        System.out.println("text="+text);
        System.out.println("text.replaceFirst(a,e)="+text.replaceFirst("a","e")); //Merheba dünya
        System.out.println("text.replace(ba,de)="+text.replaceFirst("ba","de"));//merhade dünya
        System.out.println("text.replace(Merhaba,Hello)="+text.replaceFirst("Merhaba","Hello"));
        System.out.println("text.replace(a,'')="+text.replaceFirst("a",""));//

    }
}
