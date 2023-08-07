package Gün07;

public class _03_StringEquals {
    public static void main(String[] args) {
        // eguals: 2 Stringin birbirine esit olup olmadıgını kontrol eder.
        //sonuc boolean

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMİ=s1.equals(s2); //false
        System.out.println("esitMi="+esitMİ);
        System.out.println("esitMi="+s1.equals(s2)); //false
        System.out.println("esitMi="+s1.equals("Merhaba"));// true

    }
}
