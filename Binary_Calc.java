import java.util.Scanner;

public class Binary_Calc {

    public static void main(String[] args) {

        // extra variables and arrays
        int n;
        int i = 1;
        int[] code = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        Scanner userInput = new Scanner(System.in);

        // user prompt
        System.out.print("Enter any number: ");

        // number input
        int decimalNumber = userInput.nextInt();

        // storing first iteration into the array
        code[0] = decimalNumber % 2;

        // storing decimalNumber into another variable n for manipulations
        n = decimalNumber;

        // algorithm
        while (n != 0) {

            n /= 2;
            code[i] = n % 2;
            i++;

        }

        System.out.print("[");

        for (int j = 9; j >= 0; j--) {

            System.out.print(code[j] + " ");

        }

        System.out.print("]");

        userInput.close();
    }
}
