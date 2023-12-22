package regex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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

        String a = "";
        List<String> list = new LinkedList<>();

//        StringBuilder builder = new StringBuilder();
//        builder.r

        LinkedList<String> list = new LinkedList<>();
        
        TreeSet<String> set = new TreeSet<>();
        LocalDate date = LocalDate.now();
        LocalDate.parse("2020-01-01", DateTimeFormatter.ISO_DATE_TIME);
        LocalDate.parse("2020.01.01");

//        StringJoiner joiner = new StringJoiner(" ");
//        joiner.

        Map<Integer, Integer> map = new HashMap<>();
        map.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

}
