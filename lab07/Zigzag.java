//Matt Palmieri
//2/27/15
//CSE2 lab07
//Zigzag
//practice using nested loops to print out *s in zigzag patterns

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class Zigzag {
    //main method required for every java program
    public static void main(String [] args) {
        int nStars = 10;
        for (int a=0; a<nStars; a++){ //for loop
            System.out.print("*");
        }
        System.out.println(""); //print new line
        for (int b=0; b<nStars; b++){
            for(int c=0; c<=b; c++){
                if (c!=0){
                    System.out.print(" ");
                }
                if (c==b){
                    System.out.print("*");
                    System.out.println("");
                }
            }
        }
        Scanner myScanner = new Scanner( System.in ); //define my scanner
        System.out.print("Please enter an integer between 3 and 33: ");
        if(myScanner.hasNextInt()== true){
            int nLines = myScanner.nextInt();
            if(nLines >= 3 && nLines <= 33){
                for(int d=0; d<nLines; d++){
                    System.out.print("*");
                }
                System.out.println(""); //print new line
                for (int e=0; e<(nLines-2); e++){
                    for(int f=0; f<=e; f++){
                        System.out.print(" ");
                        if (f==e){
                            System.out.print("*");
                            System.out.println("");
                         }
                    }
                }
                for(int g=0; g<nLines; g++){
                    System.out.print("*");
                }
                System.out.println(""); //print new line
            }
           else{
                System.out.println("The number is out of range [3,33]"); //tell user it is an invalid input
            }
        }
        else{
            System.out.println("Please enter an integer value"); //tell user it is an invalid input
        }
        System.out.print("Enter y or Y to run again: ");
        String runAgain = myScanner.next();
        while (runAgain.equals("y") || runAgain.equals("Y")){
            System.out.print("Please enter an integer between 3 and 33: ");
            if(myScanner.hasNextInt()== true){
                int nLines = myScanner.nextInt();
                if(nLines >= 3 && nLines <= 33){
                    for(int d=0; d<nLines; d++){
                        System.out.print("*");
                    }
                    System.out.println(""); //print new line
                    for (int e=0; e<(nLines-2); e++){
                        for(int f=0; f<=e; f++){
                            System.out.print(" ");
                            if (f==e){
                                System.out.print("*");
                                System.out.println("");
                            }
                        }
                    }
                    for(int g=0; g<nLines; g++){
                        System.out.print("*");
                    }
                    System.out.println(""); //print new line
                }
                else{
                    System.out.println("The number is out of range [3,33]"); //tell user it is an invalid input
                }
            }
            else{
                System.out.println("Please enter an integer value"); //tell user it is an invalid input
            }
            System.out.print("Enter y or Y to run again: ");
            runAgain = myScanner.next();
        }
    } //end of main method
} //end of class
