package search.binary;

import org.junit.jupiter.api.Test;
import problem.search.binary.BinarySearch;

public class BinarySearchTest {

    @Test
    public void binarySearchTest() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(2, arr);
    }
}
