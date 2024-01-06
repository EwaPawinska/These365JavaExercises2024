package january.ex001randomnumbergenerator;

import java.util.Scanner;

/**
 * Task
 * In this challenge, you must read  integers from stdin and then print them to stdout.
 * Each integer must be printed on a new line.
 */

public class Print3GivenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
