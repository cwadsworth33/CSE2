//Homework 3 CSE 002
//FourDigits.java
//Christian Wadsworth 2/10/15

import java.util.Scanner;//Import scanner
public class FourDigits{ //Initialize class FourDigits
    public static void main(String[] args) {
        Scanner myScanner;//Setup scanner
        myScanner = new Scanner( System.in);
        //Ask user for input and store it as a variable
        System.out.print("Enter a double:");
        double number = myScanner.nextDouble();
        //Gets rid of numbers to left of decimal
        double decimal = number - (int)number;
        //Moves decimal four places to the right
        double bigDecimal = decimal*10000;
        //Converts to integer
        int digits4 = (int)bigDecimal;
        //Print result
        System.out.println("The four digits are " + digits4);
}
}