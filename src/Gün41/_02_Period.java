package Gün41;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {

    public static void main(String[] args) {

        //İki tarih arasındaki farkı tutar.

        LocalDate dogumTarihi=LocalDate.of(1988, 9, 24);
        LocalDate buGun=LocalDate.now();

        Period fark=Period.between(dogumTarihi,buGun);
        System.out.println("fark="+fark);

        System.out.println("fark.getYears="+fark.getYears());
        System.out.println("fark.getMonths="+fark.getMonths());
        System.out.println("fark.getDays="+fark.getDays());

        System.out.println(fark.getYears()+"Yasındasınız");

        /********************************************/

        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);

        System.out.println("period3Gun="+period3Gun);
        System.out.println("period3Ay="+period3Ay);

        LocalDate ucGunSonra=buGun.plus(period3Gun);
        System.out.println("ucGunSonra="+ucGunSonra);

        LocalDate ucGunSonra2=buGun.plusDays(3);
        System.out.println("ucGunSonra2="+ucGunSonra2);

        LocalDate ucAySonra=buGun.plus(period3Ay);
        System.out.println("ucAySonra="+ucAySonra);

        System.out.println("************************");
        //1-Kursun bitis tarihini bulunuz 6 Ay=15.05.2023B

        LocalDate kursunBaslangıcTarihi=LocalDate.of(2023,5,15);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursunBaslangıcTarihi.plus(kursSure);

        System.out.println("kursbitiş="+kursBitis);
        System.out.println("kursBitis.günü="+kursBitis.getDayOfWeek());

        //2-Kursun bitmesine ne kadar süre kaldı

        Period nekadarSureKaldi=Period.between(buGun,kursBitis);
        System.out.println("neKadarSüreKaldı="+nekadarSureKaldi);

        //3-Ne kadar süredir devam ediyor

        Period neKadarSure=Period.between(kursunBaslangıcTarihi,buGun);
        System.out.println("neKadarSüredir="+neKadarSure);


    }
}
