package level1;

import java.util.ArrayList;
import java.util.List;

public class MockTest {

    public int[] solution(int[] answers) {
        // 각 수포자의 찍기 패턴
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 각 수포자가 맞힌 문제 수를 저장할 배열
        int[] scores = new int[3];

        // 모든 문제를 순회하면서 각 수포자의 답안과 비교
        for (int i = 0; i < answers.length; i++) {
            // i번째 문제 정답이 1번 수포자의 패턴과 같으면 점수 +1
            if (answers[i] == p1[i % p1.length]) {
                scores[0]++;
            }
            // 2번 수포자
            if (answers[i] == p2[i % p2.length]) {
                scores[1]++;
            }
            // 3번 수포자
            if (answers[i] == p3[i % p3.length]) {
                scores[2]++;
            }
        }

        // 최고 점수 계산
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 최고 점수를 받은 사람(동점 포함) 번호를 담을 리스트
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == max) {
                answer.add(i + 1); // 사람 번호는 1부터 시작하므로 i+1
            }
        }

        // 리스트를 int[]로 변환하여 반환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
