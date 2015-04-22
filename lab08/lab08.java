import java.util.Scanner;//import scanner
public class lab08{//create class
    public static void main(String[] args){//main method
    Scanner myScanner;//initialize scanner myscanner
    myScanner = new Scanner(System.in);//create new scanner
    System.out.println("Please enter a number.");
    int n=myScanner.nextInt();//n as scanner variable
    int sum = 0; //initialize variable sum as 0
    while(n>0){ //calulate super factorial using method factorial to build on sum
        sum=sum+factorial(n); 
        n--;
    }
    
    print(sum); //call print method
    
    }
public static int factorial(int n){ //method factorial calculates factorial of number
    
    int product = 1; //initialize variable product as 1
    while(n>0){ //loop to continue to multiply product by 1 less each time until 1
        product = n*product;
        n--;
    }
    return product; //return product
    
    }
    
public static void print(int sum){
    System.out.println("The super factorial is "+sum); //print super factorial
}
    
    
}
