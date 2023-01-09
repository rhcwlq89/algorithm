package regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class regexTest {

    @Test
    public void testRegexGreedyQuantifiers() {
        // X? -> 0 <= X <= 1
        assertFalse(compile("a?b").matcher("aab").matches());
        assertTrue(compile("a?b").matcher("ab").matches());
        assertTrue(compile("a?b").matcher("b").matches());
        assertTrue(compile("a?b").matcher("aab").find());
        assertTrue(compile("a?b").matcher("ab").find());
        assertTrue(compile("a?b").matcher("b").find());

        // X* -> 0 <= X
        assertTrue(compile("a*b").matcher("aab").matches());
        assertTrue(compile("a*b").matcher("ab").matches());
        assertTrue(compile("a*b").matcher("b").matches());
        assertTrue(compile("a*b").matcher("aab").find());
        assertTrue(compile("a*b").matcher("ab").find());
        assertTrue(compile("a*b").matcher("b").find());

        // X+ -> 1 <= X
        assertTrue(compile("a+b").matcher("aab").matches());
        assertTrue(compile("a+b").matcher("ab").matches());
        assertFalse(compile("a+b").matcher("b").matches());
        assertTrue(compile("a+b").matcher("aab").find());
        assertTrue(compile("a+b").matcher("ab").find());
        assertFalse(compile("a+b").matcher("b").find());

        // X{n} -> x == X
        assertTrue(compile("a{3}b").matcher("aaab").matches());
        assertTrue(compile("a{2}b").matcher("aab").matches());
        //noinspection RegExpSimplifiable
        assertTrue(compile("a{1}b").matcher("ab").matches());
        assertTrue(compile("a{0}b").matcher("b").matches());

        // X{n, } -> n <= X
        assertTrue(compile("a{3,}b").matcher("aaaab").matches());
        assertTrue(compile("a{3,}b").matcher("aaab").matches());
        assertFalse(compile("a{3,}b").matcher("aab").matches());
        assertFalse(compile("a{3,}b").matcher("b").matches());

        // X{n, m}  -> n <= X <=m
        assertFalse(compile("a{3,5}b").matcher("aaaaaaab").matches());
        assertFalse(compile("a{3,5}b").matcher("aaaaaab").matches());
        assertTrue(compile("a{3,5}b").matcher("aaaaab").matches());
        assertTrue(compile("a{3,5}b").matcher("aaaab").matches());
        assertTrue(compile("a{3,5}b").matcher("aaab").matches());
        assertFalse(compile("a{3,5}b").matcher("aab").matches());
        assertFalse(compile("a{3,5}b").matcher("b").matches());
    }

    @Test
    public void testRegexReluctantQuantifiers() {
        // X?? -> 0 <= X <= 1
        assertFalse(compile("a??b").matcher("aab").matches());
        assertTrue(compile("a??b").matcher("ab").matches());
        assertTrue(compile("a??b").matcher("b").matches());
        assertTrue(compile("a??b").matcher("aab").find());
        assertTrue(compile("a??b").matcher("ab").find());
        assertTrue(compile("a??b").matcher("b").find());
    }

    @Test
    public void testRegex() {
        String s = "(.)\\1*";
        Pattern pattern = compile(s);
        Matcher matcher = pattern.matcher("aaabced");
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
