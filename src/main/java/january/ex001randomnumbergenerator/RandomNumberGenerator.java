package january.ex001randomnumbergenerator;

import java.util.Scanner;

/** 01.01.2024 Exercise 001: RandomNumberGenerator
 * This programs generates randomized number from 1 to 1000 that you can guess
 * It helps you by pointing if your guess is bigger or smaller than the actual number
 */

public class RandomNumberGenerator {

    public static void main(String[] args) {

        int randomNumber = generateRandomFrom1To1000UsingMath();
        Scanner scanner = new Scanner(System.in);
        int givenNumber = 0;

        while (givenNumber != randomNumber) {
            System.out.println("Guess random number from 1 to 1000");
            givenNumber = scanner.nextInt();
            if (givenNumber == randomNumber) {
                System.out.println("Congratulations! you have guessed the number: " + randomNumber);
            } else if (givenNumber < randomNumber) {
                System.out.println("Pick some higher number");
            } else {
                System.out.println("Pick smaller number");
            }
        }
    }

    private static int generateRandomFrom1To1000UsingMath() {
        return (int) (Math.random() * (1000 - 1) + 1);
    }
}
