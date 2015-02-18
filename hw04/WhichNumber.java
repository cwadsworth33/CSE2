import java.util.Scanner;

public class WhichNumber{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.println("Think of an integer from 1 to 10");
        System.out.println("To answer a question, input 1 as yes or 0 as no");
        System.out.println("Is the number even?");
        int number = 0;
        int even = myScanner.nextInt();
        
        if(even==1){
            System.out.println("Is it divisible by 3?");
            int div3 = myScanner.nextInt();
                if (div3==1){number = 6;}
                else {
                    System.out.println("Is it divisible by 4?");
                    int div4 = myScanner.nextInt();
                    if(div4==1){
                        System.out.println("Is the number divided by 4 >1?");
                        int div4Greater1 = myScanner.nextInt();
                        if(div4Greater1==1){number = 8;}
                        if(div4Greater1==0){number = 4;}}
                    else{
                        System.out.println("Is it divisible by 5?");
                        int div5 = myScanner.nextInt();
                        if(div5==1){number = 10;}
                        else{number = 2;}
                    }
                    
                }
        }
        else{
            System.out.println("Is it divisible by 3?");
            int Div3 = myScanner.nextInt();
            if(Div3==1){
                System.out.println("Is the number divided by 3 >1?");
                int div3Greater1 = myScanner.nextInt();
                if (div3Greater1==1){number = 9;}
                else{number = 3;}
            }
            else{
            System.out.println("Is it greater than 6?");
            int greater6 = myScanner.nextInt();
            if(greater6==1){number=7;}
            else{
                System.out.println("Is it less than 3?");
                int less3 = myScanner.nextInt();
                if(less3==1){number = 1;}
                else{number=5;}
                
            }
            
        }
    }
    System.out.println("The number is "+number);
}
}