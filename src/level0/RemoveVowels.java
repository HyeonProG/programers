package level0;

public class RemoveVowels {

    public String solution(String my_string) {
        String target = "[aeiou]";
        return my_string.replaceAll(target, "");
    }

}
