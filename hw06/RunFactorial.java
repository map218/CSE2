//Matt Palmieri
//2/27/15
//CSE2 hw06
//RunFactorial
//use while loop to determine a factorial of a number between 9 and 16


//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class RunFactorial {
    //main method required for every java program
    public static void main(String [] args) {
        int factorial = 1; //define factorial for later use
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in );
        System.out.print("Please enter in integer between 9 and 16: ");
        if (myScanner.hasNextInt() == true){ //only accept integer inputs
            int userInput = myScanner.nextInt(); // take user input
            if (userInput>= 9 && userInput<= 16){ //only accept non-negative numbers
                int counter = userInput;
                while (counter>0){
                    factorial = factorial * counter;
                    counter--;
                }
                 System.out.println(userInput+"! = "+ factorial); //print sum
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
    } //end of main method
} //end of class    