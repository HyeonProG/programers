package level1;

public class HandlingStringBasic {

    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("\\d+");
    }

}
