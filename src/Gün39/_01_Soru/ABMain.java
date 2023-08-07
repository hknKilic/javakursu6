package Gün39._01_Soru;

public class ABMain {

    public static void main(String[] args) {


        A a=new A();
        System.out.println("A.mesaj="+A.mesaj);//A

        B b=new B();
        System.out.println("A.mesaj="+A.mesaj);//B

        A c=new A();
        System.out.println("A.mesaj="+A.mesaj);//B
    }
}
