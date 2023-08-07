package Gün04;

public class _04_NarrowingCassting {
    public static void main(String[] args) {

        int toplam=6700;
        byte sayı=5;

        sayı=(byte)toplam; //veri kaybı olmasa bile dikkateli yapılamlı
        System.out.println("sayı="+sayı); //veri kaybı var

        double oran=3.7;
        toplam=(int) oran;
        sayı=(byte) oran;
        System.out.println("toplam="+toplam);

        // veri kaybı var fakat bilerek yaptık.


    }
}
