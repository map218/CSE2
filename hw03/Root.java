//Matt Palmieri
//2/9/15
//CSE2 Hw03 Problem 2
//Cubed Root
//takes input and estimates the cube root
//print the number of minutes and the distance of trip in miles and the average mph

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class Root {
    //main method required for every java program
    public static void main(String [] args) {
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter a number: ");
        double input = myScanner.nextDouble(); //number that we will cube root
        double guess = input/3;
        guess=((2*guess*guess*guess)+(input))/(3*guess*guess); //make the guess more accurate
        guess=((2*guess*guess*guess)+(input))/(3*guess*guess); //make the guess more accurate
        guess=((2*guess*guess*guess)+(input))/(3*guess*guess); //make the guess more accurate
        guess=((2*guess*guess*guess)+(input))/(3*guess*guess); //make the guess more accurate
        guess=((2*guess*guess*guess)+(input))/(3*guess*guess); //make the guess more accurate
        guess=((2*guess*guess*guess)+(input))/(3*guess*guess); //make the guess more accurate
        System.out.println("The cubed root is: "+guess);
        System.out.println(guess+" * "+guess+" * "+guess+" = "+guess*guess*guess);
    } //end of method
} //end of class