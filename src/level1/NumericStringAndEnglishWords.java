package level1;

public class NumericStringAndEnglishWords {

    public int solution(String s) {
        String[] words = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine" };
        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], Integer.toString(i));
        }
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

}
