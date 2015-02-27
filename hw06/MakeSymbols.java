//Matt Palmieri
//2/27/15
//CSE2 hw06
//MakeSymbols
//Use a do while loop to make sybmols

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class MakeSymbols {
    //main method required for every java program
    public static void main(String [] args) {
        int count = 0; //define count
        int rand = (int) (Math.random() * 101); //random number
        System.out.println("Random Number Generated: "+rand);
        System.out.print("The Output Pattern: ");
        do{
            if (rand % 2 == 0) {
                System.out.print("*");
            }
            else {
                System.out.print("&");
            }
            count++;
        } while(count < rand);
        System.out.println("");
    } //end of main method
} //end of class