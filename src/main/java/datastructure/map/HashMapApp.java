package datastructure.map;


import java.util.HashMap;
import java.util.Map;


public class HashMapApp {

    public void testOrder() {
        Map<String, String> map = new HashMap<>();
        map.put("e", "e");
        map.put("d", "d");
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");



        for (String s : map.keySet()) {
            String a = map.get(s);
            System.out.println(a);
        }
    }

}
