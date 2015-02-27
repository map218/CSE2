//Matt Palmieri
//2/27/15
//CSE2 lab06
//SmileGenerator
//practice using loops to print out smiley faces

//define a class
public class SmileGenerator {
    //main method required for every java program
    public static void main(String [] args) {
        for (int a=0; a<6; a++){ //for loop
            System.out.print(":) ");
        }
        System.out.println(""); //print new line
        int b = 0; //counter for the while loop
        while (b < 6){ //while loop
            System.out.print(":) ");
            b++;
        }
        System.out.println(""); //print new line
        int c = 0; //counter for do while loop
        do{
        System.out.print(":) ");
        c++;
        } while(c < 6);
        System.out.println(""); //print new line
        int rand = (int) (Math.random() * 100) + 1; //random number
        int d = 0; //counter for while loop
        while (d < rand){ //while loop
            System.out.print(":) ");
            d++;
        }
        System.out.println(""); //print new line
        int e = 0; //counter for while loop
        while (e < rand){ //while loop
            System.out.print(":) ");
            e++;
            if(e == 30 || e == 60 || e == 90){
                System.out.println(""); //print new line
            }
        }
        System.out.println(""); //print new line
        int f = 0; //counter for while loop
        String smileyFace = ":) "; //make a smiley face string
        while (f < 10){ //while loop
            System.out.print(":) ");
            f++;
            if(f == 1 || f == 3 || f == 6){
                System.out.println(""); //print new line
            }
        }
        System.out.println(""); //print new line
    } //end of main method
} //end of class
