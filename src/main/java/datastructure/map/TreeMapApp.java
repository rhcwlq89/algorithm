package datastructure.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {

    public void testInputOutput() {
        Map<String, String> map = new TreeMap<>();

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
