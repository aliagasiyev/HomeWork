package JavaCollections.List;

import java.util.*;

public class ArrayListPractic {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(0,13);
        list1.add(1,13);
        list1.add(32);
        list1.add(32);
        ArrayList<Integer> list2 = new ArrayList();
        list2.add(2);
        list2.add(4);
        list2.add(3);
        list2.add(1);

        list1.addAll(list2);
        System.out.println(list1);
       Collections.sort(list1);
        System.out.println(list1);


        System.out.println("Before sorting list:");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println("after sorting list:");
        System.out.println(list1);

        list1.remove(2);
        System.out.println(list1);
        list1.add(12);


    }
}
