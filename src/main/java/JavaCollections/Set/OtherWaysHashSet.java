package JavaCollections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OtherWaysHashSet {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Python");
        courses.add("Scala");

//        // Enhanced for loop
//        for (String courses1 : courses) {
//            System.out.print(courses1 + "->");
//        }
//
//        // Basic for loop with iterator
//        for (Iterator iterator = courses.iterator(); iterator.hasNext(); ) {
//            String course=(String) iterator.next();
//            System.out.println(course);
//        }

        // write with method lambda
        courses.forEach(course-> System.out.println(course));


    }
}
