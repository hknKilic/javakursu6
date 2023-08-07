package Gün07;

public class _09_StringEndWith {
    public static void main(String[] args) {
        //EndsWith: Verilen karakterler ile bitiyor mu?
        // sonuc true veya false yani boolean döner.

        String text="Merhaba Dünya";

        System.out.println("text.endsWith(ya)="+text.endsWith("ya"));
        System.out.println("text.endsWith(n)="+text.endsWith("n"));
        System.out.println("text.endsWith(A)="+text.endsWith("A"));
        System.out.println("text.endsWith(Dünya)="+text.endsWith("Dünya"));
    }
}
