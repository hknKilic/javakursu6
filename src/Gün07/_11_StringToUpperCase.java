package Gün07;

public class _11_StringToUpperCase {
    public static void main(String[] args) {

        // ToUpperCase: string büyük harfe cevirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali="+text);
        System.out.println("text.toUpperCase()="+text.toUpperCase());

        boolean bununlaBaslıyormu=text.toUpperCase().startsWith("M");
        System.out.println("M veya m ile baslıyor mu="+bununlaBaslıyormu);
    }
}
