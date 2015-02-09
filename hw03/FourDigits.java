//Matt Palmieri
//2/9/15
//CSE2 Hw03 Problem 2
//Four Digits
//takes inputs for a number and prints out the first four digits after the decimal

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class FourDigits {
    //main method required for every java program
    public static void main(String [] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter a number: "); //enter input
        double userInput = myScanner.nextDouble(); //number that we will take the first four digits after the decimal place
        int digitsBeforeDecimal = (int) userInput; //find the digits before the decimal
        double digitsAfterDecimal=userInput-digitsBeforeDecimal; //remove the digits before the decimal
        int fourDigits= (int) (digitsAfterDecimal*10000); //multiply the decimal by 1000 and cut off all all excess digits
        System.out.println("The four digits are: "+fourDigits); //print out the result
        
    } // end of main method
} //end of class