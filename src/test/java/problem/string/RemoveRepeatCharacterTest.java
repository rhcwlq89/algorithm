package problem.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveRepeatCharacterTest {

    @Test
    public void removeRepeatCharacterTest() {
        RemoveRepeatCharacter repeatCharacter = new RemoveRepeatCharacter();
        String[] pizzas = repeatCharacter.solution("pizza");
        String[] expected1 = {"pi", "a"};
        Assertions.assertArrayEquals(expected1, pizzas);

        String[] mississippis = repeatCharacter.solution("mississippi");
        String[] expected2 = {"mi", "i", "i", "i"};
        Assertions.assertArrayEquals(expected2, mississippis);
    }
}
