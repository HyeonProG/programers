package level1;

public class CaesarsCode {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer.append(c);
                continue;
            }
            if (c >= 'A' && c <= 'Z') {
                answer.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else {
                answer.append((char) ((c - 'a' + n) % 26 + 'a'));
            }
        }
        return answer.toString();
    }

}
