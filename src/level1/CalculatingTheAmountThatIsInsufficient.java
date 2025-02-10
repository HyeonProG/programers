package level1;

public class CalculatingTheAmountThatIsInsufficient {

    public long solution(int price, long money, int count) {
        long answer = 0;
        for (int i = 0; i < count; i++) {
            money -= price * (i + 1);
        }
        if (answer > money) {
            answer = -money;
        } else {
            answer = 0;
        }

        return answer;
    }

}
