package Gün23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {

    public static void main(String[] args) {

        // SETS
        // HashSet : Hızlı, bunun için kendine algoritmik sırada tutar.
        // LinkedHashSet : EKLENME SIRASI na göre sıralı tutar.
        // TreeSet : herzaman içinde SIRALI şekilde tutar, kendinden sortlu.

        HashSet<String>hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üc");
        hs.add("dört");
        hs.add("bes");
        System.out.println("hs="+hs);

        //eklenme sırasına göre sıralı tutar
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üc");
        lhs.add("dört");
        lhs.add("bes");
        System.out.println("lhs="+lhs);


        //her zaman sıralı sekilde tutar kendinden sort lu.
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üc");
        ts.add("dört");
        ts.add("bes");
        System.out.println("ts="+ts);





    }
}
