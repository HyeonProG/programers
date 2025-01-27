package level1;

public class FindKimInSeoul {

    public String solution(String[] seoul) {
        String answer = "";
        String str = "Kim";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(str)) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }

}
