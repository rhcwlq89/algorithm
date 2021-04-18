package search.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problem.search.binary.BinarySearchVariation;

public class BinarySearchVariationTest {

    @Test
    public void findStartAndEnd() {
        int[] nums = {1, 2, 3, 4, 5, 5, 5, 5, 6, 7};
        int target = 5;
        BinarySearchVariation binarySearchVariation = new BinarySearchVariation();
        int[] startAndEnd = binarySearchVariation.findStartAndEnd(nums, target);
        int[] expected = {4, 7};
        Assertions.assertArrayEquals(expected, startAndEnd);
    }
}
