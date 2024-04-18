package JavaCollections.Collections;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> arraylist = new ArrayList<>();
        arraylist.add("Salam");
        arraylist.add("Hello");
        arraylist.add("Hi");
        arraylist.add("ArrayinList uzunlugun deyismek olur");


        System.out.println(arraylist.size());
        for (String arraysListElements : arraylist) {
            System.out.println(arraysListElements);
        }

        System.out.println();
        String[] array1 = new String[3];
        array1[0] = "Salam";
        array1[1] = "Hello";
        array1[2] = "Hi";
        System.out.println(array1.length);
        try {
            array1[3] = "Arrayin uzunlugun deyismek olmur";
        } catch (Exception e) {
            System.out.println("Arrayin uzunlugun deyise bilmersiz");
        }
        for (String arraysElements : array1) {
            System.out.println(arraysElements);
        }

        System.out.println();
        // Collection ferqli data tipinden ibaret ola bilir
        Collection<Object> myExample=new ArrayList<>();
        myExample.add(12);
        myExample.add("Hello");
        for (Object examples:myExample){
            System.out.println(examples);
        }
    }
}
