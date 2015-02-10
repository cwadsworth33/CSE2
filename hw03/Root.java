//Homework 3 CSE 002
//Bicycle.java
//Christian Wadsworth 2/10/15

import java.util.Scanner;//Import scanner
public class Root{ //Initialize class Bicycle
    public static void main(String[] args) {
        Scanner myScanner;//Setup scanner
        myScanner = new Scanner( System.in);
        //Ask user for inputs and store them as variables
        System.out.print("Enter a double:");
        double x = myScanner.nextDouble();
        //Calculate cube root and cube of cube root through a guess formula
        //using x/3 as initial guess and reiterating 4 times
        double guess = x/3;
        double guess2 = (2*guess*guess*guess+x)/(3*guess*guess);
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
        double cube = guess5*guess5*guess5;
        //Print results
        System.out.println("The cube root is " + guess5);
        System.out.println("The cube root cubed is " + cube);
}
}