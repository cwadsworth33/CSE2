// Christian Wadsworth
// cse 002 hw06
// MakeSymbols.java
// 3/3/15

public class MakeSymbols{ //public class GetIntegers
    public static void main(String[] args){ 
        int number=(int)(Math.random()*100);//find random number between 0 and 100
        System.out.println("Random number generated: "+number);//Ask for user input
        if(number%2==0){//if number is even
            do {number--;//subtract one from number
                System.out.print("*");//prints a star
                
            } while(number>0);//keeps looping until number = 0
        }
        
        if(number%2==1){//if number is odd
            do {// loop
                number--;// subtract one from number
                System.out.print("&");//print the and symbol
                
            } while(number>0);//keeps looping until number = 0
        }
    }
}