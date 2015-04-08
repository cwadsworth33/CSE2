import java.util.Arrays;
public class random{
    public static void main(String [] args){
        int length = 10;
        int [] array;//initialize array
        array = new int[length];//set length of array
        for(int i=0; i<length; i++){//fill spaces in array
            array [i] = (int)(Math.random()*10);
            
        }
        System.out.println(Arrays.toString(array));
        
    }
}