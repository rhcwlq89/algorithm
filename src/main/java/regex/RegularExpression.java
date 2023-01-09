package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {
        String input = "Hello, World!";
        String regex = "W(or)(ld)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Match found!");
            System.out.println("Group 1: " + matcher.group(1));
            System.out.println("Group 2: " + matcher.group(2));
        } else {
            System.out.println("Match not found.");
        }
    }
}
