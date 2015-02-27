//Matt Palmieri
//2/27/15
//CSE2 hw06
//GetIntegers
//Use loops to add 5 integers and print the sum


//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class GetIntegers {
    //main method required for every java program
    public static void main(String [] args) {
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in );
        System.out.println("Please enter five non-negative integers: ");
        int counter = 0; //counter for while loop
        int sum = 0; //sum of integers
        while (counter<5){
            System.out.print("");
            if (myScanner.hasNextInt() == true){ //only accept integer inputs
                int nextNumber = myScanner.nextInt(); // take user inputs
                if (nextNumber >= 0){ //only accept non-negative numbers
                    sum = sum + nextNumber; //add number to the sum
                    counter++; //add to counter (avoids infinite loop)
                }
                else{
                System.out.println("Invalid input, enter again"); //if input is invalid
                return;
                 }
            }
            else{
                System.out.println("Invalid input, enter again"); //if input is invalid
                return;
            }
        }
        System.out.println("Sum is "+ sum); //print sum
    } //end of main method
} //end of class    