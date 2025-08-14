package level1;

public class CreatePrimeNumber {

    public int solution(int[] nums) {
        int answer = 0;      // 소수 합을 만드는 3개 조합의 개수
        int n = nums.length; // 배열 길이
        System.out.println("Hello Java");

        // 서로 다른 3개를 뽑는 모든 조합을 인덱스 기준으로 생성 (i < j < k)
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k]; // 세 수의 합
                    if (isPrime(sum)) {    // 합이 소수인지 판별
                        answer++;          // 소수면 카운트 증가
                    }
                }
            }
        }
        return answer;
    }

    // √x 까지만 나눠보는 소수 판별 (기본/정석 방법)
    private boolean isPrime(int x) {
        if (x < 2)
            return false;         // 0,1은 소수가 아님
        for (int i = 2; i * i <= x; i++) // i가 √x를 넘기 전까지 시도
            if (x % i == 0)
                return false;// 나누어떨어지면 합성수
        return true;                     // 어떤 i로도 나눠지지 않으면 소수
    }
}
