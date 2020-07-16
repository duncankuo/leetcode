import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {

    /**
     * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
     * For example:
     *
     *     1 -> A
     *     2 -> B
     *
     */
    public String convertToTitle(int n) {
        char x = 'A';
        String result = "";

        while (n > 26) {
            result = (char)(x+((n-1)%26)) + result;
            n = (n-1)/26;
        }
        result = (char)(x + n - 1) + result;

        return result;
    }

    public static void main(String[] args){
        ExcelSheetColumnTitle action = new ExcelSheetColumnTitle();

        int test1 = 1;
        String result1 = "A";
        System.out.println(action.convertToTitle(test1).equals(result1));

        int test2 = 28;
        String result2 = "AB";
        System.out.println(action.convertToTitle(test2).equals(result2));

        int test3 = 701;
        String result3 = "ZY";
        System.out.println(action.convertToTitle(test3).equals(result3));

        int test4 = 52;
        String result4 = "AZ";
        System.out.println(action.convertToTitle(test4).equals(result4));


    }
}
