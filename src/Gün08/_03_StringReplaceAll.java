package Gün08;

public class _03_StringReplaceAll {
    public static void main(String[] args) {

        //ReplaceAll: replace gibi calısır. farkı kriter(regex) verilebiliyor.
        // regex: regular expression/düzenli ifadeler

        String text="Merhaba1 Dünya234";

        System.out.println("text="+text);
        System.out.println("abn->_="+text.replaceAll("[abn]","_"));

        System.out.println("A-Z->_="+text.replaceAll("[A-Z]","_"));

        System.out.println("0-9 arasını sil="+text.replaceAll("[0-9]",","));

        System.out.println("0-9 dısındakileri sil="+text.replaceAll("[0-9]",","));


    }
}
