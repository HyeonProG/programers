package level1;

public class TurnNaturalNumbersUpsideDownToFormAnArray {

    public int[] solution(long n) {
        String reverse = new StringBuilder(Long.toString(n)).reverse().toString();
        int[] answer = new int[reverse.length()];
        for (int i = 0; i < reverse.length(); i++) {
            answer[i] = reverse.charAt(i) - '0';
        }
        return answer;
    }

}
