public class PalindromeNumber {
    /**
     * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
     */

    public boolean isPalindrome(int x) {
        boolean result = false;
        int temp = x;
        if (temp >= 0) {

            int compare = 0;
            while (temp > 0) {
                compare = (compare * 10) + (temp % 10);
                temp = temp / 10;
            }

            if (compare == x) {
                result = true;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        PalindromeNumber action = new PalindromeNumber();


        int test1 = 121;
        boolean result1 = true;
        System.out.println(action.isPalindrome(test1) == result1);

        int test2 = -121;
        boolean result2 = false;
        System.out.println(action.isPalindrome(test2) == result2);

        int test3 = 10;
        boolean result3 = false;
        System.out.println(action.isPalindrome(test3) == result3);

    }
}
