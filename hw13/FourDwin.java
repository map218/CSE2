///////////////////////////////////////////////////////////////////////////////
//Matt Palmieri
//hw13 (WHY IS THIS SOOO HARD!!!!!!!!)
//4/27/15

import java.util.Scanner; //import scanner for later use
import java.util.Random; //import random for later use

public class FourDwin{
    public static void main(String arg[])  {
        Scanner scan = new Scanner(System.in); //declare scan
        Random rand = new Random(); //declare rand
        int X = 0; //declare X and Y at 0 until user changes it
        int Y = 0;
        while (X < 1){
            System.out.print("Enter an integer X: "); //prompt user for X
            if(scan.hasNextInt()){
                X = scan.nextInt(); //set X equal to user input
                if (X < 1){ //if user inputs X < 1
                    System.out.println("Invalid Input.");
                }  
            }
            else{ //if user doesn't enter an int
                System.out.println("Invalid Input.");
                String throwaway = scan.next(); //wont be used. but it stops an infinit loop
            }
        }
        while (Y < 1 || Y <= X){
            System.out.print("Enter an integer Y where Y > X: "); //prompt user for Y
            if(scan.hasNextInt()){
                Y = scan.nextInt(); //set Y equal to user input
                if (Y < 1 || Y <= X){ //if user inputs Y < 1 or less than X
                    System.out.println("Invalid Input.");
                }  
            }
            else{ //if user doesn't enter an int
                System.out.println("Invalid Input.");
                String throwaway = scan.next(); //wont be used. but it stops an infinit loop
            }
        }
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        double[][][][] myArray = new double [3][(rand.nextInt(Y-X+1)+X)][(rand.nextInt(Y-X+1)+X)][(rand.nextInt(Y-X+1)+X)]; //set lenghts of each sub array from between X and Y
        while (a < myArray.length){
            myArray[a] = new double [(rand.nextInt(Y-X+1)+X)][][]; //set the length of the 3D arrays
            b = 0;
            while (b < myArray[a].length){
                myArray[a][b] = new double [(rand.nextInt(Y-X+1)+X)][]; //set the length of the 2D arrays
                c = 0;
                while (c < myArray[a][b].length){
                    myArray[a][b][c] = new double [(rand.nextInt(Y-X+1)+X)]; //set the length of the 1D arrays
                    c++;
                }
                b++;
            }
            a++;
        }
        a = 0; //set counters to 0
        b = 0;
        c = 0;
        d = 0;
        while (a < myArray.length){
            b = 0;
            while (b < myArray[a].length){
                c = 0;
                while (c < myArray[a][b].length){
                    d = 0;
                    while (d < myArray[a][b][c].length){
                        myArray[a][b][c][d] = ((Math.random() * 31)); //give random values for each number
                        myArray[a][b][c][d] = ((int) ((myArray[a][b][c][d]) *10)); //only one decimal place
                        myArray[a][b][c][d] = (double) myArray[a][b][c][d] /10; //only one decimal place
                        d++;
                    }
                    c++;
                }
                b++;
            }
            a++;
        }
        System.out.println("Original Array:");
        printArray(myArray); //call printArray method
        int i = 0;
        while (i < myArray.length){
            sort3DArray(myArray[i]); //call sort3DArray method for all 3 3D arrays
            i++;
        }
        sort4DArray(myArray); //call sort4DArray method
        System.out.println("Sorted Array:");
        printArray(myArray);  //call printArray method
        statArray(myArray); //give stats of the array
        
        
        
    } //end of main method
    
    public static void statArray(double [][][][] array){
        int i = 0; //declare i counter
        int j = 0; //declare j counter
        int k = 0; //declare k counter
        int l = 0; //declare l counter
        double sum =  0; //declare sum and start it at 0;
        double elements = 0; //declare element count
        while (i < array.length){
            j = 0; //set j back to 0
            while (j < array[i].length){
                k = 0; //set k back to 0
                while (k < array[i][j].length){
                    l = 0; //set l back to 0
                    while (l < array[i][j][k].length){
                        sum = sum + array[i][j][k][l]; //add array element to sum
                        elements++; //increment element count
                        l++; //increment l
                    }
                    k++; //increment k
                }
                j++; //increment j
            }
            i++; //increment i
        }
        double mean = sum/elements; //calculate mean
        System.out.println("Members: "+elements); //print elements
        System.out.println("Sum: "+sum); //print sum
        System.out.println("Mean: "+mean); //print mean
    } //end of statArray method
    
    public static void sort4DArray(double [][][][] array){
        int a= 1; //declare a counter
        int b; //declare b counter
        while (a < array.length){ 
            int length = array[a].length;
            double [][][] numb = array[a];
            b = a - 1;
            while (b >= 0 && array[b].length < length){
                array[b+1] = array[b]; //sort everything based on length
                b--;
            }
            array[b+1] = numb;
            a++;
        }
        a = 0;
        while (a < array.length-1){
            double [][][] temp = array[a];
            if (array[a].length == array[a+1].length && array[a+1][0][0][0] < array[a][0][0][0]){ //for if everything has the same length
                array[a] = array [a+1]; //exchange them
                array[a+1] = temp;
            }
            a++;
        }
    }
    
    public static void sort3DArray(double [][][] array){
        int a= 0; //declare a counter
        int b = 0; //declare b counter
        int c = 0; //declare c counter
        while (a < array.length){
            b = 0;
            while (b < array[a].length){
                c = 0;
                while (c < array[a][b].length){
                    int d = c;
                    int pointer = c;
                    double min = array[a][b][c]; //set min to a value
                    while (d < array[a][b].length){
                        if (min > array[a][b][d]){
                            min = array[a][b][d]; //set the min
                            pointer = d; //and the point that the min is at
                        }
                        d++; //increment d
                    }
                    array[a][b][pointer] = array[a][b][c]; //swap the min to the pointer
                    array[a][b][c] = min; //and swap the other
                    c++; //increment c
                }
                b++; //increment b
            }
            a++; //increment a
        }
    }
    
    public static void printArray(double [][][][] array){
        int a = 0; //declare a counter
        int b = 0; //declare b counter
        int c = 0; //declare c counter
        int d = 0; //declare d counter
        System.out.print("{"); //print statments (do i really need to comment...)
        while (a < array.length){
            System.out.print("{"); //print statments (do i really need to comment...)
            b = 0;
            while (b < array[a].length){
                System.out.print("{"); //print statments (do i really need to comment...)
                c = 0;
                while (c < array[a][b].length){
                    System.out.print("{"); //print statments (do i really need to comment...)
                    d = 0;
                    while (d < array[a][b][c].length){
                        System.out.print(array[a][b][c][d]+", "); //print statments (do i really need to comment...)
                        d++;
                    }
                    System.out.print("}"); //print statments (do i really need to comment...)
                    c++;
                }
                System.out.print("} "); //print statments (do i really need to comment...)
                b++;
            }
            System.out.print("}, "); //print statments (do i really need to comment...)
            a++;
        }
        System.out.println("}"); //print statments (do i really need to comment...)
    }
} //AND DONE!!! Seriosly though, this was soo hard!!
