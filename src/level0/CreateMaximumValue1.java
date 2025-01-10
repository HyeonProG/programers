package level0;

public class CreateMaximumValue1 {

    public int solution(int[] numbers) {
        int maxNum = 0;
        int secNum = 0;
        for (int number : numbers) {
            if (number > maxNum) {
                secNum = maxNum;
                maxNum = number;
            } else if (number > secNum) {
                secNum = number;
            }
        }

        return maxNum * secNum;
    }

}
