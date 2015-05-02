import java.util.Arrays;
public class lab13{
    public static void main(String [] args){
        int[][]jaggedArray=randomJagged();
        for(int i=0; i<5; i++){
            printArray(jaggedArray[i]);
            System.out.println("");
        }
        for(int i=0; i<5; i++){
            Arrays.sort(jaggedArray[i]);
            
        }
        System.out.println("");
        for(int i=0; i<5; i++){
            printArray(jaggedArray[i]);
            System.out.println("");
        }
        int[][]sorted = new int[17][5];
        sorted=filler(jaggedArray);
        print2DMatrix(sorted);
    }
    public static int [][] randomJagged(){
        int [][] array = new int[5][];
        int[]array1=new int [5];
        array1=fillArray(array1);
        int[]array2=new int [8];
        array2=fillArray(array2);
        int[]array3=new int [11];
        array3=fillArray(array3);
        int[]array4=new int [14];
        array4=fillArray(array4);
        int[]array5=new int [17];
        array5=fillArray(array5);
        array[0]=array1;
        array[1]=array2;
        array[2]=array3;
        array[3]=array4;
        array[4]=array5;
        return array;
    }
    
    public static int [] fillArray(int[]array){
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*39);
        }
        return array;
    }
    
    public static void printArray(int[]array){
        System.out.print("[ ");
        for(int i=0; i<array.length; i++){
            if(i==array.length-1){
                System.out.print(array[i]);
            }
            else{
            System.out.print(array[i]+", ");}
            
        }
        System.out.print(" ]");
    }
    
    public static int[][]filler(int[][]array){
        int[][]filled=new int [17][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<17; j++){
                filled[j][i]=0;
            }
        }
        for(int k=0; k<5; k++){
            for(int a=0; a<k*3+5; a++){
                filled[a][k]=array[k][a];
            }
        }
        return filled;
    }
    public static void print2DMatrix(int[][]array){ //Method to print a 2D matrix
        for(int i=0; i<array[0].length; i++){ //loop from 0 to the height of the matrix
            for(int j=0; j<array.length; j++){//loop from 0 to the width of the matrix
                System.out.print(array[j][i]+" ");//Print the value of the current selected space
            }
            System.out.println(" ");//Print a space once a column is printed
        }
    }
}