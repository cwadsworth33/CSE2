//Homework 3 CSE 002
//Bicycle.java
//Christian Wadsworth 2/10/15

import java.util.Scanner;//Import scanner
public class Bicycle{ //Initialize class Bicycle
    public static void main(String[] args) {
        Scanner myScanner;//Setup scanner
        myScanner = new Scanner( System.in);
        //Ask user for inputs and store them as variables
        System.out.print("Enter the number of Seconds (only integers):");
        int nSeconds = myScanner.nextInt();
        System.out.print("Enter the number of counts (only integers):");
        int nCounts = myScanner.nextInt();
        //Calculate miles, minutes, and mph with the inputs
        double miles = nCounts *3.1415*27 / 63360;
        double timeMinutes = nSeconds / 60;
        double averageMPH = miles / (timeMinutes / 60);
        //Truncate calculations to 2 decimal places
        double roundOff = Math.round(miles * 100.0) / 100.0;
        double roundOff1 = Math.round(timeMinutes * 100.0) / 100.0;
        double roundOff2 = Math.round(averageMPH * 100.0) / 100.0;
        //Print results
        System.out.println("The distance was " + roundOff +" miles and it took "
        + roundOff1 +" minutes." );
        System.out.println("The average mph was " + roundOff2);
}
}