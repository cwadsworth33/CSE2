import java.util.Scanner;

public class WhichNumber{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.println("Think of an integer from 1 to 10");
        System.out.println("To answer a question, input 1 as yes or 0 as no");
        System.out.println("Is the number even?");
        int number = 0;
        int even = myScanner.nextLine();
        
        if(even.equals(y)||even.equals(Y)){
            System.out.println("Is it divisible by 3?");
            int div3 = myScanner.nextLine();
                if (div3.equals(y)||div3.equals(Y)){number = 6;}
                else if(div3.equals(n)||div3.equals(N)); {
                    System.out.println("Is it divisible by 4?");
                    int div4 = myScanner.nextLine();
                    if(div4.equals(y)||div4.equals(Y)){
                        System.out.println("Is the number divided by 4 >1?");
                        int div4Greater1 = myScanner.nextInt();
                        if(div4Greater1==1){number = 8;}
                        if(div4Greater1==0){number = 4;}}
                    else if(div4.equals(n)||div4.equals(N)){
                        System.out.println("Is it divisible by 5?");
                        int div5 = myScanner.nextInt();
                        if(div5==1){number = 10;}
                        else{number = 2;}
                    }
                    else{System.out.println("Invalid input.");}
                    
                }
                else{System.out.println("Invalid input.")
        }
        else if(even.equals(n)||even.equals(N)){
            System.out.println("Is it divisible by 3?");
            int Div3 = myScanner.nextInt();
            if(Div3.equals(y)||Div3.equals(Y)){
                System.out.println("Is the number divided by 3 >1?");
                int div3Greater1 = myScanner.nextInt();
                if (div3Greater1.equals(y)||div3Greater1.equals(Y))
                    {number = 9;}
                else {number = 3;}
            }
            else if(Div3.equals(n)||Div3.equals(N)){
            System.out.println("Is it greater than 6?");
            int greater6 = myScanner.nextInt();
            if(greater6.equals(y)){number=7;}
            else if(greater6.equals(n)){
                System.out.println("Is it less than 3?");
                int less3 = myScanner.nextInt();
                if(less3==1){number = 1;}
                else{number=5;}
                
            }
            else{System.out.print("Invalid input.");}
            
        }
    }
    else{System.out.println("Invalid input.");}
    System.out.println("The number is "+number);
}
}
}