// Christian Wadsworth
// cse 002 hw06
// MakeSymbols.java
// 3/3/15

public class MakeSymbols{ //public class GetIntegers
    public static void main(String[] args){
        int number=(int)(Math.random()*100);
        System.out.println("Random number generated: "+number);
        if(number%2==0){
            do {number--;
                System.out.print("*");
                
            } while(number>0);
        }
        
        if(number%2==1){
            do {
                number--;
                System.out.print("&");
                
            } while(number>0);
        }
    }
}