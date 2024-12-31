package level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }
        Collections.reverse(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
