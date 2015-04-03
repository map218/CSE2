///////////////////////////////////////////////////////////////////////////////
//Matt Palmieri
//Lab09
//
//practice using methods

import java.util.Scanner;
import java.util.Random;
//   define a class
public class lab09{

//   add main method
    public static void main(String arg[])  {
        Scanner scan = new Scanner(System.in);
        int runAgain = 0;
        String adj1;
        String adj2;
        String adj3;
        String sub;
        String obj;
        String verb;
        while (runAgain == 0){
            adj1 = adj();
            adj2 = adj();
            adj3 = adj();
            sub = sub();
            obj = obj();
            verb = verb();
            System.out.println("The "+adj1+" "+adj2+" "+sub+" "+verb+" the " +adj3+" "+obj);
            System.out.println("Enter 0 to run again, an other integer to quit");
            runAgain = scan.nextInt();
       }
   }
    public static String adj(){
       Random rand = new Random();
       int a = rand.nextInt(10);
       String adj = "";
       switch (a){
            case 0:
                adj = "lazy";
                break;
            case 1:
                adj = "quick";
                break;
            case 2:
                adj = "goofy";
                break;
            case 3:
                adj = "red";
                break;
            case 4:
                adj = "tired";
                break;
            case 5:
                adj = "blue";
                break;
            case 6:
                adj = "sick";
                break;
            case 7:
                adj = "sly";
                break;
            case 8:
                adj = "happy";
                break;
            case 9:
                adj = "angry";
                break;
        }
        return adj;
    }
    
    public static String sub(){
       Random rand = new Random();
       int b = rand.nextInt(10);
       String sub = "";
       switch (b){
            case 0:
                sub = "dog";
                break;
            case 1:
                sub = "cat";
                break;
            case 2:
                sub = "mouse";
                break;
            case 3:
                sub = "man";
                break;
            case 4:
                sub = "woman";
                break;
            case 5:
                sub = "elephant";
                break;
            case 6:
                sub = "giraffe";
                break;
            case 7:
                sub = "penguin";
                break;
            case 8:
                sub = "bird";
                break;
            case 9:
                sub = "bear";
                break;
        }
        return sub;
    }
    
    public static String obj(){
       Random rand = new Random();
       int c = rand.nextInt(10);
       String obj = "";
       switch (c){
            case 0:
                obj = "dog";
                break;
            case 1:
                obj = "cat";
                break;
            case 2:
                obj = "mouse";
                break;
            case 3:
                obj = "man";
                break;
            case 4:
                obj = "woman";
                break;
            case 5:
                obj = "elephant";
                break;
            case 6:
                obj = "giraffe";
                break;
            case 7:
                obj = "penguin";
                break;
            case 8:
                obj = "bird";
                break;
            case 9:
                obj = "bear";
                break;
        }
        return obj;
    }
    
    public static String verb(){
       Random rand = new Random();
       int d = rand.nextInt(10);
       String verb = "";
       switch (d){
            case 0:
                verb = "jumped over";
                break;
            case 1:
                verb = "passed";
                break;
            case 2:
                verb = "flew over";
                break;
            case 3:
                verb = "swam by";
                break;
            case 4:
                verb = "hit";
                break;
            case 5:
                verb = "tripped";
                break;
            case 6:
                verb = "ran by";
                break;
            case 7:
                verb = "drove by";
                break;
            case 8:
                verb = "chased";
                break;
            case 9:
                verb = "hid from";
                break;
        }
        return verb;
    }
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}