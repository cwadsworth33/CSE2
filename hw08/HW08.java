import java.util.Scanner;//import scanner
public class HW08{//set up class
public static void giant(){//method giant 
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
}
public static void box(){//method box
        System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               ");
}
public static void cave(){//method cave
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
}

public static String getInput(Scanner scan, String string){ //method getInput
    scan = new Scanner(System.in);//scanner
    scan = scan.nextLine();
    if(scan.equals("c")||scan.equals("C")){//if correct input 
        return scan;//return input
    }
    else{
        System.out.println("YEA RIGHT LOSER");//incorrect input quits program
        System.exit(0);
    }
}
public static String getInput(Scanner scan, String string, int trial){//method getInput
    scan = new Scanner(System.in);//scanner
    int hits = 0;//initialize variable hits
    while(hits<10){//loop while hits is less than 10
    scan = scan.nextLine();//scanner scan
    
    if(scan.equals("a")||scan.equals("A")){//if valid attack input
        double attack = Math.random();//random number from 0 to 1
        int critical;//initialize variable critical
        if(attack>.5){//if random number is greater than .5
            critical = 1;//critical hit 
        }
        else{critical = 0;}//else no critical hit
        hits = hits + critical;//add up hits
    }
    else if(scan.equals("e")||scan.equals("E")){//escape command
        double escape = Math.ranom()*10;//random number from 1 to 10
        if(escape>9){return;}//escape successful if number is 10
    }
    else{System.out.print("You lose.");{System.exit(0);}//invalid input quits game
}
}
public static String getInput(Scanner scan){//method getInput
    scan = new Scanner(System.in);
    String input = scan.nextLine();//scanner
    
    switch (input) {//switch statement for chest method
            case 1:  getInput = "You get a cookie";
                     break;
            case 2:  getInput = "You get a peanut";
                     break;
            case 3:  getInput = "You get a trunk of exotic Persian rugs";
                     break;
            default: getInput = "You get nothing";
            return getInput;
            
    
}
public static void main(String[] args) { //main method
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
}