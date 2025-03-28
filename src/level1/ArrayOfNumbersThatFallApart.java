package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfNumbersThatFallApart {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        if (list.isEmpty()) {
            return new int[] { -1 };
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }

}
