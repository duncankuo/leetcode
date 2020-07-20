public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     *
     */

    public int lengthOfLongestSubstring(String s) {

        StringBuilder temp_result = new StringBuilder();
        String result = "";

        if (s.length() == 1) {
            return 1;
        }

        char[] temp = s.toCharArray();
        int left_index = 0;
        int right_index = 0;
        while (right_index < temp.length) {
            if (temp_result.indexOf(temp[right_index]+"") == -1) {
                temp_result.append(temp[right_index]);
            } else {
                left_index = temp_result.indexOf(temp[right_index]+"");
                temp_result = temp_result.replace(0, left_index + 1  , "").append(temp[right_index]);

            }
            if (temp_result.length() > result.length()) {
                result = temp_result.toString();
            }
            right_index++;
        }

        return result.length();
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters action = new LongestSubstringWithoutRepeatingCharacters();

        String test1 = "abcabcbb";
        int result1 = 3;
        System.out.println(action.lengthOfLongestSubstring(test1) == (result1));

        String test2 = "bbbbb";
        int result2 = 1;
        System.out.println(action.lengthOfLongestSubstring(test2) == (result2));

        String test3 = "pwwkew";
        int result3 = 3;
        System.out.println(action.lengthOfLongestSubstring(test3) == (result3));

        String test4 = " ";
        int result4 = 1;
        System.out.println(action.lengthOfLongestSubstring(test4) == (result4));

        String test5 = "au";
        int result5 = 2;
        System.out.println(action.lengthOfLongestSubstring(test5) == (result5));

        String test6 = "aabaab!bb";
        int result6 = 3;
        System.out.println(action.lengthOfLongestSubstring(test6) == (result6));

        String test7 = "dvdf";
        int result7 = 3;
        System.out.println(action.lengthOfLongestSubstring(test7) == (result7));


    }
}
