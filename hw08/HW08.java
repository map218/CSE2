//Matt Palmieri
//3/20/15
//CSE2 hw08
//HW08
//practice using methods to make a game

//import scanner class in order to use it
import java.util.Scanner;

//define a class
public class HW08 {
    //define main method
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    public static String getInput(Scanner scan, String string){
        String input = scan.next();
        String result = "";
        if (input.equals("C") || input.equals("c")){
        }
        else{
            System.out.println("Yea right LOSER!");
            System.exit(0);
        }
        return result;
    }
    public static String getInput(Scanner scan, String string, int trial){
        while (trial > 0){
            String input = scan.next();
            if (input.equals("A") || input.equals("a")){
                int damage = (int) (Math.random() * 2);
                if (damage == 1){
                    System.out.println("Critical Hit!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    trial = trial - damage;
                }
                else{
                    System.out.println("Gosh! How can you miss it!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                }
            }
            else if (input.equals("E") || input.equals("e")){
                int escape = (int) (Math.random() * 11);
                if (escape == 10){
                    System.out.println("You got away!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    trial = trial - escape;
                }
                else{
                    System.out.println("You couldn't get away!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                }
            }
            else{
            System.out.println("Executed by the GIANT! Game Over!");
            System.exit(0);
            }
        }
        String output = "";
        return output;
    }
    public static String getInput(Scanner scan){
        String switchinput = scan.next();
        String reward = "";
        switch (switchinput) {
            case "1":
                System.out.println("You got 1 million dollars! Congratulations!");
                break;
            case "2":
                System.out.println("It is GPA 4.00 Hero! Have a good day!");
                break;
            case "3":
                System.out.println("It's empty! You got nothing! Better luck next time!");
                break;
            default:
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                System.exit(0);
                break;
        }
        return reward;        
    }
}