package problem.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveRepeatCharacterTest {

    @Test
    public void removeRepeatCharacterTest1() {
        RemoveRepeatCharacter repeatCharacter = new RemoveRepeatCharacter();
        String[] pizzas = repeatCharacter.solution("pizza");
        String[] expected1 = {"pi", "a"};
        Assertions.assertArrayEquals(expected1, pizzas);
    }

    @Test
    public void removeRepeatCharacterTest2() {
        RemoveRepeatCharacter repeatCharacter = new RemoveRepeatCharacter();
        String[] mississippis = repeatCharacter.solution("mississippi");
        String[] expected2 = {"mi", "i", "i", "i"};
        Assertions.assertArrayEquals(expected2, mississippis);
    }

    @Test
    public void removeRepeatCharacterTest3() {
        RemoveRepeatCharacter repeatCharacter = new RemoveRepeatCharacter();
        String[] aabbbbs = repeatCharacter.solution("aabbbb");
        String[] expected3 = {"", ""};
        Assertions.assertArrayEquals(expected3, aabbbbs);
    }

    @Test
    public void removeRepeatCharacterTest4() {
        RemoveRepeatCharacter repeatCharacter = new RemoveRepeatCharacter();
        String[] aabcddddefgggs = repeatCharacter.solution("aabcddddefggg");
        String[] expected = {"","bc","ef",""};
        Assertions.assertArrayEquals(expected, aabcddddefgggs);
    }

    @Test
    public void removeRepeatCharacterTest5() {
        RemoveRepeatCharacter repeatCharacter = new RemoveRepeatCharacter();
        String[] abyyys = repeatCharacter.solution("abyyy");
        String[] expected = {"ab", ""};
        Assertions.assertArrayEquals(expected, abyyys);
    }

    @Test
    public void removeRepeatCharacterTest6() {
        RemoveRepeatCharacter repeatCharacter = new RemoveRepeatCharacter();
        String[] kkkkkkks = repeatCharacter.solution("kkkkkkk");
        String[] expected = {"", ""};
        Assertions.assertArrayEquals(expected, kkkkkkks);
    }
}
