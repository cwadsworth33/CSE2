import java.util.Scanner;
public class labEleven{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner = new Scanner (System.in);//new scanner
        int length = myScanner.nextInt();
        int [] array1;//initialize array
        array1 = new int[50];//set length of array
        int [] array2;
        array2 = new int [50];
        for(int i=0; i<50; i++){
            array1[i]=(int)(Math.random()*100);
        }
        for(int j=0; j<50; j++){
            array2[j]=(int)(Math.random()*100+j*100);
        }
        for(int a=1; a<50; a++){
            int min = array1[0];
            if(array1[a]<min){
                min = array1[a];
            }
            int max = array1[0];
            if(array1[a]>max){
                max = array1[a];
            }
        }
        
    }
    
    }