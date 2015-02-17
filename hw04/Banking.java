//Matt Palmieri
//2/16/15
//CSE2 hw04 problem 2
//Banking
//Gives user a random balance between 1000 and 5000
//lets user view balance, deposit or withdrawl money

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class Banking {
    //main method required for every java program
    public static void main(String [] args) {
        double randomNumber = ((Math.random() * 4000) + 1000); //gives user a random number
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in ); //define myScanner
        System.out.printf("Your starting balance is $%6.2f\n", randomNumber); //show user starting balance
        System.out.print("Would you like to withdrawl, deposit or view your balance? "); //prompt user for command
        String userCommand= myScanner.next();
        switch (userCommand){
            case ("withdrawl"):
                System.out.print("How much would you like to withdrawl? "); //prompt user for amount to withdrawl
                double withdrawlAmount = myScanner.nextDouble(); //assign withdrawlAmount
                if (withdrawlAmount > randomNumber){
                    System.out.println("You can't withdrawl more than you have!"); //if user inputs an invalid command
                }
                else if (withdrawlAmount < 0){
                    System.out.println("You can't withdrawl a negative amount!"); //if user inputs an invalid command
                }
                else{
                double newAmountW = randomNumber - withdrawlAmount; //calculate the new amount
                System.out.printf("Your new balance is $%6.2f\n", newAmountW); //print new amount
                }
                break;
            case ("deposit"):
                System.out.print("How much would you like to deposit? "); //prompt user for a
                double depositAmount = myScanner.nextDouble(); //assign deposit amount
                if (depositAmount < 0){
                    System.out.println("You can't deposit a negative amount!"); //if user inputs an invalid command
                }
                else{
                double newAmountD = randomNumber + depositAmount; //calculates the new amount
                System.out.printf("Your new balance is $%6.2f\n", newAmountD); //prints new amount
                }
                break;
            case ("view"):
                System.out.printf("Your balance is $%6.2f\n", randomNumber); //shows user balance
                break;
            default:
                System.out.println("That is not a valid commmand."); //if user inputs an invalid command
                break;
        }
    } //end of main method    
} //end of class