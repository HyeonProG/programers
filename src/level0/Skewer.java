package level0;

public class Skewer {

    public int solution(int n, int k) {
        int answer = 0;
        int skewer = 12000 * n;
        int drink = 2000 * k;
        int discount = (n / 10) * 2000;
        answer = skewer + drink - discount;
        return answer;
    }

}
