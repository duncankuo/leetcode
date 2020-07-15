public class Sqrt {

    /**
     * Implement int sqrt(int x).
     *
     * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
     *
     * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
     *
     */

    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }

        long start = 1;
        long end = x;

        long result = 0;

        while (start <= end) {
            if (result * result == x) {
                break;
            } else {
               if (result * result > x) {
                   end = result - 1;
                } else {
                   start = result + 1;
               }
            }
            result = (start + end) / 2;
        }

        System.out.println(result);
        return (int)result;
    }



    public static void main(String[] args) {
        Sqrt action = new Sqrt();

        int test1 = 4;
        int result1 = 2;
        System.out.println(action.mySqrt(test1) == (result1));

        int test2 = 8;
        int result2 = 2;
        System.out.println(action.mySqrt(test2) == (result2));

        int test3 = 2147395599;
        int result3 = 46339;
        System.out.println(action.mySqrt(test3) == (result3));

        int test4 = 1;
        int result4 = 1;
        System.out.println(action.mySqrt(test4) == (result4));

        int test5 = 3;
        int result5 = 1;
        System.out.println(action.mySqrt(test5) == (result5));

    }
}
