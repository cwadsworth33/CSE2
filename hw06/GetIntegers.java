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
        int integer=0;//initialize integer as 0
        int sum=0;//initialize sum as 0
        System.out.println("Please enter 5 positive integers.");//Prompt user
        for(int i=0; i<5; i++){//for loop to repeat action exactly 5 times
            integer=myScanner.nextInt();//reassign integer to scanner from user 

            
            
            if(integer<0){//throws out negative numbers
                System.out.println("Invalid input");
                i=-1;
                sum=0;
            }
            sum=sum+integer;//adds up all integers

        }
        System.out.println("Sum:"+sum);//final print
        
        
        
    }
}
