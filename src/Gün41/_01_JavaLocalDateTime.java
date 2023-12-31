package Gün41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _01_JavaLocalDateTime {

    public static void main(String[] args) {


        //LocalDateTime hem tarih hem de saat bilgisini tutar.

        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt="+dt);

        System.out.println("dt.getYear()="+dt.getYear());
        System.out.println("dt.getMonth()="+dt.getMonth());//ayın adı
        System.out.println("dt.getMonthValue()="+dt.getMonthValue());//kacıncı ay oldugu
        System.out.println("dt.getDayOfMonth()="+dt.getDayOfMonth());
        System.out.println("dt.getDayOfWeek()="+dt.getDayOfWeek());//gün adı
        System.out.println("dt.getDayOfWeek().getValue()="+dt.getDayOfWeek().getValue());//haftanın kacıncı günü
        System.out.println("dt.getDayOfYear()="+dt.getDayOfYear());
        System.out.println("dt.getHour="+dt.getHour());
        System.out.println("dt.getSecond="+dt.getSecond());
        System.out.println("dt.getMinute="+dt.getMinute());
        System.out.println("dt.getNano="+dt.getNano());

        System.out.println("(dt.format(ISO_DATE_TIME)="+dt.format(DateTimeFormatter.ISO_DATE_TIME));

        //Özel bir formatta istedigimiz gibi yazdırma
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.YYYY hh:nn");
        System.out.println("dt="+dt);

    }


}
