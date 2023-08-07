package Gün29._02_PrivateErişim;

public class Şirket {

    public static void main(String[] args) {
        Çalışan cal1 = new Çalışan();
        cal1.id = 1;
        cal1.name = "ismet";
        cal1.surname = "temur";
        //cal1.password="1234";

        cal1.sifreAta("1234");
        cal1.sifreAta("M123_sdf23");
        cal1.sifreGoster();
    }
}


