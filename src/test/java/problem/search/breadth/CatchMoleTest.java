package problem.search.breadth;

import org.junit.jupiter.api.Test;
import problem.search.binary.breadth.CatchMole;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatchMoleTest {

    @Test
    public void testCatchMole() {
        CatchMole catchMole = new CatchMole();
        int[][] moles = {{1, 1, 3}, {1, 4, 5}, {1, 5 ,6}, {1, 8, 4}, {3, 1, 2}, {4, 6, 1}, {7, 2, 2}, {7, 8, 2}};

        int solution = catchMole.solution(8, 3, moles);
        assertEquals(8, solution);
    }

    @Test
    public void testCatchMole2() {
        CatchMole catchMole = new CatchMole();
        int[][] moles = {{7, 5, 6}, {2, 1, 10}, {6, 6 ,6}, {2, 2, 10}, {3, 2, 10}, {5, 5, 6}, {8, 6, 6}, {3, 1, 10}};

        int solution = catchMole.solution(7, 2, moles);
        assertEquals(24, solution);
    }
}
