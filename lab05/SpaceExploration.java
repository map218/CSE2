//Matt Palmieri
//2/18/15
//CSE2 lab05
//SpaceExploration
//Gives random nmber from 2000 to 2010
//outputs all space events upto that year

//define a class
public class SpaceExploration{
    //main method reqired
    public static void main(String [] args ){
        int randomYear = (int) (Math.random() * 11) + 2000;
        System.out.println("Here is a timeline of all space events from "+randomYear+ " to 2000"); //select random year from 2000 tp 2010
        switch (randomYear){ //switch statement for every possible year (no breaks so it will also show events from previous years)
            case 2010:
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
            case 2009:
                System.out.println("2009: N/A");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space");
            case 2007:
                System.out.println("2007: N/A");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 2005:
                System.out.println("2005: Spacecraft collies with comet");
            case 2004:
                System.out.println("2004: N/A");    
            case 2003:
                System.out.println("2003: Largest infrared telescope released");
            case 2002:
                System.out.println("2002: N/A");
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");
        }
    }    
}