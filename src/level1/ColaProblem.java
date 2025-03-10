package level1;

public class ColaProblem {

    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int newCola = (n / a) * b;
            int emptyBottle = n % a;
            answer += newCola;
            n = newCola + emptyBottle;
        }
        return answer;
    }

}
