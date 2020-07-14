public class AddBinary {
    /**
     * Given two binary strings, return their sum (also a binary string).
     *
     * The input strings are both non-empty and contains only characters 1 or 0.
     */

    public String addBinary(String a, String b) {
        String[] arr_a = a.split("");
        String[] arr_b = b.split("");

        int indexA = arr_a.length - 1;
        int indexB = arr_b.length - 1;

        String numA;
        String numB;
        boolean carry = false;
        String temp = "";
        StringBuilder result = new StringBuilder();
        while (indexA >= 0 || indexB >= 0) {
            numA = "0";
            numB = "0";

            if (indexA >= 0) {
                numA = arr_a[indexA];
            }
            if (indexB >= 0) {
                numB = arr_b[indexB];
            }

            if (numA.equals("1") && numB.equals("1")) {
                if (carry) {
                    temp = "1";
                } else {
                    temp = "0";
                }
                carry = true;
            } else if ((numA.equals("1") && numB.equals("0")) || (numA.equals("0") && numB.equals("1"))) {
                if (carry) {
                    temp = "0";
                    carry = true;
                } else {
                    temp = "1";
                    carry = false;
                }
            } else {
                if (carry) {
                    temp = "1";
                } else {
                    temp = "0";
                }
                carry = false;
            }
            indexA--;
            indexB--;

            result.insert(0, temp);
        }
        if (carry) {
            result.insert(0, "1");
        }

        return result.toString();
    }


    public static void main(String[] args) {
        AddBinary action = new AddBinary();

        String test1_1 = "11";
        String test1_2 = "1";
        String result1 = "100";
        System.out.println(action.addBinary(test1_1, test1_2).equals(result1));

        String test2_1 = "1010";
        String test2_2 = "1011";
        String result2 = "10101";
        System.out.println(action.addBinary(test2_1, test2_2).equals(result2));
    }
}
