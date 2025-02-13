package level1;

public class GCDAndLCM {

    public int[] solution(int n, int m) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        int lcm = Math.max(n, m);
        while (true) {
            if (lcm % n == 0 && lcm % m == 0) {
                break;
            }
            lcm++;
        }
        int[] answer = new int[] { gcd, lcm };
        return answer;
    }

}
