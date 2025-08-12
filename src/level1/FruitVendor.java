package level1;

import java.util.Arrays;

public class FruitVendor {

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 1) 오름차순 정렬
        Arrays.sort(score);

        // 2) 배열을 뒤집어서 내림차순으로 변환 (양끝 스왑)
        for (int i = 0, j = score.length - 1; i < j; i++, j--) {
            int tmp = score[i];
            score[i] = score[j];
            score[j] = tmp;
        }

        // 3) 앞에서부터 m개씩 묶을 때, 각 묶음의 최저 점수는
        //    해당 묶음의 마지막(= 인덱스 m-1, 2m-1, 3m-1 ...) 원소가 됨
        //    상자 가격 = (그 최저 점수) * m, 남는 사과는 자동으로 무시됨
        for (int i = m - 1; i < score.length; i += m) {
            answer += score[i] * m;
        }

        return answer;
    }
}
