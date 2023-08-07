package Gün30._03_Soru;

public class KimlerDinledi {
    int a;
    static int b=0;

    void artir()
    {
        a++;
        b++;
    }



    public static void main(String[] args) {

        KimlerDinledi kd1=new KimlerDinledi();
        kd1.a=5;

        KimlerDinledi kd2=new KimlerDinledi();
        kd1.a=7;

        System.out.println("kd1.a="+kd1.a);
        System.out.println("kd2.a="+kd2.a);

        kd1.artir();;
        kd2.artir();



    }

    }