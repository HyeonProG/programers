package level1;

public class ImportMiddleLetter {

    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int mid = length / 2;
        if (length % 2 == 0) {
            answer = s.substring(mid - 1, mid + 1);
        } else {
            answer = s.substring(mid, mid + 1);
        }
        return answer;
    }

}
