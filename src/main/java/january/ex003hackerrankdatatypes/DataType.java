package january.ex003hackerrankdatatypes;

/*
 Declare  variables i, d and s: one of type int, one of type double, and one of type String.
 Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
 Use the  operator to perform the following operations:
 Print the sum of  plus your int variable on a new line.
 Print the sum of  plus your double variable to a scale of one decimal place on a new line.
 Concatenate  with the string you read as input and print the result on a new line.
*/

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Hackerrank ";

        Scanner scanner= new Scanner(System.in);
        int j;
        double e;
        String t;

        j = scanner.nextInt();
        e = scanner.nextDouble();
        scanner.nextLine();
        t = scanner.nextLine();

        System.out.println(i + j);
        System.out.println(d + e);
        System.out.println(s + t);
    }
}
