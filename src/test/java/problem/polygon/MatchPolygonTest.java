package problem.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatchPolygonTest {

    @Test
    public void testMatchPolygon() {
        int[][] input = {{2, -1}, {-1, 2}};
        MatchPolygon matchPolygon = new MatchPolygon();
        int result = matchPolygon.countPolygon(input);

        assertEquals(3, result);
    }

    @Test
    public void testMatchPolygon2() {
        int[][] input = {{4, -1}, {-1, 4}};
        MatchPolygon matchPolygon = new MatchPolygon();
        int result = matchPolygon.countPolygon(input);

        assertEquals(0, result);
    }

    @Test
    public void testMatchPolygon3() {
        int[][] input = {{3, -1, 3}, {-1, 2, -1}, {3, -1, 3}};
        MatchPolygon matchPolygon = new MatchPolygon();
        int result = matchPolygon.countPolygon(input);

        assertEquals(2, result);
    }


}
