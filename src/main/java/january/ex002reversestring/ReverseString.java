package january.ex002reversestring;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToReverse = scanner.nextLine();
        System.out.println();

        char[] letters = wordToReverse.toCharArray();

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
