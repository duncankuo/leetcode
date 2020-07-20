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
        for (int left_index = 0; left_index < temp.length ; left_index++) {
            if (temp_result.length() > result.length()) {
                result = temp_result.toString();
            }
            temp_result = temp_result.replace(0, temp_result.length(), "");
            for (int right_index = left_index ; right_index < temp.length ; right_index++) {
                if (temp_result.indexOf(temp[right_index]+"") > -1) {
                    break;
                }
                temp_result.append(temp[right_index]);
            }
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


    }
}
