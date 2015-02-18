//Christian Wadsworth
//Homework 4 Cse 002
//WhichNumber.java
// 2/17/15


import java.util.Scanner;//import scanner

public class WhichNumber{//set up class
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner (System.in);//initialize scanner
        System.out.println("Think of an integer from 1 to 10");
        System.out.println("To answer a question, input y as yes or n as no");
        System.out.println("Is the number even?");
        int number = 0;//give int an initial value so it can exist in multiple scopes
        String even = myScanner.nextLine();//string even as scanner input
        
        if(even.equals("y")){//Number is even
            System.out.println("Is it divisible by 3?");//asks if # is divisible by 3
            String div3 = myScanner.nextLine();
                if (div3.equals("y")){number = 6;}//# is divisible by 3
                else if (div3.equals("n")) {//not divisible by 3
                    System.out.println("Is it divisible by 4?");
                    String div4 = myScanner.nextLine();
                    if(div4.equals("y")){//divisible by 4
                        System.out.println("Is the number divided by 4 >1?");
                        String div4Greater1 = myScanner.nextLine();
                        if(div4Greater1.equals("y")){number = 8;}//div 4 is greater than 1
                        else if (div4Greater1.equals("n")){number = 4;}//div 4 equals 1
                        else{System.out.println("Invalid input.");}//error
                    }
                    else if (div4.equals("n")){//not divisible by 4
                        System.out.println("Is it divisible by 5?");
                        String div5 = myScanner.nextLine();
                        if(div5.equals("y")){number = 10;}//divisible by 5
                        else if (div5.equals("n")){number = 2;}//not divisible by 5
                        else{System.out.print("Invalid input");}//error
                    }
                    else{System.out.println("Invalid input.");}//error
                    
                }
                else{System.out.print("Invalid input.");}//error
        }
        else if (even.equals("n")){//odd number
            System.out.println("Is it divisible by 3?");
            String Div3 = myScanner.nextLine();
            if(Div3.equals("y")){//divisible by 3
                System.out.println("Is the number divided by 3 >1?");
                String div3Greater1 = myScanner.nextLine();
                if (div3Greater1.equals("y")){number = 9;}//div 3 greater than 1
                else if (div3Greater1.equals("n")) {number = 3;}// div 3 not greater than 1
                else{System.out.print("Invalid input.");}//error
            }
            else if (Div3.equals("n")){//not divisible by 3
            System.out.println("Is it greater than 6?");
            String greater6 = myScanner.nextLine();
            if(greater6.equals("y")){number=7;}//greater than 6
            else if (greater6.equals("n")){//not greater than 6
                System.out.println("Is it less than 3?");
                String less3 = myScanner.nextLine();
                if(less3.equals("y")){number = 1;}//less than 3
                else if (less3.equals("n")){number=5;}//not less than 3
                else {System.out.println("Invalid input.");}
                
            }
            else {System.out.println("Invalid input.");}//error
            
        }
        else{System.out.print("Invalid input.");}//error
    }
    else{System.out.print("Invalid input.");}
    if(number==0){}
    else{System.out.println("The number is "+number);}//prints number
    
    
}
}