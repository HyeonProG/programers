package level1;

import java.util.HashMap;

public class MemoryScore {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 사진 수만큼 결과를 담을 배열 생성
        int[] answer = new int[photo.length];
        // 이름(name)과 그리움 점수(yearning)를 저장할 맵 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 1) name[i] → yearning[i] 매핑
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        // 2) 각 사진(photo[i])에 대해
        for (int i = 0; i < photo.length; i++) {
            // 사진 속 등장 인물(photo[i][j])을 하나씩 확인
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                // 맵에 점수가 있으면 더해주고, 없으면 0점(패스)
                if (map.containsKey(person)) {
                    answer[i] += map.get(person);
                }
            }
        }

        // 3) 계산된 결과 배열 반환
        return answer;
    }
}


