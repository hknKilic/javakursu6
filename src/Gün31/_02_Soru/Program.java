package Gün31._02_Soru;

public class Program {

    public static void main(String[] args) {


        User user1=new User("ismet",Role.ADMİN, Status.AKTİF);
        User user2=new User("mehmet",Role.SATIS,Status.PASİF);
        User user3=new User("ayse",Role.MÜDÜR,Status.AKTİF);


        User.userSil(user1);//admin silinemez
        User.userSil(user2);
        User.userSil(user3);



    }
//        if (user1.role == Role.ADMIN){
//            //kullanıcı silme işlemleri
//        }

}
