package level1;

public class MinimumRectangle {

    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int[] size : sizes) {
            int maxSize = Math.max(size[0], size[1]);
            int minSize = Math.min(size[0], size[1]);
            if (maxSize > max) {
                max = maxSize;
            }
            if (minSize > min) {
                min = minSize;
            }
        }
        return max * min;
    }

}
