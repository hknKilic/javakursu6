package Gün36._04_Interface;

public class A4 implements IYazdirir,IGosterir{
    @Override
    public void goster() {
        System.out.println("gösterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdırdı");
    }
}
