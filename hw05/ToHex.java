// Christian Wadsworth
// Cse 2 Hw05
// ToHex.java
// 2/24/15

import java.util.Scanner;//import scanner
public class ToHex{//class ToHex
    public static void main(String [] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in);//new scanner
        System.out.println("Enter the 3 numbers that represent RGB values.");
        String string = myScanner.nextLine();//obtains entered string
        String test = " ";//creates an empty test variable
        int c = 0;//counter
        String character = " ";//initialize character so that initial while loop 
        //condition is true
        
        while (character.equals(test)){ //Gets rid of spaces in front of first number
            char stringN = string.charAt(c);
            character=Character.toString(stringN);
            c++;
        }
        
        /////////////////////////////////////////////////////////////////
        String character1 = "a";
        int i=c;
        char string11='\0';//initialize red components 
        char string12='\0';
        char string13='\0';
        while (!character1.equals(test)){//pulls chars from entered string
        //increasing by one each time
            if(c==i){  //first character in first color number
                string11 = string.charAt(c-1);
                c++;  
            }
            else if(c==i+1){//second character in first color number
                string12 = string.charAt(c-1);
                c++;
            }
            else if(c==i+2){//third character in first color number
                string13 = string.charAt(c-1);
                c++;
                
            }
    
            else {//if it still reads a number past three numbers prints an error
                System.out.println("Error");
                break;
            }
            char stringA = string.charAt(c-1);
            character1=Character.toString(stringA);
            String str1;//initialize the first color combo of all chars
            StringBuilder sb1 = new StringBuilder();//create first color string by adding 3 chars
            sb1.append(string11);
            sb1.append(string12);
            sb1.append(string13);
            str1 = sb1.toString();
            int decimalOne = Integer.parseInt(str1);//convert string to integer
            int div11=decimalOne%16;//mod number once
            int div12=decimalOne/16 %16;//mod it again
            String hex11=" ";
            switch(div11) { //converts integers to hex symbols if over 10 for first hex component
                case 10: hex11="A";
                        break;
                case 11: hex11="B";
                        break;
                case 12: hex11="C";
                        break;
                case 13: hex11="D";
                        break;
                case 14: hex11="E";
                        break;
                case 15: hex11="F";
                        break;
                default: hex11=String.valueOf(div11);
                        break;
            
            }
            String hex12= " ";//converts integers to hex symbols if over 10 for second hex component
            switch(div12) {
                case 10: hex12="A";
                        break;
                case 11: hex12="B";
                        break;
                case 12: hex12="C";
                        break;
                case 13: hex12="D";
                        break;
                case 14: hex12="E";
                        break;
                case 15: hex12="F";
                        break;
                default:hex12=String.valueOf(div12);
                        break;
            
            }
        }
        
        ///////Does same thing as first section only for second color///////////////////////////
        String character2 = "a";
        int j=c;
        char string21='\0';
        char string22='\0';
        char string23='\0';
        char string24='\0';
        while (!character2.equals(test)){
            if(c==j){
                string21 = string.charAt(c-1);
                c++; 
            }
            else if(c==j+1){
                string22 = string.charAt(c-1);
                c++;
            }
            else if(c==j+2){
                string23 = string.charAt(c-1);
                c++;
            }
            else if(c==j+3){
                string24 = string.charAt(c-1);
                c++;
            }
    
            else {
                System.out.println("Error");
                break;
            }
            char stringB = string.charAt(c-1);
            character2=Character.toString(stringB);
            String str2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string21);
            sb2.append(string22);
            sb2.append(string23);
            str2 = sb2.toString();
            int decimalTwo = Integer.parseInt(str2);
            
        }
        int div21=decimalOne%16;
            int div22=Math.floor(decimalOne/16)%16;
            String hex21=" ";
            String hex22=" ";
            switch(div21) {
                case 10: hex21="A";
                        break;
                case 11: hex21="B";
                        break;
                case 12: hex21="C";
                        break;
                case 13: hex21="D";
                        break;
                case 14: hex21="E";
                        break;
                case 15: hex21="F";
                        break;
                default: hex11=String.valueOf(div21);
                        break;
            
            }
            switch(div22) {
                case 10: hex22="A";
                        break;
                case 11: hex22="B";
                        break;
                case 12: hex22="C";
                        break;
                case 13: hex22="D";
                        break;
                case 14: hex22="E";
                        break;
                case 15: hex22="F";
                        break;
                default:hex22=String.valueOf(div22);
                        break;
            
            }
        
        /////////////Does same thing as first section only for third color/////////////////////
        String character3 = "a";
        int k=c;
        char string31='\0';
        char string32='\0';
        char string33='\0';
        char string34='\0';
        while (!character3.equals(test)){
            if(c==k){
                string31 = string.charAt(c-1);
                c++;  
            }
            else if(c==k+1){
                string32 = string.charAt(c-1);
                c++;
            }
            else if(c==k+2){
                string33 = string.charAt(c-1);
                c++;
            }
            else if(c==k+3){
                string34 = string.charAt(c-1);
                c++;
                break;
            }
    
            else {
                System.out.println("Error");
                break;
            }
            char stringC = string.charAt(c-1);
            character3=Character.toString(stringC);
            String str3;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string31);
            sb3.append(string32);
            sb3.append(string33);
            str3 = sb3.toString();
            int decimalThree = Integer.parseInt(str3);
            int div31=decimalOne%16;
            int div32=Math.floor(decimalOne/16)%16;
            String hex31=" ";
            String hex32=" ";
            switch(div31) {
                case 10: hex31="A";
                        break;
                case 11:  hex31="B";
                        break;
                case 12:  hex31="C";
                        break;
                case 13:  hex31="D";
                        break;
                case 14:  hex31="E";
                        break;
                case 15:  hex31="F";
                        break;
                default: hex31=String.valueOf(div31);
                        break;
            
            }
            switch(div32) {
                case 10:  hex32="A";
                        break;
                case 11:  hex32="B";
                        break;
                case 12:  hex32="C";
                        break;
                case 13:  hex32="D";
                        break;
                case 14:  hex32="E";
                        break;
                case 15:  hex32="F";
                        break;
                default:hex32=String.valueOf(div32);
                        break;
            
            }
            
        }
        System.out.println(hex11+hex12+hex21+hex22+hex31+hex32);//prints hex number
        
        
    }
}