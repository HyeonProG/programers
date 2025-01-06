package level0;

public class BacterialGrowth {

    public int solution(int n, int t) {
        int answer = 0;
        for (int i = 0; i < t; i++) {
            n *= 2;
        }
        answer = n;
        return answer;
    }

}
