
import java.util.Scanner;
public class lab9{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int input = 1;
        while(input==1){
            System.out.println("The "+adjective()+" "+nounSubject()+" "+verb()+" the "+nounObject()+".");
            System.out.println("Enter 1 to get another sentance anything else to quit.");
            input = myScanner.nextInt();
        }
    }
    public static String adjective(){
        int random = (int)(Math.random()*9);
        String output = "";
        switch(random){
            case 1: random = 0;
            output = "blue";
            break;
            case 2: random = 1;
            output = "fat";
            break;
            case 3: random = 2;
            output = "square";
            break;
            case 4: random = 3;
            output = "fast";
            break;
            case 5: random = 4;
            output = "random";
            break;
            case 6: random = 5;
            output = "sharp";
            break;
            case 7: random = 6;
            output = "omnipotent";
            break;
            case 8: random = 7;
            output = "slanted";
            break;
            case 9: random = 8;
            output = "soft";
            break;
            case 10: random = 9;
            output = "noble";
            break;
            default: output = "strange";
            break;
            
        }
        return output;
    }
    public static String nounSubject(){
        int random = (int)(Math.random()*9);
        String output="";
        switch(random){
            case 1: random = 0;
            output = "dog";
            break;
            case 2: random = 1;
            output = "battery";
            break;
            case 3: random = 2;
            output = "cake";
            break;
            case 4: random = 3;
            output = "cat";
            break;
            case 5: random = 4;
            output = "banana";
            break;
            case 6: random = 5;
            output = "stapler";
            break;
            case 7: random = 6;
            output = "donut";
            break;
            case 8: random = 7;
            output = "guitar";
            break;
            case 9: random = 8;
            output = "gym bag";
            break;
            case 10: random = 9;
            output = "mouse";
            break;
            default: output = "goose";
            break;
            
        }
        return output;
    }
    public static String verb(){
        int random = (int)(Math.random()*9);
        String output="";
        switch(random){
            case 1: random = 0;
            output = "ate";
            break;
            case 2: random = 1;
            output = "ran";
            break;
            case 3: random = 2;
            output = "played";
            break;
            case 4: random = 3;
            output = "wrote";
            break;
            case 5: random = 4;
            output = "slept";
            break;
            case 6: random = 5;
            output = "jumped";
            break;
            case 7: random = 6;
            output = "wore";
            break;
            case 8: random = 7;
            output = "met";
            break;
            case 9: random = 8;
            output = "drove";
            break;
            case 10: random = 9;
            output = "read";
            break;
            default: output = "kicked";
            break;
            
        }
        return output;
    }
    public static String nounObject(){
        int random = (int)(Math.random()*9);
        String output="";
        switch(random){
            case 1: random = 0;
            output = "whale";
            break;
            case 2: random = 1;
            output = "water";
            break;
            case 3: random = 2;
            output = "pencil";
            break;
            case 4: random = 3;
            output = "book";
            break;
            case 5: random = 4;
            output = "violin";
            break;
            case 6: random = 5;
            output = "car";
            break;
            case 7: random = 6;
            output = "plank";
            break;
            case 8: random = 7;
            output = "chair";
            break;
            case 9: random = 8;
            output = "fire";
            break;
            case 10: random = 9;
            output = "paper";
            break;
            default: output = "desk";
            break;
            
        }
        return output;
    }
}