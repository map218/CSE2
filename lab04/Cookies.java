//Matt Palmieri
//2/13/15
//CSE2 lab04
//Cookies
//uses the Scanner class to obtain number of cookies, numbger of people and how many cookies per person
//Program tells user if the number of cookies is evenly divisible and if there is enough
// If there are not enough cookies tell the user how many more are need

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class Cookies {
    //main method required for every java program
    public static void main(String [] args) {
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter number of People: ");
        if(myScanner.hasNextInt()== true){
            int nPeople = myScanner.nextInt();
            if(nPeople > 0){
                System.out.print("Enter number of Cookies: ");
                if(myScanner.hasNextInt()== true){
                    int nCookies = myScanner.nextInt();
                    if(nPeople > 0){
                        System.out.print("How many do you want each person to get? ");
                        if(myScanner.hasNextInt()== true){
                        int cookiesPerPerson = myScanner.nextInt();
                            if(cookiesPerPerson > 0){
                                if(nCookies >= (nPeople*cookiesPerPerson)){
                                    if((nCookies%(nPeople*cookiesPerPerson)) == 0){
                                    System.out.println("You have enough cookies for each and the amount will divide up evenly");
                                    } //end of seventh if
                                    else{
                                    System.out.println("You have enough cookies, but they do not divide up evenly");
                                    } //end of seventh else
                                } //end of sixth if
                                else{
                                    int cookiesNeeded = (nPeople*cookiesPerPerson) - nCookies;
                                    System.out.println("You do not have enough cookies, you need to buy at least "+cookiesNeeded+ " more");
                                } //end of sixth elsa
                            }
                            else{
                                System.out.println("You did not enter a number greater than 0");
                                } //end of fifth else
                        } //end of fifth if
                        else{
                            System.out.println("You did not enter an int");
                        } //end of fourth else 
                        
                    } //end of fourth if
                    
                    else { 
                        System.out.println("You did not enter a number greater than 0");
                    } //end of fourth else
                    
                } //end of third if    
                
                else{
                    System.out.println("You did not enter an int");
                } //end of third else
                
            } //end of second if    
            
            else{
            System.out.println("You did not enter a number greater than 0");
            } // end of second else
            
        } //end of first if
            
        else{
            System.out.println("You did not enter an int");
            return;    //leaves the program, i.e.
                        //the program terminates
        } //end of first else
        
    } //end of method
} //end of class