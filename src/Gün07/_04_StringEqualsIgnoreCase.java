package Gün07;

public class _04_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        //EqualsIgnoreCase
        //equals aynı calısır sadece büyük kücük harf duyarlılıgı yoktur.

        String s1="Merhaba";
        String s2="MERHABA";

        System.out.println("s1.equals(2)="+s1.equals(s2)); //false
        System.out.println("s1.equalsIgnoreCase(2)="+s1.equalsIgnoreCase(s2));
        //true
    }
}
