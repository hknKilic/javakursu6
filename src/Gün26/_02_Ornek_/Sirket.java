package Gün26._02_Ornek_;

public class Sirket {

    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    // 4- Adım : çalıştığında kişinin doğum yılını versin.


    public static void main(String[] args) {

        Person cal1=new Person();
        cal1.name="Büsra";
        cal1.surname="yılmaz Kilic";
        cal1.age=33;

        Person cal2=new Person();
        cal2.name="Nuvis";
        cal2.surname="begüm";
        cal2.age=11;

        //1.Yöntem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surname = " + cal1.surname);
        System.out.println("cal1.age = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surname = " + cal2.surname);
        System.out.println("cal2.age = " + cal2.age);

        //2.Yol
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);

        //3.Yol
        cal1.bilgiYazdir();
        cal2.bilgiYazdir();

        //4.Yol
        //ArrayList<Integer> list=new ArrayList<>();
        //System.out.println("list = " + list.toString());

        System.out.println("cal1 = " + cal1);
        System.out.println("cal2 = " + cal2);

        cal1.getBirthYear();
        cal2.getBirthYear();

        System.out.println("cal1.getBirthYear2() = " +
                cal1.getBirthYear2());
    }

    public static void BilgiYazdir(Person cal) // cal1 , cal2
    {
        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surname = " + cal.surname);
        System.out.println("cal.age = " + cal.age);
    }

}
