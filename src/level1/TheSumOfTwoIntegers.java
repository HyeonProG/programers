package level1;

public class TheSumOfTwoIntegers {

    public long solution(int a, int b) {
        long answer = 0;
        long start = Math.min(a, b);
        long end = Math.max(a, b);
        answer = end - start + 1;
        return answer * (start + end) / 2;
    }

}
