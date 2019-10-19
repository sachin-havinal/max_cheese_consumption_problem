package main.java.cheese_eater;

import java.util.Scanner;

import main.java.cheese_eater.utils.InputValidationUtility;
import main.java.cheese_eater.lib.MaxCheeseEater;

public class MaxCheeseEaterMain {

    private MaxCheeseEater maxCheeseEater;
    private int N;
    private int[] result;

    private MaxCheeseEaterMain(int N) {
        this.maxCheeseEater = new MaxCheeseEater();
        this.N = N;
        this.result = new int[N];
    }

    public void setN(int n) {
        this.N = n;
    }

    public void calculateMaxCheeseConsumption(int[] array, int i) {
        this.result[i] = this.maxCheeseEater.getMaxCheeseConsumption(array, array.length);
    }

    public void populateResult() {
        System.out.println("######### RESULT ######### ");
        for (int i = 0; i < this.N; i++) {
            System.out.println(this.result[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter No. of test cases to be executed: ");
            String test_case_input = scanner.nextLine();
            int value = InputValidationUtility.validateTestCaseInput(test_case_input);
            MaxCheeseEaterMain maxCheeseEaterMain = new MaxCheeseEaterMain(value);
            for (int i = 0; i < value; i++) {
                System.out.print("Enter number of elements in the array: ");
                String number = scanner.nextLine();
                int num = InputValidationUtility.validateNumber(number);
                System.out.print("Enter space separated elements of an array: ");
                String array = scanner.nextLine();
                int[] arr = InputValidationUtility.validateArray(array, num);
                maxCheeseEaterMain.calculateMaxCheeseConsumption(arr, i);
            }
            maxCheeseEaterMain.populateResult();
        } catch (Exception exception) {
            throw exception;
        }
    }
}
