
import java.util.Scanner;
public class Cookies{
    public static void main(String [] args){ //main method
        Scanner myScanner; //new scanner
        myScanner = new Scanner(System.in);
        System.out.println("Please enter the number of cookies");
        int numberCookies = myScanner.nextInt();
        if(numberCookies < 0){ //invalid number of cookies
            System.out.println("Invalid number of cookies.");
            return;
        }
        System.out.println("Please enter the number of people.");
        int numberPeople = myScanner.nextInt();
        if(numberPeople<0){  //
            System.out.println("Invalid number of people.");
            return;
        }
        System.out.println("Please enter the number of cookies per person.");
        int cookiesPerPersonWanted = myScanner.nextInt();
        if(cookiesPerPersonWanted <0){
            System.out.println("Invalid number.");
            return;
        }
        
        int cookiesPerPersonActual = (int)Math.floor(numberCookies/numberPeople);
        int leftovers = numberCookies - cookiesPerPersonWanted*numberPeople;
        int evenly = numberCookies%(numberPeople);
        int deficit;
        
        if(leftovers<0){
            deficit = -1 * leftovers;
            System.out.println("There are not enough cookies. You need "+deficit+" more cookies.");
        }
        else{
            deficit = leftovers;
            if(evenly==0){
                System.out.println("There are enough cookies and they divide evenly. There are "+leftovers+" cookies extra.");
            }
            else{
                System.out.println("There are enough cookies but they do not divide evenly. There are "+leftovers+" cookies extra.");
            }
        }
        
    }
}