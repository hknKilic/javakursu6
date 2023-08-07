package Gün04;

public class _02_TipDönüsümleri {

    public static void main(String[] args) {

        byte ogrNot1=98;
        byte ogrNot2=97;
        byte ogrNot3=99;
        byte ogrNot4=100;

        //int             //byte
        int toplamNot=ogrNot1+ogrNot2+ogrNot3+ogrNot4;
        System.out.println("toplamnot="+toplamNot);

        ogrNot2=(byte)toplamNot;
        System.out.println("ogrNot2="+ogrNot2);

        //ondalıklı bir sayının sadece tam sayı kısmı gereklidir
        // 10/3->3
        //int ->byte atınca dur bakalım dedi (Daraltma)
        //büyük hafıza ayrılmıs bir alanı kücük hafıza olana atma
        //islemi var veri kaybı ihtimali var




    }
}
