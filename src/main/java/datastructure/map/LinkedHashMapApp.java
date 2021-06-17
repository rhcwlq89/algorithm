package datastructure.map;


import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapApp {

    public void test1() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("e", "e");
        map.put("d", "d");
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("e", "f");

        for (String s : map.keySet()) {
            String a = map.get(s);
            System.out.println(a);
        }
    }
}
