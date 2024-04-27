package JavaCollections.ArrayList;

import java.util.*;

public class ArrayListPractic {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();

        nums.add(0,13);
        nums.add(1,13);
        nums.add(32);
        nums.add(32);
        System.out.println(nums.size());

        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        System.out.println("Before sorting list:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("after sorting list:");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);



    }
}
