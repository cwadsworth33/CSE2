import java.util.Scanner;
public class zigzag{
    public static void main(String[] args){
        Scanner scan;
        scan = new Scanner(System.in);
        
        String yes = "y";
        int nStars = 0;
        while(yes.equals("y") || yes.equals("Y")){
            while (nStars<3||nStars>33){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter the number for nStars");
        nStars=myScanner.nextInt();
        if(nStars<=1){
            System.out.println("Number not valid.");
        }
            }
        String star = "*";
        for(int i=0; i<nStars; i++){
            System.out.print(star);
        }
        for(int j=0; j<nStars-1; j++){
            for(int k=0; k<j; k++){
                System.out.print(" ");
            }
            System.out.print(star);
            System.out.println("");
        }
        for(int i=0; i<nStars; i++){
            System.out.print(star);
    }
    System.out.println("Enter Y or y to continue anything else to quit");
    yes=scan.nextLine();
    nStars=0;
        }
}
}