///////////////////////////////////////////////////////////////////////////////
//Matt Palmieri
//Hw12
//4/21/15
//Multiplication w/ matricies

import java.util.Scanner; //import scanner for later use
import java.util.Random; //import random for later use

public class Multiply{
    public static void main(String arg[])  {
        Scanner scan = new Scanner(System.in); //declare scan
        Random rand = new Random(); //declare rand
        boolean compatible = false;
        int height1 = 0;
        int width1 = 0;
        int height2 = 0;
        int width2 = 0;
        while (compatible == false){
            height1 = 0;
            width1 = 0;
            height2 = 0;
            width2 = 0;
            while(height1 <= 0){ //loop to make sure the height of matrix 1 is valid
                System.out.println("Please input the height of the first Matrix: ");
                if(scan.hasNextInt()){
                    height1 = scan.nextInt(); //user input
                    if(height1 <= 0){
                        System.out.println("That is not a valid input");
                    }
                }
                else{
                    System.out.println("That is not a valid input");
                    String waste1 = scan.next(); //throwaway to avoid an infinite loop
                }
            }
            while(width1 <= 0){ //loop to make sure the width of matrix 1 is valid
            System.out.println("Please input the width of the first Matrix: ");
                if(scan.hasNextInt()){
                    width1 = scan.nextInt(); //user input
                    if(width1 <= 0){
                        System.out.println("That is not a valid input");
                    }
                }
                else{
                    System.out.println("That is not a valid input");
                    String waste3 = scan.next(); //throwaway to avoid an infinite loop
                }
            }
            while(height2 <= 0){ //loop to make sure the height of matrix 2 is valid
                System.out.println("Please input the height of the second Matrix: ");
                if(scan.hasNextInt()){
                    height2 = scan.nextInt(); //user input
                    if(height2 <= 0){
                        System.out.println("That is not a valid input");
                    }
                }
                else{
                    System.out.println("That is not a valid input");
                    String waste2 = scan.next(); //throwaway to avoid an infinite loop
                }
            }
            while(width2 <= 0){ //loop to make sure the width of matrix 2 is valid
            System.out.println("Please input the width of the second Matrix: ");
                if(scan.hasNextInt()){
                    width2 = scan.nextInt(); //user input
                    if(width2 <= 0){
                        System.out.println("That is not a valid input");
                    }
                }
                else{
                    System.out.println("That is not a valid input");
                    String waste4 = scan.next(); //throwaway to avoid an infinite loop
                }
            }
            if(height1 == width2){
                compatible = true; //gets us out of the loop
            }
            else{
            System.out.println("The arrays cannot be multiplied! Try Again."); //and we go through the loop again
            }
        }
        System.out.println("Generating a matrix with width "+width1+" and height "+height1+":");
        int [][] randomArray1 = randomMatrix(height1, width1); //call randomMatrix Method to create our first Matrix
        printMatrix(randomArray1); //print method
        System.out.println("Generating a matrix with width "+width2+" and height "+height2+":");
        int [][] randomArray2 = randomMatrix(height2, width2); //call randomMatrix Method to create our second Matrix
        printMatrix(randomArray2); //print method
        System.out.println("When Multiplied together:");
        int [][] multipliedArray = matrixMultiply(randomArray1, randomArray2); //mutiply the matricies
        printMatrix(multipliedArray); //print method
    }
    
    public static int[][] randomMatrix(int height, int width){
        Random rand = new Random(); //declare rand
        int[][] array = new int[height][width]; //declare array
            for (int i = 0; i < height; i++) { //for loops to generate row-major matrix with numbers between -10 and 10
                for (int j = 0; j < width; j++) {
                    array[i][j] = rand.nextInt(21) - 10; 
                }
            }
            return array;
        } 
    
    public static void printMatrix(int[][] array){
        if(array == null){
            System.out.println("The array was empty!");
            return;
        }
        else{
            int i = 0;
            while (i<array.length){
                int j = 0;
                System.out.print("[ ");
                while (j<array[i].length){
                    System.out.print(array[i][j]+" ");
                    j++;
                }
            System.out.print("]");
            System.out.println("");
            i++;
            }
            return;
        }
    }
    
    public static int[][] matrixMultiply(int[][] a, int[][] b){
        int[][] array = new int[a.length][b[0].length];
        int i = 0; //declare i
        int j = 0; //declare j
        int k = 0; //declare k
        while (i < a.length){
            j = 0;
            while (j < b[0].length ){
                k = 0;
                while (k < a[0].length && k < b.length){
                    array[i][j] = array[i][j] + (a[i][k]*b[k][j]);
                    k++;
                }
                j++;
            }
        i++;
        }
        return array;
    }
}