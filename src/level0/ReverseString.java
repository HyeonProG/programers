package level0;

public class ReverseString {

    public String solution(String my_string) {
        String answer = my_string;
        StringBuilder sb = new StringBuilder(answer);
        String reverse = sb.reverse().toString();
        return reverse;
    }

}
