public class PlusOne {

    /**
     * Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
     *
     * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
     *
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     */

    public int[] plusOne(int[] digits) {
        digits[digits.length-1] = digits[digits.length-1] + 1;

        boolean overflow = false;
        for (int input_index = digits.length - 1; input_index >= 0 ; input_index--) {
            if (digits[input_index] > 9) {
                digits[input_index] = digits[input_index] % 10;
                if (input_index > 0) {
                    digits[input_index - 1] = digits[input_index - 1] + 1;
                } else {
                    overflow = true;
                }
            }
        }

        int[] result;
        if (overflow) {
            result = new int[digits.length + 1];
            result[0] = 1;
            for (int result_index = 0; result_index < digits.length ; result_index++) {
                result[result_index + 1] = digits[result_index];
            }
        } else {
            result = digits;
        }

        return result;
    }

    public static void main(String[] args) {
        PlusOne action = new PlusOne();

        int[] test1 = {1,2,3};
        int[] expect1 = {1,2,4};
        boolean array_check1 = true;

        int[] result1 = action.plusOne(test1);
        for (int index = 0; index < expect1.length; index++) {
            if (result1[index] != expect1[index]) {
                array_check1 = false;
            }
        }
        System.out.println(array_check1);


        int[] test2 = {9};
        int[] expect2 = {1,0};
        boolean array_check2 = true;

        int[] result2 = action.plusOne(test2);
        for (int index = 0; index < expect2.length; index++) {
            if (result2[index] != expect2[index]) {
                array_check2 = false;
            }
        }
        System.out.println(array_check2);


        int[] test3 = {9,9};
        int[] expect3 = {1,0,0};
        boolean array_check3 = true;

        int[] result3 = action.plusOne(test3);
        for (int index = 0; index < expect3.length; index++) {
            if (result3[index] != expect3[index]) {
                array_check3 = false;
            }
        }
        System.out.println(array_check3);


        int[] test4 = {9,8,7,6,5,4,3,2,1,0};
        int[] expect4 = {9,8,7,6,5,4,3,2,1,1};
        boolean array_check4 = true;

        int[] result4 = action.plusOne(test4);
        for (int index = 0; index < expect4.length; index++) {
            if (result4[index] != expect4[index]) {
                array_check4 = false;
            }
        }
        System.out.println(array_check4);

    }
}
