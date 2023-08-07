package Gün20;

import java.util.Scanner;

public class _03_JavaMethod {

    public static void main(String[] args) {

         // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("1 sayı=");
        int sayi1= oku.nextInt();

        System.out.println("2 sayı=");
        int sayi2= oku.nextInt();

        int enb=enbBul(sayi1,sayi2);
        System.out.println("enb="+enb);

        }

public static int enbBul(int s1,int s2){

        int enb=0;
        if (s1>s2)
            enb=s1;
        else
            enb=s2;
                    return enb;

                    //2.yöntem
   // if(s1>s2)
     //   return s1;
    //else
      //  return s2;

    //2.yöntem
    //return(s1>s2 ? s1: s2);



}

}
