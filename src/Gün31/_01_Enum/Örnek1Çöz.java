package Gün31._01_Enum;



   // enum Aylar{

   //     Tanımsız,OCAK,SUBAT,MART,NİSAN,MAYIS,HAZİRAN,TEMMUZ,AGUSTOS,EYLÜL,EKİM,KASIM,ARALIK
  //  }

    public class Örnek1Çöz {

        // class ın içinde de enum tanımlanabilir, ancak METOD ların içind etanımlanamaz.

        // enumaration : numaralandırılmış simgeler

        public static void main(String[] args) {


            Aylar ay=Aylar.MAYIS;

            switch (ay){

                case SUBAT: System.out.println(28);break;
                case OCAK:
                case MART:
                case MAYIS:
                case TEMMUZ:
                case AGUSTOS:
                case EKİM:
                case ARALIK: System.out.println(31);break;
                case NİSAN:
                case HAZİRAN:
                case KASIM:
                case EYLÜL: System.out.println(30);break;
            }
            // Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.

        }


}
