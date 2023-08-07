package Gün40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_Soru {

    public static void main(String[] args) throws InterruptedException {

        //// Canlı digital saat yapınız

        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true){

            LocalTime saat=LocalTime.now();
            System.out.print("\r"+saat.format(f));
            //1 saniye bekle
            Thread.sleep(1000);
        }
    }
}
