package Gün07;

public class _06_StringSubstring {
    public static void main(String[] args) {
        //stringin belli bir bölümünü almaya yarar.

        String s1="Merhaba arkadaslar";

        String parca1=s1.substring(3,9);
        System.out.println("parca1="+parca1);

        String parca2=s1.substring(8,15);
        System.out.println("parca2="+parca2);

        String parca3=s1.substring(8);
        System.out.println("parca3="+parca3);
    }
}
