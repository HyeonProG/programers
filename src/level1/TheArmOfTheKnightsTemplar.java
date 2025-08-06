package level1;

public class TheArmOfTheKnightsTemplar {

    public int solution(int number, int limit, int power) {
        int answer = 0;
        // 1번부터 number번까지 각 수의 약수 개수를 저장할 배열
        // divCount[0]은 사용하지 않고 1~number만 쓸 것이므로 크기를 number+1로 선언
        int[] divCount = new int[number + 1];

        // ───────────────────────────────────────────────────────────────────
        // 1) 배수 누적 방식으로 모든 수의 약수 개수 한 번에 구하기
        //
        //    i가 j의 약수라는 건 “j % i == 0”인 경우이고,
        //    j는 i의 배수( i, 2i, 3i, … )이므로,
        //    i를 고정하고 j를 i씩 증가시키며 divCount[j]를 ++ 해 주면
        //    j번 수에 “i가 약수”라는 정보를 누적할 수 있다.
        // ───────────────────────────────────────────────────────────────────
        for (int i = 1; i <= number; i++) {
            // i의 배수들( i, 2i, 3i, … )을 돌면서
            // divCount[j]에 i가 약수임을 표시
            for (int j = i; j <= number; j += i) {
                divCount[j]++;
            }
        }

        // ───────────────────────────────────────────────────────────────────
        // 2) limit과 power 적용 후 총합 계산
        // ───────────────────────────────────────────────────────────────────
        for (int i = 1; i <= number; i++) {
            // 원하는 공격력(divCount[i])이 limit를 초과하면,
            // 대체 공격력인 power를 더하고, 그렇지 않으면 divCount[i]를 더함
            if (divCount[i] > limit) {
                answer += power;
            } else {
                answer += divCount[i];
            }
        }

        return answer;
    }
}
