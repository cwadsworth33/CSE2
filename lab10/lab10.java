import java.util.Scanner;//import scanner
import java.util.Arrays;
public class lab10{//set up class
    public static void main(String [] args){//main method
        Scanner myScanner;//scanner myScanner
        myScanner = new Scanner (System.in);//new scanner
        int length=-1;//initialize length to be 0
        while(length<0){ //
        System.out.println("Enter a positive integer");
        length = myScanner.nextInt();}// find positive integere length
        
    int [] array;//initialize array
    array = new int[length];//set length of array
    
    for(int i=0; i<length; i++){//fill spaces in array
        int num = -1;
        while(num<0){
            System.out.println("Enter a positive integer");
            num=myScanner.nextInt();
            if(num<1){
                System.out.println("Sorry that was not a positive integer");
            }
        }
            array[i]=num;
        }
        System.out.println(Arrays.toString(array));//print array
    }
}
