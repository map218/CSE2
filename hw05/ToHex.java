//Matt Palmieri
//2/19/15
//CSE2 hw05
//ToHex
//uses the Scanner class to obtain number three inputs (between 0 and 255) and converts them to hexidecimal

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class ToHex {
    //main method required for every java program
    public static void main(String [] args) {
        Scanner myScanner; //define myScanner
        myScanner = new Scanner( System.in );
        System.out.print("Please enter three numbers representing RGB values: ");
        if (myScanner.hasNextInt() == true && myScanner.hasNextInt() == true && myScanner.hasNextInt() == true) {
            int redValue = myScanner.nextInt();
            int greenValue = myScanner.nextInt();
            int blueValue = myScanner.nextInt();
            if (redValue >= 0 && redValue <= 255 && greenValue >= 0 && greenValue <= 255 && blueValue >= 0 && blueValue <= 255) {
                int firstValue = redValue/16; //calculate first number
                String firstValueHex; //declare it to use later
                switch (firstValue) {
                    case 0:
                        firstValueHex = "0";
                        break;
                    case 1:
                        firstValueHex = "1";
                        break;
                    case 2:
                        firstValueHex = "2";
                        break;
                    case 3:
                        firstValueHex = "3";
                        break;
                    case 4:
                        firstValueHex = "4";
                        break;
                    case 5:
                        firstValueHex = "5";
                        break;
                    case 6:
                        firstValueHex = "6";
                        break;
                    case 7:
                        firstValueHex = "7";
                        break;
                    case 8:
                        firstValueHex = "8";
                        break;
                    case 9:
                        firstValueHex = "9";
                        break;
                    case 10:
                        firstValueHex = "A";
                        break;
                    case 11:
                        firstValueHex = "B";
                        break;
                    case 12:
                        firstValueHex = "C";
                        break;
                    case 13:
                        firstValueHex = "D";
                        break;
                    case 14:
                        firstValueHex = "E";
                        break;
                    case 15:
                        firstValueHex = "F";
                        break;
                    default:
                        firstValueHex = "0";
                        break;
                }
                int secondValue = redValue%16; //calculate second number
                String secondValueHex; //declare it to use later
                switch (secondValue) {
                    case 0:
                        secondValueHex = "0";
                        break;
                    case 1:
                        secondValueHex = "1";
                        break;
                    case 2:
                        secondValueHex = "2";
                        break;
                    case 3:
                        secondValueHex = "3";
                        break;
                    case 4:
                        secondValueHex = "4";
                        break;
                    case 5:
                        secondValueHex = "5";
                        break;
                    case 6:
                        secondValueHex = "6";
                        break;
                    case 7:
                        secondValueHex = "7";
                        break;
                    case 8:
                        secondValueHex = "8";
                        break;
                    case 9:
                        secondValueHex = "9";
                        break;
                    case 10:
                        secondValueHex = "A";
                        break;
                    case 11:
                        secondValueHex = "B";
                        break;
                    case 12:
                        secondValueHex = "C";
                        break;
                    case 13:
                        secondValueHex = "D";
                        break;
                    case 14:
                        secondValueHex = "E";
                        break;
                    case 15:
                        secondValueHex = "F";
                        break;
                    default:
                        secondValueHex = "0";
                        break;
                }
                int thirdValue = greenValue/16; //calculate third number
                String thirdValueHex; //declare it to use later
                switch (thirdValue) {
                    case 0:
                        thirdValueHex = "0";
                        break;
                    case 1:
                        thirdValueHex = "1";
                        break;
                    case 2:
                        thirdValueHex = "2";
                        break;
                    case 3:
                        thirdValueHex = "3";
                        break;
                    case 4:
                        thirdValueHex = "4";
                        break;
                    case 5:
                        thirdValueHex = "5";
                        break;
                    case 6:
                        thirdValueHex = "6";
                        break;
                    case 7:
                        thirdValueHex = "7";
                        break;
                    case 8:
                        thirdValueHex = "8";
                        break;
                    case 9:
                        thirdValueHex = "9";
                        break;
                    case 10:
                        thirdValueHex = "A";
                        break;
                    case 11:
                        thirdValueHex = "B";
                        break;
                    case 12:
                        thirdValueHex = "C";
                        break;
                    case 13:
                        thirdValueHex = "D";
                        break;
                    case 14:
                        thirdValueHex = "E";
                        break;
                    case 15:
                        thirdValueHex = "F";
                        break;
                    default:
                        thirdValueHex = "0";
                        break;
                }
                int fourthValue = greenValue%16; //calculate fourth number
                String fourthValueHex; //declare it to use later
                switch (fourthValue) {
                    case 0:
                        fourthValueHex = "0";
                        break;
                    case 1:
                        fourthValueHex = "1";
                        break;
                    case 2:
                        fourthValueHex = "2";
                        break;
                    case 3:
                        fourthValueHex = "3";
                        break;
                    case 4:
                        fourthValueHex = "4";
                        break;
                    case 5:
                        fourthValueHex = "5";
                        break;
                    case 6:
                        fourthValueHex = "6";
                        break;
                    case 7:
                        fourthValueHex = "7";
                        break;
                    case 8:
                        fourthValueHex = "8";
                        break;
                    case 9:
                        fourthValueHex = "9";
                        break;
                    case 10:
                        fourthValueHex = "A";
                        break;
                    case 11:
                        fourthValueHex = "B";
                        break;
                    case 12:
                        fourthValueHex = "C";
                        break;
                    case 13:
                        fourthValueHex = "D";
                        break;
                    case 14:
                        fourthValueHex = "E";
                        break;
                    case 15:
                        fourthValueHex = "F";
                        break;
                    default:
                        fourthValueHex = "0";
                        break;
                }
                int fifthValue = blueValue/16; //calculate fourth number
                String fifthValueHex; //declare it to use later
                switch (fifthValue) {
                    case 0:
                        fifthValueHex = "0";
                        break;
                    case 1:
                        fifthValueHex = "1";
                        break;
                    case 2:
                        fifthValueHex = "2";
                        break;
                    case 3:
                        fifthValueHex = "3";
                        break;
                    case 4:
                        fifthValueHex = "4";
                        break;
                    case 5:
                        fifthValueHex = "5";
                        break;
                    case 6:
                        fifthValueHex = "6";
                        break;
                    case 7:
                        fifthValueHex = "7";
                        break;
                    case 8:
                        fifthValueHex = "8";
                        break;
                    case 9:
                        fifthValueHex = "9";
                        break;
                    case 10:
                        fifthValueHex = "A";
                        break;
                    case 11:
                        fifthValueHex = "B";
                        break;
                    case 12:
                        fifthValueHex = "C";
                        break;
                    case 13:
                        fifthValueHex = "D";
                        break;
                    case 14:
                        fifthValueHex = "E";
                        break;
                    case 15:
                        fifthValueHex = "F";
                        break;
                    default:
                        fifthValueHex = "0";
                        break;
                }
                int sixthValue = blueValue%16; //calculate fourth number
                String sixthValueHex; //declare it to use later
                switch (sixthValue) {
                    case 0:
                        sixthValueHex = "0";
                        break;
                    case 1:
                        sixthValueHex = "1";
                        break;
                    case 2:
                        sixthValueHex = "2";
                        break;
                    case 3:
                        sixthValueHex = "3";
                        break;
                    case 4:
                        sixthValueHex = "4";
                        break;
                    case 5:
                        sixthValueHex = "5";
                        break;
                    case 6:
                        sixthValueHex = "6";
                        break;
                    case 7:
                        sixthValueHex = "7";
                        break;
                    case 8:
                        sixthValueHex = "8";
                        break;
                    case 9:
                        sixthValueHex = "9";
                        break;
                    case 10:
                        sixthValueHex = "A";
                        break;
                    case 11:
                        sixthValueHex = "B";
                        break;
                    case 12:
                        sixthValueHex = "C";
                        break;
                    case 13:
                        sixthValueHex = "D";
                        break;
                    case 14:
                        sixthValueHex = "E";
                        break;
                    case 15:
                        sixthValueHex = "F";
                        break;
                    default:
                        sixthValueHex = "0";
                        break;
                }        
                System.out.println("The decimal numbers R: "+redValue+" G: "+greenValue+" B: "+blueValue+
                " is represented in hexadecimal as: "+firstValueHex+secondValueHex+thirdValueHex+fourthValueHex
                +fifthValueHex+sixthValueHex);
            }
            else{
                System.out.println("Sorry, you must enter numbers between 0 and 255");
            }
        }
        else{
            System.out.println("Sorry, you must enter 3 integers");
        }
        
        
        
        
    } //end of main method
} //end of class    