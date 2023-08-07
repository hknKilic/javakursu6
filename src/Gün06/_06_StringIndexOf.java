package Gün06;

public class _06_StringIndexOf {
    public static void main(String[] args) {

        String cümle="merhaba dünya";

        System.out.println("cümle.indexof(m)="+cümle.indexOf("m"));
        System.out.println("cümle.indexof(h)="+cümle.indexOf("h"));
        System.out.println("cümle.indexof(a)="+cümle.indexOf("a"));
        System.out.println("cümle.indexof(dü)="+cümle.indexOf("dü"));
        System.out.println("cümle.indexof(a)="+cümle.indexOf("a"));
        System.out.println("cümle.indexof( )="+cümle.indexOf(" "));
        System.out.println("cümle.indexof(z)="+cümle.indexOf("z"));
        System.out.println("cümle.indexof(a,5)="+cümle.indexOf("a,5"));
        System.out.println("cümle.indexof(a,7)="+cümle.indexOf("a,7"));

    }
}
