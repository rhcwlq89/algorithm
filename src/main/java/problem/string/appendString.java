package problem.string;

public class appendString {

    public String Solution(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        int length = length1 > length2 ? length2 : length1;
        int position1 = 0;
        int position2 = 0;

        for(int i = 1; i <= length; i++) {
            String sub1 = s1.substring(length1 - i, length1);
            String sub2 = s2.substring(0, i);

            if(sub1.equals(sub2)) {
                position1 = i;
            }

            String sub3 = s1.substring(0, i);
            String sub4 = s2.substring(length2 - i, length2);

            if(sub3.equals(sub4)) {
                position2 = i;
            }
        }

        if(position1 == position2) {
            return s1.compareTo(s2) >= 0? s1.substring(0, position1) + s2 : s2.substring(0, position2) + s1;
        } else {
            return position1 > position2 ? s1.substring(0, position1) + s2 : s2.substring(0, position2) + s1;
        }
    }

}
