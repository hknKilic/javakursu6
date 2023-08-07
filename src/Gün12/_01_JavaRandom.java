package Gün12;

public class _01_JavaRandom {
    public static void main(String[] args) {


        double randSayı=Math.random();// 0-0,999999999
        System.out.println("randSayı="+randSayı);
        //0-0,999999
        //10 la carparsan
        //0-9,999999
        //(int)0-9
        int rndTamsayı=(int) (randSayı*10);
        System.out.println("rndTamSayı="+rndTamsayı);




    }

}
