package level1;

import java.util.HashSet;
import java.util.Set;

public class Fonkemon {
    public int solution(int[] nums) {
        // 1. 중복을 제거한 번호(종류)만 남기기 위해 HashSet 사용
        Set<Integer> set = new HashSet<>();

        // 2. 배열 nums를 순회하면서 각 폰켓몬 번호를 Set에 추가
        //    중복된 번호는 한 번만 저장되므로, 최종적으로 "종류 개수"가 된다.
        for (int n : nums) {
            set.add(n);
        }

        // 3. 가져갈 수 있는 최대 마리 수는 nums.length/2 이므로,
        //    실제로 가져갈 수 있는 종류 수는
        //    (실제 종류 개수) vs. (가져갈 수 있는 마리 수) 중 작은 값
        return Math.min(set.size(), nums.length / 2);
    }
}
