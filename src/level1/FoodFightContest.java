package level1;

public class FoodFightContest {

    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            left.append(String.valueOf(i).repeat(food[i] / 2));
        }

        String right = new StringBuilder(left).reverse().toString();
        return left.toString() + "0" + right;
    }

}
