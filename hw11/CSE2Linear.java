import java.util.Scanner;
import java.util.Random;
public class Untitled{
    
    public static void main(String [] args){
    Scanner myScanner;
    myScanner = new Scanner (System.in);//new scanner
    int [] array;//initialize array
    array = new int[15];//set length of array
    int fill; // initialize integer fill
    for(int i=0; i<15; i++){ // fill array
        fill=-1;
        while(fill <0 || fill>100 || fill<array[i-1]){ //checks inputs to make sure they are valid
            System.out.println("Enter a number between 0 and 100 that is greater than the previous number."); 
            fill = myScanner.nextInt();//takes input from user
            if(fill<array[i-1] || fill>100 || fill<0){ //invalid case
                System.out.println("Invalid number."); //error message
            }
        }
    }
     System.out.println("Enter the number to be searched for");
        int search = myScanner.nextInt();
        binary(array,search); // run binary search
        randomize(array); //run randomize array
        linear(array); // run linear search
        
    }
    
    public static void binary(int [] array, int search){
        for (int i=0; i<6; i++){
            
        }
    }
    
    
    public static int [] randomize(int [] array){ //randomizer method
    int [] memory;
    memory = new int[15];
    int random = 0;
    for(int j=0; j<15; j++){
        random = (int)Math.random()*15;
        array[j]=given[random];
    
    }
    }
        
    }
    
    public static void linear(int [] array, int search){ // method for linear search
    int c = 0;
        for(int i=0; i<15; i++){ // loop to find 
            if (array[i]=search){
                System.out.println("Grade found "+i+"iterations.");
                break;
                c=1;
            }
        }
        if(c==0){
            System.out.println("Grade not found.");
        }
    }
    
}