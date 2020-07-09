public class RemoveDuplicatesFromSortedArray {

    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
     *
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     */



    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int temp = nums[0];
        int count = 0;
        for(int num : nums) {
            if (temp != num) {
                count ++;
                temp = num;
                nums[count] = num;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray action = new RemoveDuplicatesFromSortedArray();

        int[] test1 = {1,1,2};
        int result1 = 2;
        int[] result_arr1 = {1,2};
        boolean array_check1 = true;
        action.removeDuplicates(test1);
        for (int index = 0; index < result1; index++) {
            if (test1[index] != result_arr1[index]) {
                array_check1 = false;
            }
        }
        System.out.println(array_check1);

        int[] test2 = {0,0,1,1,1,2,2,3,3,4};
        int result2 = 5;
        int[] result_arr2 = {0,1,2,3,4};
        boolean array_check2 = true;
        action.removeDuplicates(test2);
        for (int index = 0; index < result2; index++) {
            if (test2[index] != result_arr2[index]) {
                array_check2 = false;
            }
        }
        System.out.println(array_check2);

    }

}
