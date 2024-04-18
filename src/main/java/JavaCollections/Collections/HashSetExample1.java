package JavaCollections.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber=new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println(evenNumber);
    }
}
