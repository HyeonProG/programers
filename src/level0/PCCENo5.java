package level0;

import java.util.Arrays;

public class PCCENo5 {

    public static void main(String[] args) {
        String[] cpr = { "check", "call", "pressure", "respiration", "repeat"};
        int[] answer = { 0, 0, 0, 0, 0 };
        String[] basic_order = { "check", "call", "pressure", "respiration", "repeat" };

        for (int i = 0; i < cpr.length; i++) {
            for (int j = 0; j < basic_order.length; j++) {
                if (cpr[i].equals(basic_order[j])) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }

}
