//Matt Palmieri
//3/5/15
//CSE2 hw07
//waves
//practice using nested loops to print out waves of numbers

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class waves {
    //main method required for every java program
    public static void main(String [] args) {
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in );
        System.out.print("Please enter in integer between 1 and 30: ");
        if(myScanner.hasNextInt()== true){ //check to make sure input is valid
            int userInput = myScanner.nextInt(); //user input
            if(userInput >= 1 && userInput <= 30){ //check to make sure input is valid
                System.out.println("For Loop:");
                for(int a=1; a<=userInput; a++){
                    for(int b=a; b<=a; b++){
                        String outputLine = ""; //define outputline for later use
                        if(b%2==0){
                            for(int c=1; c<=b; c++){
                                outputLine = outputLine +b; //keep adding b to the string
                                System.out.print(outputLine);
                                System.out.println(""); //print new line
                            }    
                        }
                        else{
                            for(int c=1; c<=b; c++){
                                outputLine="";
                                for(int d=c; d<=b; d++){
                                outputLine = outputLine +b; //keep adding b to the string
                                }
                            System.out.print(outputLine);
                            System.out.println(""); //print new line
                            }
                        }
                    }
                }
                System.out.println("While Loop:");
                int a=1; //set a to start at 1
                while(a<=userInput){
                    int b=a; //set b equal to a
                    while(b<=a){
                        String outputLine = ""; //define outputline for later use
                        int c=1;
                        if(b%2==0){ //if b is even
                            while (c<=b){
                                outputLine = outputLine +b; //keep adding b to the string
                                System.out.print(outputLine); //print output
                                System.out.println(""); //start new line
                                c++; //add to c counter
                            }    
                        }
                        else{ //if b is odd
                            while(c<=b){
                                outputLine="";
                                int d=c; //set d equal to c
                                while(d<=b){
                                outputLine = outputLine +b; //keep adding b to the string
                                d++; //add to d counter
                                }
                            System.out.print(outputLine); //print to output
                            System.out.println(""); //start new line
                            c++; //add to c counter
                            }
                            
                        }
                        b++; //add to b counter
                    }
                    a++; //add to a counter
                }
                System.out.println("Do While Loop:");
                a=1; //set a to start at 1
                do{
                    int b=a; //set b equal to a
                    do{
                        String outputLine = ""; //define outputline for later use
                        int c=1;
                        if(b%2==0){ //if b is even
                            do{
                                outputLine = outputLine +b; //keep adding b to the string
                                System.out.print(outputLine); //print output
                                System.out.println(""); //start new line
                                c++; //add to c counter
                            } while (c<=b);
                        }
                        else{ //if b is odd
                            do{
                                outputLine="";
                                int d=c; //set d equal to c
                                do{
                                outputLine = outputLine +b; //keep adding b to the string
                                d++; //add to d counter
                                } while(d<=b);
                            System.out.print(outputLine); //print to output
                            System.out.println(""); //start new line
                            c++; //add to c counter
                            } while(c<=b);
                            
                        }
                        b++; //add to b counter
                    } while(b<=a);
                    a++; //add to a counter
                } while(a<=userInput);
            }
            else{
                    System.out.println("The number is out of range [1,30]"); //tell user it is an invalid input
                }
        }
        else{
                System.out.println("Please enter an integer value"); //tell user it is an invalid input
        }
    } //end of main method
} //end of class
