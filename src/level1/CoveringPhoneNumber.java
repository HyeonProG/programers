package level1;

public class CoveringPhoneNumber {

    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        String hidden = "*".repeat(length - 4);
        String visible = phone_number.substring(length - 4);
        answer = hidden + visible;
        return answer;
    }

}
