public class ContainerWithMostWater {

    /**
     * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
     *
     * Note: You may not slant the container and n is at least 2.
     */

    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }

        int max = 0;
        for (int x_index = 0 ; x_index < height.length ; x_index++) {
            for (int y_index = 1 ; y_index < height.length ; y_index++) {
                int x_dist = y_index - x_index;
                int y_dist = Math.min(height[x_index], height[y_index]);

                if (x_dist * y_dist > max) {
                    max = x_dist * y_dist;
                }
            }
        }

        return max;
    }



    public static void main(String[] args) {
        ContainerWithMostWater action = new ContainerWithMostWater();

        int[] test1 = {1,8,6,2,5,4,8,3,7};
        int result1 = 49;
        System.out.println(action.maxArea(test1) == result1);

    }
}
