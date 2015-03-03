// Christian Wadsworth
// cse 002 hw06
// GetIntegers.java
// 3/2/15

import java.util.Scanner; //import scanner
public class RunFactorial{ //public class GetIntegers
    public static void main(String[] args){ 
        Scanner myScanner; //Initialize scanner
        myScanner = new Scanner(System.in); //Create new scanner
        int number=0;
        int product=1;
        while(number<9||number>16){
        System.out.println("Enter a number to be factorialized between 9 and 16");
        number=myScanner.nextInt();
        
        }
        while (number>0){
            product = product*number;
            number--;
            
        }
        System.out.println("The factorial is "+product);
    }
}