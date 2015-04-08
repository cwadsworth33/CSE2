import java.util.Scanner;//import scanner
public class waves{//create class
    public static void main(String[] args){//main method
    Scanner myScanner;//initialize scanner myscanner
    myScanner = new Scanner(System.in);//create new scanner
    int n=myScanner.nextInt();//n as scanner variable
    factorial(n);
    print(sum);
    
    }
public static int factorial(int n){
    
    int product = 1;
    int sum=0;
    
    while(n>0){
        int c=n;
        while(c>0){
        product=product*n;
        c--;
    }
    sum=sum+product;
    n--;
    return sum;
    }
    
public static int print(int sum){
    System.out.println("The super factorial is "+sum);
}
    
    
}
}