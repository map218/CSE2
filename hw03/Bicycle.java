//Matt Palmieri
//2/9/15
//CSE2 Hw03 Problem 1
//Cyclometer for a Bicycle
//takes inputs for the number of seconds and counts
//print the number of minutes and the distance of trip in miles and the average mph

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class Bicycle {
    //main method required for every java program
    public static void main(String [] args) {
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter the number of seconds: ");
        int nSeconds = myScanner.nextInt(); //number of seconds for the trip
        System.out.print("Enter the number of counts: ");
        int nCounts = myScanner.nextInt(); //number of counts for the trip
        double wheelDiameter=27.0; //diameter of the bicycle wheel in inches
        double PI=3.14159; //value of pi
        int feetPerMile=5280;  //mile to feet conversion rate
        int inchesPerFoot=12;   //feet to inches conversion rate
        int secondsPerMinute=60;  //minutes to seconds conversion rate
        double totalDistance;  //create variable for the distance
        totalDistance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile; //gives distance in miles
        double nMinutes=(nSeconds/secondsPerMinute); //converts seconds to minutes
        double mph=(totalDistance/(nMinutes/60)); //calculates mph
        totalDistance=((int) (totalDistance*100)/100.0); //cut off all unnecessary digits
        mph=((int) (mph*100)/100.0); //cut off all unnecessary digits
        System.out.println("The distance was "+ totalDistance+" miles, and took "+nMinutes+" minutes.");
        System.out.println("The average mph was "+mph);
    } //end of method
} //end of class