import java.util.Scanner;
import java.util.Arrays;
public class labEleven{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner = new Scanner (System.in);//new scanner
        System.out.println("Enter a number to be searched for");
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
        int min = 789;
        int max = 0;
        for(int a=1; a<50; a++){
            min = array1[0];
            if(array1[a]<min){
                min = array1[a];
            }
             max = array1[0];
            if(array1[a]>max){
                max = array1[a];
            }
        }
        System.out.println("The minimum value of array1 is "+min);
        System.out.println("The maximum value of array 1 is "+max);
        System.out.println("The maximum value of array 2 is "+array2[49]);
        System.out.println("The minimum value of array 2 is "+array2[0]);
        
        if(binarySearch(array2,length)==-1){
            System.out.println("Number not found");
        }
        else{
        System.out.println("The number is in the array");
        }
        int close = 0;
        for(int k=0; k<50; k++){
            if(Math.abs(array2[k]-length) < Math.abs(array2[k]-close)){
                close = array2[k];
            }
        }
        System.out.println("The closest bound is "+close);
        int check = 0;
        for(int x=0; x<50; x++){
            check = array2[x];
            if(check==close&&length>close&&x!=49){
                System.out.println("The number above the target is "+array2[x+1]);
            }
            else if(check==close&&length<close&&x!=0){
                System.out.println("The number below the target is "+array2[x-1]);
            }
            else if(check==close&&(x==49||x==0)){
                System.out.println("Only one bound in array");
            }
            
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        
        
       
    }
     public static int binarySearch(int[] list, int key){
            int low =0;
            int high=list.length-1;
            
            while(high>=low){
                int mid = (low + high)/2;
                if(key < list[mid]){
                    high = mid-1;
                }
                else if(key == list[mid]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
                
                    
            }
            return -1;
     }
        }
    