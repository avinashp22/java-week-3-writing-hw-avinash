import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//Scanner declaration f
        System.out.println("Enter the first number : ");
        int x = scn.nextInt();
        System.out.println("Enter the second number : ");
        int y = scn.nextInt();
        System.out.println("Please select the calculation symbol +, -, *, / : ");
        char symbol = scn.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        scn.close();//Closing the scanner
    }

    // Calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {System.out.println(x + " + " + y + " = " + (x + y));}
        else if (symbol == '-') {System.out.println(x + " - " + y + " = " + (x - y));}
        else if (symbol == '*') {System.out.println(x + " x " + y + " = " + (x * y));}
        else if (symbol == '/') {System.out.println(x + " / " + y + " = " + (x / y));}
        else {System.out.println("Please enter correct symbol +,-,*,/");}
    }


}
