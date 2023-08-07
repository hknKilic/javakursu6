package Gün33._02_Inheritance;

public class Kedi extends Hayvan {
    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);

        //super:miras alınan sınıf

    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("miyavladı");
    }
}



