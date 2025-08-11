package level1;

public class OverPainting {

    public int solution(int n, int m, int[] section) {
        int answer = 0;       // 롤러로 칠한 횟수
        int currentEnd = 0;   // 지금까지 칠해져 있다고 보는 마지막 구역 번호(닫힌 구간의 끝)

        // section은 다시 칠해야 하는 구역 번호를 왼쪽 → 오른쪽으로 순회
        for (int pos : section) {
            // 이미 이전에 칠한 범위(currentEnd) 안에 들어오면 스킵
            if (pos <= currentEnd) {
                continue;
            }
            // 새로 칠해야 하는 가장 왼쪽 구역을 만났으니, 여기서 롤러 한 번
            answer++;

            // 이번에 pos를 시작으로 길이 m만큼 칠하면,
            // 커버되는 마지막 구역은 pos + m - 1 (닫힌 구간이므로 -1)
            currentEnd = pos + m - 1;
        }
        return answer;
    }
}
