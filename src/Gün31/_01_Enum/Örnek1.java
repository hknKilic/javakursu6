package Gün31._01_Enum;

public class Örnek1 {

    public static void main(String[] args) {

        // Verilen bir ay nosuna göre, ayın kaç gün sürdüğünü veren programı yazınız.


        int ayNo=5;

        switch (ayNo){
            case 2: System.out.println(28);break;
            case 1://ocak
            case 3:
            case 5:
            case 22:
            case 10:
            case 12: System.out.println(31);break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println(30);break;
        }
        // okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz
        // numaradan gitmeye çalıştık, zorluklarla karşılaştık
        // bunun yerine isimden gitmeye çalışalım

        //        if (kullanci ==  kullaniciTipi.Ogretmen){  // 0
//            ders açma butonunu göster
//        }
//        else
//            if (kullancici == kullaniciTip.Ogrenci){ // 1
//              ders açma butonunu gösterme
//            }


        Boolean lambaAcikmi= true; //1 false 0

    }
}


