package stream.compare;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    @Test
    public void testComparator() {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        list.sort(Comparator.reverseOrder());
        list.forEach(System.out::print);

    }
}
