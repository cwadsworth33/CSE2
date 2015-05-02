import java.util.Scanner;
public class BigMac {
public static void main (String[] args){
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    System.out.print("Enter the number of Big Macs (an integer greater than 0):");
    int nBigMacs = myScanner.nextInt();//Scanner big macs
    System.out.print("Enter the cost per Big Mac as" + "a double (in the form xx.xx):" );
    double Price = myScanner.nextDouble(); //scanner Price
	System.out.print("Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100; //user enters percent, but I want proportion
    double cost = nBigMacs*Price*(1+taxRate);
    System.out.println("The cost of the Big Macs is $"+String.format("%1$,.2f", cost));//Print statement
    
}
}