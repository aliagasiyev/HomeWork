package JavaCollections.ExamPles;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer> groupofNumber = new ArrayList<>();
        groupofNumber.add(20);
        groupofNumber.add(25);
        groupofNumber.add(12);
        groupofNumber.add(5);
        Collections.sort(groupofNumber);
        for (Integer numbers : groupofNumber) {
            System.out.println(numbers);
        }
        System.out.println();
        ArrayList<String> groupOfNames = new ArrayList<>();
        groupOfNames.add("Tom");
        groupOfNames.add("Ali");
        groupOfNames.add("Bob");
        groupOfNames.add("Nick");
        Collections.sort(groupOfNames);
        for (String gorupofnames : groupOfNames) {
            System.out.println(gorupofnames);
        }
        System.out.println();

      ArrayList<Integer> groupofNumbers1 = new ArrayList<>();
        groupofNumbers1.add(9);
        groupofNumbers1.add(7);
        groupofNumbers1.add(12);
        groupofNumbers1.add(43);
        groupofNumbers1.add(75);
        Collections.sort(groupofNumbers1);
        for (Integer groupOfNumbers1 : groupofNumbers1) {
            System.out.println(groupOfNumbers1);
        }
      //  ArrayListPractic
    }
}
