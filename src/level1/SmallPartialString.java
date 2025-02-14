package level1;

public class SmallPartialString {

    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        long target = Long.parseLong(p);
        for (int i = 0; i <= t.length() - length; i++) {
            long num = Long.parseLong(t.substring(i, i + length));
            if (num <= target) {
                answer += 1;
            }
        }
        return answer;
    }

}
