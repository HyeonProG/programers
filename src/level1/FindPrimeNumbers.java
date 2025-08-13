package level1;

public class FindPrimeNumbers {

    public int solution(int n) {
        int answer = 0;

        // ✅ 예외 처리: 2 미만이면 소수가 존재하지 않음
        if (n < 2) {
            return 0;
        }

        // isComposite[i] == true  → i는 '합성수(소수가 아님)'로 지워진 상태
        // isComposite[i] == false → i는 '아직 소수 후보'
        boolean[] isComposite = new boolean[n + 1];

        // 0, 1은 소수가 아님
        isComposite[0] = true;
        isComposite[1] = true;

        // 핵심: i*i <= n까지만 확인하면 충분
        for (int i = 2; i * i <= n; i++) {
            // i가 아직 지워지지 않았다 = i는 소수
            if (!isComposite[i]) {
                // i의 배수들을 지움(합성수 표시)
                // j의 시작을 i*i로 하는 이유:
                //   2*i, 3*i, ..., (i-1)*i는 더 작은 소수 단계에서 이미 지워졌기 때문
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        // 남아있는(지워지지 않은) 수가 소수
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                answer++;
            }
        }

        return answer;
    }
}
