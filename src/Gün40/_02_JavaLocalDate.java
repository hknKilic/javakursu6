package Gün40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_JavaLocalDate {

    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();//suanki tarihi ver

        DateTimeFormatter oz6=DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih MMMM dd EEEE yyyy="+tarih.format(oz6));

        System.out.println("\n************ baska dilde formatta gösterelim*********");

        System.out.println("Almanca Tarih="+tarih.format(oz6.withLocale(Locale.GERMANY)));

        // Lokalizasyon tanımlaması ne demek
        // en-US : Amerikanı nın İngilizce konuşulan lokalizasyonu (Bölgesi)
        // en-UK : İngiltere nin İngilizce konuşulan lokalizasyonu (Bölgesi)
        // fr-CA : Kanada nın fransızca konuşulan lokalizasyonu (Bölgesi)
        // en-CA : Kanada nın ingilizce konuşulan lokalizasyonu (Bölgesi)
        // tr-TR : Türkiye nin Türkçe konuşulan bölgesi


        Locale lCince=new Locale("zh","CH");
        System.out.println("cince Tarih="+tarih.format(oz6.withLocale(lCince)));





        //Kullanailir lokalleri  bulma

        Locale[]kullanılabilirLokaller=Locale.getAvailableLocales();

        for (Locale l:kullanılabilirLokaller){
            if (!l.getDisplayCountry().toLowerCase().contains("tur"))continue;

            System.out.println("Dili="+l.getDisplayLanguage());
            System.out.println("Ülkesi="+l.getDisplayCountry());
            System.out.println("Dili="+l.getDisplayLanguage());
            System.out.println("Ülkesi="+l.getDisplayCountry());
            System.out.println();

            Locale lTurkiye=new Locale("tr","TR");
            System.out.println("Türkçe Tarih="+tarih.format(oz6.withLocale(lTurkiye)));

            Locale lItalya=new Locale("ıt","IT");
            System.out.println("isvicre Tarih="+tarih.format(oz6.withLocale(lItalya)));
        }
        System.out.println("\n*****************");
        // tarih=2053-5-20; gibi kendimiz bir tarihi nasıl set ederiz
        LocalDate tarih1= LocalDate.of(2053,5,20);
        LocalDate tarih2= LocalDate.of(2053, Month.MAY, 20);
        System.out.println("tarih2.format(oz6) = " + tarih2.format(oz6));
    }
}
