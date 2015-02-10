
import java.util.Scanner;
public class Bicycle{
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in);
        System.out.print("Enter the number of Seconds (only integers):");
        int nSeconds = myScanner.nextInt();
        System.out.print("Enter the number of counts (only integers):");
        int nCounts = myScanner.nextInt();
        double miles = nCounts *3.1415*27 / 63360;
        double timeMinutes = nSeconds / 60;
        double averageMPH = miles / (timeMinutes / 60);
        double roundOff = Math.round(miles * 100.0) / 100.0;
        double roundOff1 = Math.round(timeMinutes * 100.0) / 100.0;
        double roundOff2 = Math.round(averageMPH * 100.0) / 100.0;
        System.out.println("The distance was " + roundOff +" miles and it took "
        + roundOff1 +" minutes." );
        System.out.println("The average mph was " + roundOff2);
}
}