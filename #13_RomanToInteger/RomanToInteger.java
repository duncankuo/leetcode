import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     *
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * There are six instances where subtraction is used:
     *
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     */


    public int romanToInt(String s) {
        String[] input = s.split("");
        int[] temp_input = new int[input.length];

        int result = 0;
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("I", 1);
        mapping.put("V", 5);
        mapping.put("X", 10);
        mapping.put("L", 50);
        mapping.put("C", 100);
        mapping.put("D", 500);
        mapping.put("M", 1000);

        for (int index = 1; index < input.length ; index++) {
            if (mapping.get(input[index-1]) < mapping.get(input[index])) {
                //前者小於後者，為減項
                temp_input[index - 1] = mapping.get(input[index - 1]) * -1;
            } else {
                temp_input[index - 1] = mapping.get(input[index - 1]);
            }
        }
        temp_input[input.length - 1] = mapping.get(input[input.length - 1]);

        for (int temp_num : temp_input) {
            result += temp_num;
        }
        return result;
    }



    public static void main(String[] args) {
        RomanToInteger action = new RomanToInteger();

        String test1 = "III";
        int result1 = 3;
        System.out.println(action.romanToInt(test1) == result1);

        String test2 = "IV";
        int result2 = 4;
        System.out.println(action.romanToInt(test2) == result2);

        String test3 = "IX";
        int result3 = 9;
        System.out.println(action.romanToInt(test3) == result3);

        String test4 = "LVIII";
        int result4 = 58;
        System.out.println(action.romanToInt(test4) == result4);

        String test5 = "MCMXCIV";
        int result5 = 1994;
        System.out.println(action.romanToInt(test5) == result5);

    }
}
