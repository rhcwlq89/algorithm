package problem.string;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class FrequencyOfCharacter {
    /**
     * character의 빈도로 스트링 정렬
     * tree -> eetr / eert
     *
     */

    public String solution(String input) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            String substring = input.substring(i, i + 1);
            map.put(substring, map.getOrDefault(substring, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        list.sort(Comparator.comparingInt(map::get).reversed());

        for (String s : list) {
            int count = map.get(s);
            for(int i =0; i< count; i++) {
                result += s;
            }
        }


        return result;
    }
}
