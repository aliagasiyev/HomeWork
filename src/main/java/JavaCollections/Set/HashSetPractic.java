package JavaCollections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetPractic {
    public static void main(String[] args) {

        // set can contain only one null value
        Set<String> set = new HashSet<>();
       set.add(null);
       set.add(null);
     //   System.out.println(set);

        // it is not contain dublicate value

        Set<Integer> set1=new HashSet<>();
        set1.add(23);
        set1.add(12);
        set1.add(1);
        System.out.println(set1);
    }
}
