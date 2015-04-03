///////////////////////////////////////////////////////////////////////////////
//Matt Palmieri
//Lab10
//4/2/15
//practice using arrays

import java.util.Scanner; //import scanner for later use

public class ArrayInputs{

//   add main method
    public static void main(String arg[])  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer for the size of an array: ");
        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];
        int i = 0;
        int userInput = -1;
        System.out.println("Please enter "+arrayLength+" positive integer(s): ");
        while (i < arrayLength){
            if (scan.hasNextInt()){
                userInput = scan.nextInt();
                if (userInput >= 0){
                    array[i] = userInput;
                    i++;
                }
                else{
                System.out.println("Sorry, the number you entered is negative.");
                }
            }
            else{
                System.out.println("Sorry, you didn’t enter an integer.");
                userInput = (int) scan.nextDouble();
            }
        }
        int j = 0;
        System.out.println("The array is: ");
        while (j < arrayLength){
            System.out.println(array[j]);
            j++;
        }
    } //end of main method
} //end of class