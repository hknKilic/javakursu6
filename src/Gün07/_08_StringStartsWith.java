package Gün07;

public class _08_StringStartsWith {
    public static void main(String[] args) {

        // startsWith: bununla baslıyor mu?
        // sonuc true veya false

        String text="HCL Teknolojı";// leasePlan

        System.out.println("text.startsWith(HC)="+text.startsWith("HC")); //true
        System.out.println("text.startsWith(te)="+text.startsWith("te"));//false
        System.out.println("text.startsWith(h)="+text.startsWith("h"));//false
    }
}
