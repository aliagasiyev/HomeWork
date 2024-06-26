package JavaCollections.ExamPles;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample {
    public static void main(String[] args) {
        HashMap m=new HashMap<>();
        m.put(102,"Sam");
        m.put(103,"Tom");
        m.put(104,"Alice");
        m.put(105,"Ali");
        m.put(106,"Allo");
        System.out.println(m.size());
        System.out.println(m);
        System.out.println(m.size());

        // Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);


    }
}
