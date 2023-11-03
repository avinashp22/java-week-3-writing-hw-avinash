/**
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Programme_2_LeapYear {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);        //Scanner declaration
        System.out.println("Please enter the Year:");
        int year = scn.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        scn.close(); // closing the scanner
    }

    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
    }System.out.println("The year "+year +" is not a leap year ");
}

}

