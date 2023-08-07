package Gün04;

public class _01_javaString {
    public static void main(String[] args) {

        int sayac=0; // int tipi, sayac adı, 0 baslangıc degeri

        String ad="ismet"; // kelime ve kelimeler dizisi saklar 'String'
        System.out.println("sayac="+sayac); // 0 yazar
        System.out.println("ad="+ad);       // ismet yazar

        String soyad="Temur";
        System.out.println("soyad="+soyad);

        String tamAd=ad+soyad; // + isareti sayılarda toplar.
                              // kelimelerde yan yana birlestirir.

        System.out.println("tamAd="+tamAd);


    }
}
