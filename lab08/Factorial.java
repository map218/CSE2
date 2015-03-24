//Matt Palmieri
//3/19/15
//CSE2 lab08
//Factorial
//practice using methods to print out the factorial of a number

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class Factorial {
    //define main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //define scanner
        System.out.print("Please enter an integer: "); //request an integer input from user
        int input = myScanner.nextInt(); //set user input equal to input
        int sum = 0; //define sum and start it out as 0
        for(int i = 1; i <= input; i++){
            sum += factorial(i); //call factorial method and add that to the sum
        }
        print(sum); //call print method
  }
    public static int factorial(int key){ //define factorial method
        int multiple = 1; //set the multiple to start at 1
        for (int i = 1; i <= key; i++){
            multiple *= i; //multiply the multiple by the i value
        }
        System.out.println(multiple); //print out the multiple from the loop
        return multiple; // return multiple from the program
    }
    public static void print(int number){
        System.out.println("The super factorial is equal to " + number);
    }
}