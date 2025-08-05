package level1;

public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 결과를 담을 배열을 n 크기로 생성
        String[] answer = new String[n];

        // 각 행에 대해 반복
        for (int i = 0; i < n; i++) {
            // 1) 두 지도의 같은 행을 OR 연산하여 벽 위치(1)를 합함
            int combined = arr1[i] | arr2[i];

            // 2) OR 결과를 이진수 문자열로 변환
            //    ex) combined == 5 → "101"
            String binary = Integer.toBinaryString(combined);

            // 3) 문자열 길이가 n이 되도록 왼쪽에 공백(' ') 채우기
            //    ex) n = 5, binary = "101" → "  101"
            String padded = String.format("%" + n + "s", binary);

            // 4) 앞서 채운 공백을 '0' 문자로 교체
            //    ex) "  101" → "00101"
            padded = padded.replace(' ', '0');

            // 5) 이진 문자열을 화면용 문자열로 변환
            //    '1' → '#', '0' → ' '
            StringBuilder row = new StringBuilder();
            for (char c : padded.toCharArray()) {
                if (c == '1') {
                    row.append('#');
                } else {
                    row.append(' ');
                }
            }

            // 6) 완성된 한 줄을 결과 배열에 저장
            answer[i] = row.toString();
        }

        // 7) 모든 행을 처리한 후 반환
        return answer;
    }
}