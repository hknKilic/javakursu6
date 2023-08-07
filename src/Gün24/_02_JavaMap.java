package Gün24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {

    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();

        hm.put(1001,"ısmet temur");
        hm.put(1002,"yusuf yılmaz");
        hm.put(2001,"bugrahan yıldız");
        hm.put(5001,"elife sözen");
        hm.put(1002,"seda parca");

        System.out.println("hm.keySet()="+hm.keySet());//keyleri toplu verir
        System.out.println("hm.values()="+hm.values());//degerleri toplu verir

        for(Integer k:hm.keySet())
            System.out.print(k+"\t");

        System.out.println();

        for(String k:hm.values())
            System.out.print(k+"\t");

        System.out.println();

        System.out.println("hm="+hm);

        for (Map.Entry<Integer,String>kv: hm.entrySet()){
            System.out.println(kv.getKey()+"-"+kv.getValue());
        }


    }
}
