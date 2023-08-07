package Gün07;

public class _05_StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty: bir Stringin içinde bir sey var mı yok mu boolean olarak verir.

        String s1="Merhaba";
        String s2="";

        System.out.println("s1 bos mu="+s1.isEmpty());// false
        System.out.println("s2 bos mu="+s2.isEmpty());//true

        boolean bosMu=s2.isEmpty();
        System.out.println("bosMu="+bosMu);
    }
}
