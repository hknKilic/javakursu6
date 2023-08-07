package Gün04;

public class _07_Ornek3 {

    public static void main(String[] args) {

        String Not1="80";
        String Not2="95";
        String Not3="56";

        int rakamNot1=Integer.parseInt(Not1);
        int rakamNot2=Integer.parseInt(Not2);
        int rakamNot3=Integer.parseInt(Not3);

        int toplamNot=rakamNot1+rakamNot2+rakamNot3;
        System.out.println("toplamNot="+toplamNot);

        double ort=toplamNot/(double)3;
        System.out.println("ort="+ort);

    }
}
