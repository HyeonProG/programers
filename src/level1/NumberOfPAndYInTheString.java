package level1;

public class NumberOfPAndYInTheString {

    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for (char c : s.toCharArray()) {
            char lowerChar = Character.toLowerCase(c);
            if (lowerChar == 'p') {
                p++;
            } else if (lowerChar == 'y') {
                y++;
            }
        }

        if (p != y) {
            return false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

}
