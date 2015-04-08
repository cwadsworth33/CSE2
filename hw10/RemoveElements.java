
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	} while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
 ////////////////////////////////////////////////////////////////////////////////////
 public static int [] randomInput(){
        int length = 10;//sets length to 10
        int [] array;//initialize array
        array = new int[length];//set length of array
        for(int i=0; i<length; i++){//fill spaces in array
            array [i] = (int)(Math.random()*10);//creates random number and 
            //assigns it to space i
            
        }
        return array;//return array
    }
////////////////////////////////////////////////////////////////////
public static int [] delete(int [] list, int pos){ //method array
        int length = list.length;//find length of array list
        int [] array2;//initialize array
        array2 = new int[length-1];//set length of array
        if(pos>length || pos<0){//Prints error if there is no position pos in list
        	System.out.println("Invalid Input position does not exist");//error message
        }
        else{//else runs real method
        
        int j=0;//initialize second counter j
        for(int i=0; i<length-1; i++){//fill spaces in array
            if(i==pos){//condition i equals position doesn't increment j
            }
            else{
            array2 [j] = list[i];//copies list(j) over to array2 (j)
            j++; //increment j
            }
            
        }
        
        }
        return array2; // return array2
        
    }
    //////////////////////////////////////////////////////////////
  public static int [] remove(int [] list, int target){  //method remove
	int length = list.length;// find length of array list
	int j=0; // initialize secondary counter j
	for(int i=0; i<length; i++){
		if(list[i]==target){ //Checks to see if target is in list 
			j++;
		}
	}
	if(j==0){System.out.println("Target is not in array");}
	int [] array3;//initialize array
  array3 = new int[length-j];//set length of array
  int a=0;//initialize secondary counter a
  for(int k=0; k<length-j; k++){//for loop to fill new array3
  	if(list[k]==target){
  		a++;
  	}
  	else{
  		array3[k]=list[a];
  		a++;
  	}
  }
  return array3;
}
    
}