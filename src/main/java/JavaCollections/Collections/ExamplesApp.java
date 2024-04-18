package JavaCollections.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExamplesApp {
    public static void main(String[] args) {
        List<String> namesOfList=new ArrayList<>();
        namesOfList.add("Hello");
        namesOfList.add("My");
        namesOfList.add("Is");
        namesOfList.add("Ali");
        namesOfList.remove(2);
        for (String namesofStirng :namesOfList){
        //    System.out.println(namesofStirng);
        }
        Set<String> namesOfList1=new HashSet<>();
        namesOfList1.add("Hello");
        namesOfList1.add("Hello");
        for (String namesOfList2 :namesOfList1){
            System.out.println(namesOfList2);
        }
    }
}
