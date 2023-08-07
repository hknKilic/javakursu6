package Gün27._01_Ornek;

public class Utility {//sınıfın tipin adı


    public String getString(int sayi){

        return String.valueOf(sayi);
        //stringe cevir
    }
    //Eğer bir metod nesnenin özelliklerini
    // kullanıyorsa nesne oluşturulmadan
    // kullanılamaz.Dolayısıyla STATİC olamaz
    // NEsne şart
    // Bağımsız metodlar yani STATİC metodlar
    // herhangi bir nesneye bağlı çalışması gerekmeyen
    // metodlardır.
    //static metodlar: class a yani tipe ait
    //static olmayanlar: nesneye ait


    public static String getString2(int sayi){

        return String.valueOf(sayi);
    }


}
