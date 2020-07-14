public class StringToIntegerATOI {

    /**
     * Implement atoi which converts a string to an integer.
     *
     * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
     *
     * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
     *
     * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
     *
     * If no valid conversion could be performed, a zero value is returned.
     *
     * Note:
     *
     * Only the space character ' ' is considered as whitespace character.
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
     */

    public int myAtoi(String str) {
        str = str.trim();
        char[] str_char = str.toCharArray();

        int sign = 1;
        int pointer = 0;
        long result = 0;
        if (str_char.length > 0 && str_char[0] == '-') {
            sign = -1;
            pointer = 1;
        } else if (str_char.length > 0 && str_char[0] == '+') {
            sign = 1;
            pointer = 1;
        }

        for (int index = pointer ; index < str_char.length ; index++){
            if ((str_char[index] >= '0' && str_char[index] <= '9')) {
                result = result * 10 + (str_char[index] - '0');

                if ((result * sign >= Integer.MAX_VALUE)) {
                    result = Integer.MAX_VALUE;
                    break;
                }

                if ((result * sign <= Integer.MIN_VALUE)) {
                    result = Integer.MIN_VALUE;
                    break;
                }
            } else {
                break;
            }
        }
        result = (result * sign);

        return (int)result;
    }



    public static void main(String[] args) {
        StringToIntegerATOI action = new StringToIntegerATOI();

        String test1 = "42";
        int result1 = 42;
        System.out.println(action.myAtoi(test1) == result1);

        String test2 = "   -42";
        int result2 = -42;
        System.out.println(action.myAtoi(test2) == result2);

        String test3 = "4193 with words";
        int result3 = 4193;
        System.out.println(action.myAtoi(test3) == result3);

        String test4 = "words and 987";
        int result4 = 0;
        System.out.println(action.myAtoi(test4) == result4);

        String test5 = "-91283472332";
        int result5 = -2147483648;
        System.out.println(action.myAtoi(test5) == result5);

        String test6 = "  0000000000012345678";
        int result6 = 12345678;
        System.out.println(action.myAtoi(test6) == result6);

        String test7 = "+-2";
        int result7 = 0;
        System.out.println(action.myAtoi(test7) == result7);

        String test8 = "9223372036854775808";
        int result8 = 2147483647;
        System.out.println(action.myAtoi(test8) == result8);

        String test9 = "+1";
        int result9 = 1;
        System.out.println(action.myAtoi(test9) == result9);
    }

}
