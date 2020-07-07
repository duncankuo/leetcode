public class two_sum {

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     */


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int first_index = 0 ; first_index < nums.length ; first_index++) {
            for (int second_index = first_index+1; second_index < nums.length ; second_index++){
                if (target == nums[first_index] + nums[second_index]) {
                    result[0] = first_index;
                    result[1] = second_index;
                    break;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] test1 = {2, 7, 11, 15};
        int result1 = 9;
        two_sum action = new two_sum();
        int[] result = action.twoSum(test1, result1);
        System.out.println(result[0] + "," + result[1]);


    }

}
