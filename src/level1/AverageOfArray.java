package level1;

public class AverageOfArray {

    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        answer = (double) sum / arr.length;

        return answer;
    }

}
