///////////////////////////////////////////////////////////////////////////////
//Matt Palmieri
//Demo 0
//Hello World Java Program
//
//   first compile the program
//      javac Hello World.java
//   run the program
//      java HelloWorld//

import java.util.Scanner;
//   define a class
public class HelloWorld{
    
//   add main method
   public static void main(String arg[])  {
       
//   print out the statement with the box around it
     System.out.println("#########################");
     System.out.println("#########################");
     System.out.println("#                       #");
     System.out.println("#   Hello World 2014!!  #");
     System.out.println("#                       #");
     System.out.println("#########################");
     System.out.println("#########################");
     System.out.println("test");
    int i = 4;
    int j = 0;
    int linenumber = 8;
    while (j<linenumber){
        int k = 0;
        while (k<j){
            if(k<i){
                System.out.print(i);
                k++;
            }
            else{
                int a = 0;
                while(a<i){
                    System.out.print(" ");
                    a++;
                }
                System.out.print(i);
                k++;
                }
            }
            System.out.println("");
            j++;
        }
    }
    }