package level1;

import java.util.PriorityQueue;

public class TheHallOfFame {

    public int[] solution(int k, int[] score) {
        // 명예의 전당을 유지할 최소 힙(PriorityQueue)
        // 항상 가장 낮은 점수가 맨 위에 위치함
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 매일 발표되는 명예의 전당의 최하위 점수를 저장할 배열
        int[] answer = new int[score.length];

        // 매일 한 명씩 가수가 출연
        for (int i = 0; i < score.length; i++) {
            // 해당 가수의 점수를 명예의 전당 후보(pq)에 추가
            pq.offer(score[i]);

            // 명예의 전당의 크기가 k를 초과하면, 가장 낮은 점수를 제거
            // → 상위 k명만 유지하기 위함
            if (pq.size() > k) {
                pq.poll();
            }

            // 현재 명예의 전당에서 가장 낮은 점수를 answer에 기록
            // → 명예의 전당 발표용 점수
            answer[i] = pq.peek();
        }

        // 최종 결과 반환
        return answer;
    }
}
