// Christian Wadsworth
// Homework 4
// Banking.java
// 2/17/15
import java.util.Scanner;//Import scanner

public class Banking{//Initiate class Banking
    public static void main(String[] args){
        Scanner myScanner;//initialize scanner 1 (strings)
        Scanner myScanner1;//initialize scanner 2 (integers)
        myScanner = new Scanner( System.in);
        myScanner1 = new Scanner(System.in);
        System.out.print("Would you like to deposit, withdraw, or view?");
        String a = myScanner.nextLine();
        
        
        double randomNumber=1000+(double)(Math.random()*4000);//Returns random number from 1000 to 5000
        double roundNumber = Math.round(randomNumber * 100.0) / 100.0;//Rounds to 2 decimal places
        //Sets up switch statement to compare string a to expected commands
        switch(a){
            case "deposit": //Case deposit
                System.out.println("The balance is $"+roundNumber);
                System.out.print("Enter the amount you would like to deposit $");
                double deposit1 = myScanner1.nextDouble(); //Asks for amount to deposit
                double balance1 = deposit1 + randomNumber; //Calculates balance
                double roundBalance1 = Math.round(balance1 * 100.0) / 100.0;//rounds balance
                System.out.print("The new balance is $"+roundBalance1);//prints balance
                break;//breaks switch
            case "withdraw"://Case withdraw
                System.out.println("The balance is $"+roundNumber);
                System.out.print("Enter the amount you would like to withdraw $");
                double withdraw = myScanner1.nextDouble();//Takes amount withdrawn
                double balance2 = randomNumber - withdraw;//Calculates new balance
                double roundBalance2 = Math.round(balance2 * 100.0) / 100.0;//rounds balance
                if(roundBalance2>=0){System.out.print("The new balance is $"+roundBalance2);}
                //prints balance if it is a valid withdraw amount
                else{System.out.print("You can't withdraw that much.");} //Prints error statement if not a valid amount
                break;//break
            case "view"://case view
                double roundBalance3 = Math.round(randomNumber * 100.0) / 100.0;//rounds random number
                System.out.print("Your balance is $"+roundBalance3);//prints balance
                break;//break
            default://prints error message in event of an invalid input
                System.out.print("Invalid command.");
        
        } 
          
    }
}