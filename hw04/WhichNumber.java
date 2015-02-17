//Matt Palmieri
//2/16/15
//CSE2 hw04 problem 1
//WhichNumber
//User thinks of a number between 1 and 10
//programs ask user questions in order to guess the number

//import Scanner
import java.util.Scanner;

//define a class
public class WhichNumber {
    //main method required for all java programs
    public static void main(String [] args) {
        System.out.println("Think of a number between 1 to 10 inclusive."); //tell user to think of their number
        String yes = ("y"); //define and assign yes as a String
        String Yes = ("Y"); //define and assign Yes as a String
        String no = ("n"); //define and assign no as a String
        String No = ("N"); //define and assign No as a String
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in ); //define myScanner
        System.out.print("Is the number even? "); //prompt first question
        String answer1 = myScanner.next(); //assign awnser1
        if (answer1.equals(yes)||answer1.equals(Yes)){ //if answer1 is yes
            System.out.print("Is the number divisible by 3? "); //prompt second question
            String answer2 = myScanner.next();  //assign awnser2
            if (answer2.equals(yes)||answer2.equals(Yes)){ //if answer2 is yes
                System.out.print("Is your number 6? "); //prompt third question
                String answer3 = myScanner.next();  //assign awnser3
                if (answer3.equals(yes)||answer3.equals(Yes)){ //if awnser3 is yes
                    System.out.println("Yay!"); //system guessed correctly
                }
                else if (answer3.equals(no)||answer3.equals(No)){
                    System.out.println("That is not consistent"); //if inputs are not consistant
                }
                else{
                    System.out.println("This is not a valid input"); //if user inputs an invalid input
                }
            }
            else if(answer2.equals(no)||answer2.equals(No)){
                System.out.print("Is the number divisible by 4? "); //prompt third question
                String answer3 = myScanner.next(); //assign awnser3
                if (answer3.equals(yes)||answer3.equals(Yes)){ //if answer3 is yes
                    System.out.print("Is the number divided by 4 greater than 1? "); //prompt fourth question
                    String answer4 = myScanner.next(); //assign answer4
                    if (answer4.equals(yes)||answer4.equals(Yes)){ //if answer4 is yes
                        System.out.print("Is your number 8? "); //prompt fifth question
                        String answer5 = myScanner.next();  //assign answer5
                        if (answer5.equals(yes)||answer5.equals(Yes)){ //if answer5 is yes
                            System.out.println("Yay!"); //system guessed correctly
                        }
                        else if (answer5.equals(no)||answer5.equals(No)){ //if answer5 is no
                            System.out.println("That is not consistent"); //if inputs are not consistant
                        }
                        else{
                            System.out.println("This is not a valid input"); //if user inputs an invalid input
                        }
                    }    
                    else if (answer4.equals(no)||answer4.equals(No)){ //if answer4 is no
                        System.out.print("Is your number 4? "); //prompt fifth question
                        String answer5 = myScanner.next();  //assign answer5
                        if (answer5.equals(yes)||answer5.equals(Yes)){ //if answer5 is yes
                            System.out.println("Yay!"); //system guessed correctly
                        }
                        else if (answer5.equals(no)||answer5.equals(No)){
                            System.out.println("That is not consistent"); //if inputs are not consistant
                        }
                        else{
                            System.out.println("This is not a valid input"); //if user inputs an invalid input
                        }
                    }
                    else{
                        System.out.println("This is not a valid input"); //if user inputs an invalid input
                    }
                }
                else if (answer3.equals(no)||answer3.equals(No)){
                    System.out.print("Is the number divisible by 5 "); //prompt fourth question
                    String answer4 = myScanner.next(); //assign answer4
                    if (answer4.equals(yes)||answer4.equals(Yes)){ //if answer4 is yes
                        System.out.print("Is your number 10? "); //prompt fifth question
                        String answer5 = myScanner.next();  //assign answer5
                        if (answer5.equals(yes)||answer5.equals(Yes)){ //if answer5 is yes
                            System.out.println("Yay!"); //system guessed correctly
                        }
                        else if (answer5.equals(no)||answer5.equals(No)){ //if answer5 is no
                            System.out.println("That is not consistent"); //if inputs are not consistant
                        }
                        else{
                            System.out.println("This is not a valid input"); //if user inputs an invalid input
                        }
                    }
                    else if (answer4.equals(no)||answer4.equals(No)){ //if answer4 is no
                        System.out.print("Is your number 2? "); //prompt fifth question
                        String answer5 = myScanner.next();  //assign answer5
                        if (answer5.equals(yes)||answer5.equals(Yes)){ //if answer5 is yes
                            System.out.println("Yay!"); //system guessed correctly
                        }
                        else if (answer5.equals(no)||answer5.equals(No)){ //if answer5 is no
                            System.out.println("That is not consistent"); //if inputs are not consistant
                        }
                        else{
                            System.out.println("This is not a valid input"); //if user inputs an invalid input    
                        }
                    }
                    else{
                       System.out.println("That is not a valid input"); //if user inputs an invalid input    
                    }
                }
                else{
                    System.out.println("That is not a valid input"); //if user inputs an invalid input    
                }
            }
            else{
                System.out.println("This is not a valid input"); //if user inputs an invalid input    
            }
        }
        else if (answer1.equals(no)||answer1.equals(No)){
            System.out.print("Is the number divisible by 3? "); //prompt second question
            String answer2 = myScanner.next(); 
            if (answer2.equals(yes)||answer2.equals(Yes)){
                System.out.print("Is the number divided by 3 greater than 1? "); //prompt third question
                String answer3 = myScanner.next(); //assign awnser3
                if (answer3.equals(yes)||answer3.equals(Yes)){ //if answer3 is yes
                    System.out.print("Is your number 9? "); //prompt fourth question
                    String answer4 = myScanner.next(); //assign answer4
                    if (answer4.equals(yes)||answer4.equals(Yes)){ //if answer4 is yes
                        System.out.print("Yay!"); //system guessed correctly
                    } 
                    else if (answer4.equals(no)||answer4.equals(No)){ //if answer4 is no
                        System.out.println("That is not consistent"); //if inputs are not consistant
                    }
                    else{
                        System.out.println("This is not a valid input"); //if user inputs an invalid input
                    }
                }
                else if (answer3.equals(no)||answer3.equals(No)){ //if answer3 is no
                    System.out.print("Is your number 3? "); //prompt fourth question
                    String answer4 = myScanner.next(); //assign answer4
                    if (answer4.equals(yes)||answer4.equals(Yes)){ //if answer4 is yes
                        System.out.print("Yay!"); //system guessed correctly
                    } 
                    else if (answer4.equals(no)||answer4.equals(No)){ //if answer4 is no
                        System.out.println("That is not consistent"); //if inputs are not consistant
                    }
                    else{
                        System.out.println("This is not a valid input"); //if user inputs an invalid input
                    }
                }
                else{
                    System.out.println("That is not a valid input"); //if user inputs an invalid input    
                }
                
            }
            else if(answer2.equals(no)||answer2.equals(No)){
                System.out.print("Is the number greater than 6? "); //prompt third question
                String answer3 = myScanner.next(); //assign awnser3
                if (answer3.equals(yes)||answer3.equals(Yes)){ //if answer3 is yes
                    System.out.print("Is your number 7? "); //prompt fourth question
                    String answer4 = myScanner.next(); //assign answer4
                    if (answer4.equals(yes)||answer4.equals(Yes)){ //if answer4 is yes
                        System.out.print("Yay!"); //system guessed correctly
                    } 
                    else if (answer4.equals(no)||answer4.equals(No)){ //if answer4 is no
                        System.out.println("That is not consistent"); //if inputs are not consistant
                    }
                    else{
                        System.out.println("This is not a valid input"); //if user inputs an invalid input
                    }
                }
                else if (answer3.equals(no)||answer3.equals(No)){
                    System.out.print("Is it less than 3? "); //prompt fourth question
                    String answer4 = myScanner.next(); //assign answer4
                    if (answer4.equals(yes)||answer4.equals(Yes)){ //if answer4 is yes
                        System.out.print("Is your number 1? "); //prompt fifth question
                        String answer5 = myScanner.next();  //assign answer5
                        if (answer5.equals(yes)||answer5.equals(Yes)){ //if answer5 is yes
                            System.out.println("Yay!"); //system guessed correctly
                        }
                        else if (answer5.equals(no)||answer5.equals(No)){ //if answer5 is no
                            System.out.println("That is not consistent"); //if inputs are not consistant
                        }
                        else{
                            System.out.println("This is not a valid input"); //if user inputs an invalid input
                        }
                    }
                    else if (answer4.equals(no)||answer4.equals(No)){ //if answer4 is no
                        System.out.print("Is your number 5? "); //prompt fifth question
                        String answer5 = myScanner.next();  //assign answer5
                        if (answer5.equals(yes)||answer5.equals(Yes)){ //if answer5 is yes
                            System.out.println("Yay!"); //system guessed correctly
                        }
                        else if (answer5.equals(no)||answer5.equals(No)){ //if answer5 is no
                            System.out.println("That is not consistent"); //if inputs are not consistant
                        }
                        else{
                            System.out.println("This is not a valid input"); //if user inputs an invalid input    
                        }
                    }
                    else{
                       System.out.println("That is not a valid input"); //if user inputs an invalid input    
                    }
                }
                else{
                    System.out.println("That is not a valid input"); //if user inputs an invalid input    
                }
            }
            else{
                System.out.println("This is not a valid input"); //if user inputs an invalid input  
            }
        }
        else{
            System.out.println("This is not a valid input"); //if user inputs an invalid input  
        }
    } //end of main method
} //end of class