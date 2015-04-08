// Christian Wadsworth
// cse 002 hw06
// waves.java
// 3/17/15

import java.util.Scanner;//import scanner
public class waves{//create class
    public static void main(String[] args){//main method
    Scanner myScanner;//initialize scanner myscanner
    myScanner = new Scanner(System.in);//create new scanner
    
    int number = 0;//initialize integer number as 0 
    while(number<1 || number >30){//while loop to throw out inputs not in the accepted range
        System.out.print("Enter a number from 1 to 30: ");//Prompt the user
    number=myScanner.nextInt();//number is number taken from user by scanner}
    
    ///////////////////////////////////////////////////////////////// for loops
    System.out.println("For loops"); // title 
    for(int i=0; i<=number; i++){ //outside for loop; reads number input and 
    //repeats printing process that number of times
    
        for(int j=0; j<=i; j++){ //First nested for loop; responsible for 
        //creating new lines
            
            if(i%2==0){ //Condition: runs contained code if i is currantly an even #
                if(j!=0 && j!=1){ //jumps to new line when j>1
              System.out.println(""); } //space
            for(int k=0; k<j; k++){ //Second nexted for loop; responsible for printing
            //the numbers
                System.out.print(i);//Prints i (the current number in count)
            }}
            else{//Condition: runs contained code if i is currently an odd #
                
                    System.out.println("");//space
                
            for(int k=i; (k-j)>0; k-= 1){ //Second nested for loop; responsible for
            //printing the numbers
                System.out.print(i);//Prints i
            }
            }
        }
    }
    /////////////////////////////////////////////////////////// while loops
    System.out.println("");
    System.out.println("While loops");
    int i=0;
    while(i<number){ //outside for loop; reads number input and 
    //repeats printing process that number of times
        i++;//increment i
        int j=0;//initialize j as 0
        while(j<i){ //First nested while loop; responsible for 
        //creating new lines
            j++;//increment j
            if(i%2==0){ //Condition: runs contained code if i is currantly an even #
                if(j!=0){ //jumps to new line when j>0
              System.out.println(""); } //space
              int k=0;//initialize k as 0
            while(k<j){ //Second nexted while loop; responsible for printing
            //the numbers
                k++;//increment k
                System.out.print(i);//Prints i (the current number in count)
            }}
            else{//Condition: runs contained code if i is currently an odd #
                
                    System.out.println("");//space
                int k=i;//initialize k as equal to i
            while((k-j)>=0){ //Second nested while loop; responsible for
            //printing the numbers
                k-= 1;//deincrement k
                System.out.print(i);//Prints i
            }
            }
        }
    }
    
   /////////////////////////////////////////////////////////////// do while
   System.out.println("");
   System.out.println("Do While loops");
    int a=0;//initialize counter a
    do{ //outside for loop; reads number input and 
    //repeats printing process that number of times
        a++;//increment a
        int j=0;//initialize j as 0
        do{ //First nested while loop; responsible for 
        //creating new lines
            j++;//increment j
            if(a%2==0){ //Condition: runs contained code if i is currantly an even #
                if(j!=0){ //jumps to new line when j>0
              System.out.println(""); } //space
              int k=0;//initialize k as 0
            do{ //Second nexted do while loop; responsible for printing
            //the numbers
                k++;//increment k
                System.out.print(a);//Prints i (the current number in count)
            }while(k<j);}
            else{//Condition: runs contained code if i is currently an odd #
                
                    System.out.println("");//space
                int k=a;//initialize k as equal to i
            do{ //Second nested do while loop; responsible for
            //printing the numbers
                k-= 1;//deincrement k
                System.out.print(a);//Prints i
            }while((k-j)>=0);
            }
        }while(j<a);
    }while(a<number);
    
    
    
    
    }

}