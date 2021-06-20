package datastructure.map;


import org.junit.jupiter.api.Test;


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

}
