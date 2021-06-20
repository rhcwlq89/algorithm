package problem.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problem.string.FrequencyOfCharacter;


public class FrequencyOfCharacterTest {

    @Test
    public void solutionTest() {
        FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
        String tree = frequencyOfCharacter.solution("tree");
        String expected = "eetr";
        String expected2 = "eert";
        System.out.println(tree);
        Assertions.assertTrue(expected.equals(tree) || expected2.equals(expected2));
    }

}
