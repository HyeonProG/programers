package level1;

import java.util.Arrays;

public class PlaceStringInDescendingOrder {

    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String reverse = new String(chars);
        answer = new StringBuilder(reverse).reverse().toString();
        return answer;
    }

}
