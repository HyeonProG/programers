package level1;

import java.util.Arrays;

public class PlaceInDescendingOrderOfIntegers {

    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuilder desc = new StringBuilder(new String(chars)).reverse();
        answer = Long.parseLong(desc.toString());
        return answer;
    }

}
