package Gün21;

import java.util.ArrayList;

public class _01_ArrayList {

    public static void main(String[] args) {

        // dizi,array: boyut sayısı belli , sonradan değiştirelemz
        int[] dizi=new int[5]; // 5 elemanlı Array, boyutu değiştirilemez

        // Boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu baştan vermen gerekmiyor. boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer>integerList=new ArrayList<>();
        ArrayList<String>stringList=new ArrayList<>();
        ArrayList<Double>doubleList=new ArrayList<>();

        ArrayList<String>isimler=new ArrayList<>();
        System.out.println("isimler="+isimler);

        isimler.add("Ahmet");//uzunluk 1
        isimler.add("Metin");
        isimler.add("Burak");
        isimler.add("Cansu");

        System.out.println("isimler="+isimler);
        System.out.println("isimler.size()="+isimler.size());//uzunlugu verir

        isimler.add(1,"Nurhayat");//verilen index e ekliyor, digerleri 1 kayıyor.
        System.out.println("isimler="+isimler);
        System.out.println("isimler.size()="+isimler.size());

        isimler.set(1,"Elife");//verilen indexdeki elemanı degistirir.
        System.out.println("isimler="+isimler);

        boolean varMi=isimler.contains("Elife");//elife var mı?
        System.out.println("Elife varMi="+ varMi);

        isimler.remove("Ahmet");//degere göre sil
        System.out.println("isimler="+isimler);

        isimler.remove(2);// indexe göre sil
        System.out.println("isimler="+isimler);

        int indexOfMetin= isimler.indexOf("Metin");
        System.out.println("imexOfMetin="+indexOfMetin);

        String ilkEleman=isimler.get(0);// o elemanın ver
        System.out.println("ilkEleman="+ilkEleman);

        isimler.clear();
        System.out.println("isimler="+isimler);






    }
}
