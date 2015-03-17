// Christian Wadsworth
// cse 002 hw06
// GetIntegers.java
// 3/2/15

import java.util.Scanner; //import scanner
public class RunFactorial{ //public class GetIntegers
    public static void main(String[] args){ 
        Scanner myScanner; //Initialize scanner
        myScanner = new Scanner(System.in); //Create new scanner
        int number=0;//initialize variable number as an int
        int product=1;//initialize variable product as an int
       
        while(number<9||number>16){//while loop to make sure input is between 9 and 16
        System.out.println("Enter a number to be factorialized between 9 and 16");//user prompt
        number=myScanner.nextInt();//variable number assigned to scanner input
        
        }
        while (number>0){//while loop to calculate the factorial. 
            product = product*number;//multiplies number by the existing product initialized as one
            number--;//subtracts one from number
            
        }
        System.out.println("The factorial is "+product);//prints the product
    }
}