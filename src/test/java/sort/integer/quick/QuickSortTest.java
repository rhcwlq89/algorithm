package sort.integer.quick;

import org.junit.jupiter.api.Test;
import problem.sort.integer.quick.QuickSort;

public class QuickSortTest {

    @Test
    public void quickSortTest() {
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, 8);

        for (int i : array) {
            System.out.println(i);
        }
    }
}
