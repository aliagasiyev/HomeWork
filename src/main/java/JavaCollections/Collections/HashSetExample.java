package JavaCollections.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
         // default capacity 16 Load Factor 0.75
        // HashSet hs=new HashSet(100); // initial capacity 100
       // HashSet<Integer>hs =new HashSet<>();

        // Add object/element HashSet
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add("welcome");
        hs.add(16.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);


        // remove() elements from
        hs.remove(100); // you must insert elements
        System.out.println(hs);

        //contaions yoxlayir hs icinde
        // var yoxsa yoxdu true-false qaytarir
        System.out.println(hs.contains("Hello"));
        System.out.println(hs.isEmpty());

        // Iterator to read all data elements
        Iterator iterator= hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
