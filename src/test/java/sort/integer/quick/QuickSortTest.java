package sort.integer.quick;

import org.junit.jupiter.api.Test;
import problem.sort.integer.quick.QuickSort;

public class QuickSortTest {

    @Test
    public void quickSortTest() {
        int[] array = {1, 3, 2, 4, 5};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, 4);

        for (int i : array) {
            System.out.println(i);
        }
    }
}
