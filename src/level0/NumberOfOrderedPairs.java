package level0;

public class NumberOfOrderedPairs {

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += 1;
            }
        }
        return answer;
    }

}