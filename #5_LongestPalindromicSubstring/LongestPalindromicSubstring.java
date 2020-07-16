public class LongestPalindromicSubstring {

    /**
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     */


    public String longestPalindrome(String s) {
        String result = "";
        char[] tempArray = s.toCharArray();

        StringBuilder checker = new StringBuilder(s);
        if (checker.reverse().toString().equals(s)) {
            return s;
        }

        for (int left_index = 0 ; left_index < tempArray.length ; left_index++) {
            if (result.length() > tempArray.length - left_index) {
                break;
            }
            checker.replace(0,checker.length(), "");

            int pointer = left_index;
            while (pointer < tempArray.length) {
                checker.append(tempArray[pointer]);
                String tempA = checker.reverse().toString();
                String tempB = checker.reverse().toString();
                if (!(s.contains(tempA) && s.contains(tempB))) {
                    //兩邊都沒有相符，跳出
                    break;
                } else {
                    if (tempA.equals(tempB) && checker.length() > result.length()) {
                        result = checker.toString();
                    }
                }
                pointer++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        LongestPalindromicSubstring action = new LongestPalindromicSubstring();

        String test1 = "babad";
        String result1 = "bab";
        System.out.println(action.longestPalindrome(test1).equals(result1));

        String test2 = "cbbd";
        String result2 = "bb";
        System.out.println(action.longestPalindrome(test2).equals(result2));

        String test3 = "a";
        String result3 = "a";
        System.out.println(action.longestPalindrome(test3).equals(result3));

        String test4 = "bb";
        String result4 = "bb";
        System.out.println(action.longestPalindrome(test4).equals(result4));

        String test5 = "aacdefcaa";
        String result5 = "aa";
        System.out.println(action.longestPalindrome(test5).equals(result5));
    }
}
