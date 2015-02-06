//Matt Palmieri
//2/2/15
//CSE2 lab03
//Big Mac Program
//
//Uses Scanner class to obtain from the user how many Big Macs, the cost per Big Mac,
//and the percentage tax (which depends on the state; 6% in PA, 8% in MA, etc). It then displays the total cost.

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class BigMac{
    //main method required for all java programs
    public static void main(String[] args) {
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        int nBigMacs = myScanner.nextInt(); //number of Big Macs
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form of xx.xx): ");
        double bigMac$ = myScanner.nextDouble(); //cost per Big Mac
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble(); //tax rate
        taxRate/=100; //user enters percent, but we want proportion
        double cost$; //the actual cost
        int dollars;   //whole dollar amount of cost 
        int dimes; //amount of dimes (so cost has more digits)
        int pennies; //amount of pennies
        cost$ = nBigMacs*bigMac$*(1+taxRate); //calculate cost
        dollars=(int)cost$; //get amount of dollars in cost
        //% (mod) operator returns the remainder after the division:
        dimes=(int)(cost$*10)%10; //get dimes amount
        pennies=(int)(cost$*100)%10; //get amount ofpennies
        System.out.println("The total cost of " +nBigMacs +" BigMacs, at $" +(bigMac$) +" per Big Mac,");
        System.out.println("with a" +" sales tax of " + (int)(taxRate*100) + "%, is $" +dollars +"." +dimes +pennies);
        
    } //end of main method
} //end of class
