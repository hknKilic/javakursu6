package Gün23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {

    public static void main(String[] args) {

        HashSet<String>renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");
        System.out.println("renkler="+renkler);


        //ekrana tek tek nasıl yazdırılır
        for (String eleman:renkler){
            System.out.println("eleman="+eleman);
        }

        //foreach
        Integer[]dizi={34,5,8,98,678};
        for(Integer eleman:dizi)
            System.out.println("eleman="+eleman);

        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(dizi));
        for(Integer e:liste)
            System.out.println("e="+e);

        //set in kendi sırası nasıl ise onun aynısını verir
        Iterator gösterge=renkler.iterator();
        while (gösterge.hasNext())//sırada  eleman var ise
        {
            System.out.println("gösterge.next()="+gösterge.next());
            //Next göstegenin gösterdigi elemanı temsil ediyor.
        }

    }
}
