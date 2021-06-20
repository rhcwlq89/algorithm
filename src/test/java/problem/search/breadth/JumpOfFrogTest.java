package problem.search.breadth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problem.search.binary.breadth.JumpOfFrog;

public class JumpOfFrogTest {

    @Test
    public void jumpOfFrogTest() {
        int[] nums = {4, 1, 2, 3, 1, 0, 5};

        JumpOfFrog jumpOfFrog = new JumpOfFrog();
        int i = jumpOfFrog.jumpOfFrog(nums);
        Assertions.assertEquals(3, i);
    }
}
