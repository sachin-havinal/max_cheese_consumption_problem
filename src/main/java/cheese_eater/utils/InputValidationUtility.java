package main.java.cheese_eater.utils;

import main.java.cheese_eater.enums.ElementContraints;
import main.java.cheese_eater.enums.TestCaseConstraints;

import java.util.StringTokenizer;

public class InputValidationUtility {

    public static int validateTestCaseInput(String value) throws Exception {
        boolean is_test_case_input_integer = isInteger(value);
        if (!is_test_case_input_integer) throw new Exception("Entered value is not of type integer");
        int val = Integer.parseInt(value);
        if ((TestCaseConstraints.START.getValue() > val) || (TestCaseConstraints.END.getValue() < val)) {
            throw new Exception("Entered test case input is out of the range: 1 <= i/p <= 200 ");
        }
        return val;
    }

    public static int validateNumber(String value) throws Exception {
        boolean isNum = isInteger(value);
        if (!isNum) throw new Exception("Entered Number of elements is not valid");
        int number = Integer.parseInt(value);
        if ((ElementContraints.START.getValue() > number) || (ElementContraints.END.getValue() < number)) {
            throw new Exception("Entered array length is out of the range: 1 <= i/p <= 1000 ");
        }
        return number;
    }

    public static int[] validateArray(String array, int length) throws Exception {
        int[] nums = new int[length];
        StringTokenizer stringTokenizer = new StringTokenizer(array);
        int len = stringTokenizer.countTokens();
        if (len != length) throw new Exception("Array length mismatch.");
        for (int i = 0; i < length; i++) {
            try {
                nums[i] = Integer.parseInt(stringTokenizer.nextToken());
            } catch (Exception exception) {
                throw new Exception("Entered array element is not of type integer");
            }
        }
        return nums;
    }

    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException exception) {
            return false;
        }
        return true;
    }
}
