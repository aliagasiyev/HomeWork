package JavaCollections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetIntoSet {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(12);
        set1.add(21);
        set1.add(43);
        set1.add(63);
        set1.add(11);

        Set<Integer> set2=new HashSet<>();
        set1.add(15);
        set1.add(28);
        set1.add(430);
        set1.add(631);
        set1.add(117);



        Set<Integer>set3=new HashSet<>(set1);
        System.out.println(set3);


    }
}
