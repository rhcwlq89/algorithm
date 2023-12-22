package datastructure.map;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class MapAppTest {
    TreeMapApp treeMapApp = new TreeMapApp();
    LinkedHashMapApp linkedHashMapApp = new LinkedHashMapApp();
    HashMapApp hashMapApp = new HashMapApp();

    @Test
    public void test1() {
        System.out.println();
        hashMapApp.testInputOutput();
        linkedHashMapApp.testInputOutput();
        treeMapApp.testInputOutput();
    }

    @Test
    public void test2() {
        Map<String, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
    }

}
