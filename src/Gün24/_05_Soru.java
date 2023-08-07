package Gün24;

import java.util.Map;
import java.util.TreeMap;

public class _05_Soru {

    public static void main(String[] args) {

        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String,String>kelime=new TreeMap<>();
        kelime.put("Ekleme","Kelime Giriniz=");
        kelime.put("Düzeltme"," ");
        kelime.put("listeleme","listeleme");



    }
}
