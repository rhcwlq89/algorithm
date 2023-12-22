package stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    @Test
    public void testFilter() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("ddd");

        list.stream()
            .filter(s -> s.length() == 1)
            .forEach(System.out::print);
    }

    @Test
    public void testMap() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("ddd");
        long i  = 1l;
        i++;
        list.stream().map(String::toUpperCase).forEach(System.out::print);
    }

    @Test
    public void testSort() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("ddd");

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    @Test
    public void testComparator() {

    }
}
