package level0;

public class RepeatedTextOutput {

    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                answer += currentChar;
            }
        }
        return answer;
    }

}
