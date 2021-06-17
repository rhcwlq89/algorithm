package datastructure.map;


import org.junit.jupiter.api.Test;


public class LinkedHashMapAppTest {

    LinkedHashMapApp linkedHashMapApp = new LinkedHashMapApp();
    HashMapApp hashMapApp = new HashMapApp();

    @Test
    public void test1() {
        hashMapApp.testOrder();
        linkedHashMapApp.test1();
    }

}
