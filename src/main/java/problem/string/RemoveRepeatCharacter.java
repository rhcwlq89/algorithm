package problem.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveRepeatCharacter {

    public String[] solution(String s) {
        // only lowercase
        String pattern = "(.)\\1*";
        List<String> list = new ArrayList<>();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        StringBuilder builder = new StringBuilder();

        while (m.find()) {
            String sub = m.group();
            if(sub.length() <= 1) {
                builder.append(sub);
            } else {
                list.add(builder.toString());
                builder = new StringBuilder();
            }
        }

        list.add(builder.toString());

        String[] a = new String[list.size()];
        return list.toArray(a);
    }
}
