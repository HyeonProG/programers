package level0;

public class CompletionConditionsOfATriangle1 {

    public int solution(int[] sides) {
        int sum = 0;
        int maxSide = 0;
        for (int side : sides) {
            if (side > maxSide) {
                maxSide = side;
            }
            sum += side;
        }

        int otherSides = sum - maxSide;

        if (maxSide < otherSides) {
            return 1;
        } else {
            return 2;
        }
    }

}
