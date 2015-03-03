// Christian Wadsworth
// cse 002 hw06
// GetIntegers.java
// 3/2/15

import java.util.Scanner; //import scanner
public class GetIntegers{ //public class GetIntegers
    public static void main(String[] args){ 
        Scanner myScanner; //Initialize scanner
        myScanner = new Scanner(System.in); //Create new scanner
        //Loop to take a positive integer from the user (only +)
        int integer;
        int sum=0;
        System.out.println("Please enter 5 positive integers.");
        for(int i=0; i<5; i++){
            integer=myScanner.nextInt();
            if(integer<0){
                System.out.println("Only positive numbers");
                i=0;
                sum=0;
            }
            sum=sum+integer;

        }
        System.out.println("Sum:"+sum);
        
        
        
    }
}
