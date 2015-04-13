///////////////////////////////////////////////////////////////////////////////
//Matt Palmieri
//hw11
//4/2/15
//practice using arrays and searching for them (binary & linear)

import java.util.Scanner; //import scanner for later use

public class CSE2Linear{
    public static void main(String arg[])  {
        Scanner scan = new Scanner(System.in);
        int arraylength = 15; //set array length to 15
        int[] array1 = new int[arraylength];
        int a = 0; //initialize a counter
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        while (a < arraylength){
            if(scan.hasNextInt()){
                int userInput = scan.nextInt();
                if(userInput >= 0 && userInput <= 100){
                    if(a == 0){
                        array1[a] = userInput; //the first grade doesnt need to be greater than anything
                        a++; //add to a counter
                    }
                    else{ //check to see if this grade is greater than or equal to the last
                        if(userInput >= array1[a-1]){
                            array1[a] = userInput;
                            a++; //add to a counter
                        }
                        else{ //if user does not enter continually greater numbers
                            System.out.println("You did not enter an int greater than or equal to "+array1[a-1]+". Try Again.");
                        }
                    }
                }
                else{ //if user enters an invallid input
                    System.out.println("You did not enter an int between 0 and 100. Try Again");
                }
            }
            else{ //if user doesn't enter an int
                System.out.println("You did not enter an int. Try Again");
                String throwaway = scan.next(); //wont be used. but it stops an infinit loop
            }
        }
        a = 0; //set a counter back to 0
        System.out.print("The grades, sorted, are:");
        while (a < arraylength){
            System.out.print(" "+array1[a]);
            a++;
        }
        System.out.println(" ");
        binarySearch(array1, arraylength); //call the binarySearch method
        for (int b=0; b<arraylength; b++) {
            int swap = (int) (arraylength * Math.random() ); //find a random member to swap with
            int temp = array1[swap];
            array1[swap] = array1[b];
            array1[b] = temp; //swap the values
        }
        System.out.print("Scrambled:");
        a=0; //set a counter back to 0
        while (a < arraylength){
            System.out.print(" "+array1[a]);
            a++;
        }
        System.out.println(" ");
        linearSearch(array1, arraylength); //call the linearSearch method
    }
        
public static void linearSearch(int[] array, int length){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a grade to search for: ");
        if (scan.hasNextInt()){
            int userInput = scan.nextInt();
            if(userInput >= 0 && userInput <= 100){
                int i = 0; //set i counter
                while(i<length){
                    if(userInput == array[i]){ //if userInput equals array[i]
                        i++;
                        System.out.println(userInput+" was found in the list with "+i+" iterations");
                        return;
                    }
                    else{ //if it doesn't, keep trying
                        i++;
                    }
                }
                System.out.println(userInput+" was not found in the list with "+i+" iterations"); //if number wasn't on the list
                return;
            }
            else{
                System.out.println("You did not enter an int between 0 and 100.");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int.");
            return;
        }
    }
            
public static void binarySearch(int[] array, int length){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a grade to search for: ");
        if (scan.hasNextInt()){
            int userInput = scan.nextInt();
            if(userInput >= 0){
                int a = 0; //set lower bound
                int b = length; //set upper bound
                int c = (b+a)/2; //number in between
                int i = 0; //iterations counter
                while (b>(a + 1)){
                    if (userInput == array[c]){
                        i++; //add to i counter
                        System.out.println(userInput+" was found in the list with "+i+" iterations");
                        return;
                    }
                    else if(userInput < array[c]){
                        b = c; //if the input is less than array at c, set c as the upperbound
                        c = (b+a)/2; //change c to the middle of the upper and lower
                        i++; //add to i counter
                    }
                    else if(userInput > array[c]){
                        a = c; //if the input is greater than array at c, set c as the lowerbound
                        c = (b+a)/2; //change c to the middle of the upper and lower
                        i++; //add to i counter
                    }
                }
                System.out.println(userInput+" was not found in the list with "+i+" iterations");
            }
            else{
                System.out.println("You did not enter an int >= 0.");
                return;
            }
    }
        else{
            System.out.println("You did not enter an int.");
            return;
        }
    }
}