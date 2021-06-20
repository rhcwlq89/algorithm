package problem.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoodSubstringTest {

    @Test
    public void goodSubstringTest() {
        String input = "abac";
        GoodSubstring goodSubstring = new GoodSubstring();
        int i = goodSubstring.countGoodSubString(input);
        Assertions.assertEquals(7, i);

        String input2 = "abcd";
        int j = goodSubstring.countGoodSubString(input2);
        Assertions.assertEquals(10, j);

        String input3 ="zxzxz";
        int k = goodSubstring.countGoodSubString(input3);
        Assertions.assertEquals(4, k);
    }
}
