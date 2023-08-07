package Gün41;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {

    public static void main(String[] args) {

        //Duration=LocalTime ve LocalDateTime lar arası fark için kullanılır

        //LocalTime
        long startTime=System.currentTimeMillis();

        LocalTime dersBaslangıc=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(21,50,5);

        Duration gunlukDersSuresi=Duration.between(dersBaslangıc,dersBitis);
        System.out.println("gunlukDersSuresi="+gunlukDersSuresi);

        System.out.println("gunlukDersSuresi.toDays()="+gunlukDersSuresi.toDays());
        System.out.println("gunlukDersSuresi.toHours()="+gunlukDersSuresi.toHours());
        System.out.println("gunlukDersSuresi.toMinutes()="+gunlukDersSuresi.toMinutes());
        System.out.println("gunlukDersSuresi.toSecond()="+gunlukDersSuresi.getSeconds());
        System.out.println("gunlukDersSuresi.toMillis()="+gunlukDersSuresi.toMillis());
        System.out.println("gunlukDersSuresi.toNanos()="+gunlukDersSuresi.toNanos());

        System.out.println("***********  LocalDateTime   ***************");
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();

        Duration fark=Duration.between(from,to);
        System.out.println("fark="+fark);

        System.out.println("fark.toDays()="+fark.toDays());
        System.out.println("fark.toHours()="+fark.toHours());
        System.out.println("fark.toMinutes()="+fark.toMinutes());

        System.out.println("*******  kodun performansı  ************");
        long finischTime=System.currentTimeMillis();
        System.out.println("gecenSüre="+(finischTime-startTime)+"ms");
    }
}
