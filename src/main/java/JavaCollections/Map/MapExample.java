package JavaCollections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Vaqif");
        map.put(2,"Asif");
        map.put(3,"Ali");
        map.put(4,"Tofiq");
        map.put(5,"Sadiq");
        map.put(null,"mknkn");
        System.out.println(map.containsKey(2));
        map.replace(2,"Asf");


    }
}
