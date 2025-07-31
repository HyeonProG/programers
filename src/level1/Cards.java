package level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Cards {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards1, cards2 배열을 큐로 변환
        // 큐는 FIFO(First-In-First-Out)이므로 순서를 유지하면서 앞에서부터 꺼내기 좋음
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));

        // 목표 단어 배열(goal)을 순서대로 확인
        for (String word : goal) {
            // queue1의 맨 앞 단어가 현재 목표 단어와 같다면 꺼낸다
            if (!queue1.isEmpty() && queue1.peek().equals(word)) {
                queue1.poll();  // 일치하는 단어 사용 후 제거
            }
            // queue2의 맨 앞 단어가 현재 목표 단어와 같다면 꺼낸다
            else if (!queue2.isEmpty() && queue2.peek().equals(word)) {
                queue2.poll();  // 일치하는 단어 사용 후 제거
            }
            // 두 큐의 맨 앞 단어 모두 현재 단어와 다르면 목표 배열을 만들 수 없음
            else {
                return "No"; // 실패
            }
        }

        // 모든 단어가 순서대로 매칭되어 성공적으로 만들 수 있음
        return "Yes";
    }
}
