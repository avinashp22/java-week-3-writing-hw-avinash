import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //Scanner declaration
        System.out.println("Please enter the number: ");
        int number = scn.nextInt();
        isItOddOrEvenNumber(number);
        scn.close(); // closing the scanner
    }

    // Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}

