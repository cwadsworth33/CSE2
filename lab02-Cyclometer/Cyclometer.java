//
public class Cyclometer {
    public static void main(String[] args){
        int secsTrip1=480; //Time for trip 1 in seconds
        int secsTrip2=3220;//Time for trip 2 in seconds
        int countsTrip1=1561;//Counts on trip 1
        int countsTrip2=9037;//Counts on trip 2
        double wheelDiameter=27.0,//Wheel diameter 
        PI=3.14159,//Constant pi
        feetPerMile=5280,//Conversion constant between feet and miles
        inchesPerFoot=12,//Conversion constant between inches and feet
        secondsPerMinute=60;//Conversion constant between seconds and minutes
        double distanceTrip1, distanceTrip2, totalDistance;//declare 3 double variables
        //Below Prints and calculates time in minutes for both trips
        System.out.println("Trip 1 took"+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        // (for each count, a rotation of the wheel travels)
        // the diameter in inches times PI
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1 + distanceTrip2;
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }
}