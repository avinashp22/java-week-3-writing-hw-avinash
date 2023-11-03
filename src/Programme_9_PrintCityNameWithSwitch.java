import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */

public class Programme_9_PrintCityNameWithSwitch {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//Scanner declaration
        System.out.println("Please enter alphabet between A and F : ");
        String city = scn.next().toUpperCase();
        //Create object and call instance method
        Programme_9_PrintCityNameWithSwitch cityName = new Programme_9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        scn.close();    //Closing the scanner
}
    //Printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A": System.out.println("Aberdeen");
            break;
            case "B": System.out.println("Belfast");
            break;
            case "C": System.out.println("Cambridge");
            break;
            case "D": System.out.println("Derby");
            break;
            case "E": System.out.println("Edinburgh");
            break;
            case "F": System.out.println("Feltham");
            break;
            default: System.out.println("The alphabet you enter is not between A and F");
        }

    }
}