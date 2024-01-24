package january.ex002reversestring;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial sentence");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        StringBuilder sb;
        StringBuilder newSentence = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            sb = new StringBuilder(words[i]);
            newSentence.append(sb.reverse());
            newSentence.append(" ");
        }

        System.out.println("Old sentence: " + sentence);
        System.out.println("New Sentence: " + newSentence.toString().trim());
    }
}
