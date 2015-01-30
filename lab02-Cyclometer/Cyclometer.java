//Matt Palmieri
//1/30/15
//CSE2 Lab 02
//Cyclometer for a bicycle
//print the number of minutes and counts for each trip
//print the distance of each trip in miles and the two trips combined

//define a class
public class Cyclometer {
    //main method required for every java program
    public static void main(String [] args) {
        int secsTrip1=480; //seconds for the first trip
        int secsTrip2=3220; //seconds for the second trip
        int countsTrip1=1561; //counts for the first trip
        int countsTrip2=9037; //counts for the second trip
        double wheelDiameter=27.0, //diameter of the bicycle wheel
        PI=3.14159, //value of pi
         feetPerMile=5280,  //mile to feet conversion rate
         inchesPerFoot=12,   //feet to inches conversion rate
         secondsPerMinute=60;  //minutes to seconds conversion rate
        double distanceTrip1, distanceTrip2, totalDistance;  //create variables for each of the 3 distances

        System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts.");
        distanceTrip1=countsTrip1*PI*wheelDiameter; //gives distance in inches
            //distance traveled per count is the diameter*PI
        distanceTrip1/=inchesPerFoot*feetPerMile;    //converts inches to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //gives distance in miles
        totalDistance=distanceTrip1+distanceTrip2; //total distance traveled
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");

        
    } //end of main method
} //end of class    