public class ReverseInteger {

    /**
     * Given a 32-bit signed integer, reverse digits of an integer.
     * Note:
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     */
    public int reverse_integer(int x) {
        int result = 0;

        long input = (long)x;
        boolean negative = false;
        if (input < 0) {
            negative = true;
            input *= -1;
        }

        long rev = 0;
        while (input / 10 > 0) {
            rev = (rev * 10) + (input % 10);
            input = input / 10;
        }
        rev = (rev * 10) + (input % 10);

        if (negative) {
            rev *= -1;
        }

        if (rev > Integer.MIN_VALUE && rev < Integer.MAX_VALUE) {
            result = (int)rev;
        }

        return result;
    }




    public static void main(String[] args) {
        ReverseInteger action = new ReverseInteger();
        int test1 = 123;
        int result1 = 321;
        System.out.println(action.reverse_integer(test1) == result1);

        int test2 = -123;
        int result2 = -321;
        System.out.println(action.reverse_integer(test2) == result2);

        int test3 = 120;
        int result3 = 21;
        System.out.println(action.reverse_integer(test3) == result3);

        int test4 = 463847412;
        int result4 = 214748364;
        System.out.println(action.reverse_integer(test4) == result4);

        int test5 = -2147483412;
        int result5 = -2143847412;
        System.out.println(action.reverse_integer(test5) == result5);
    }

}