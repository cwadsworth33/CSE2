//Christian Wadsworth
//CSE 002 
//Homework 13
//5/1/15

import java.util.Scanner;
import java.util.Arrays;
public class hw13{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.println("Enter a lower bound for the dimensions of the subArrays");
        int x= myScanner.nextInt();
        System.out.println("Enter an upper bound for the dimensions of the subArrays");
        int y= myScanner.nextInt();
        int [][] dimensions = randomizeDimension(x,y);
        double [][][]SubArray1=randomMatrix(dimensions[0][0],dimensions[0][1],dimensions[0][2]);
        double [][][]SubArray2=randomMatrix(dimensions[1][0],dimensions[1][1],dimensions[1][2]);
        double [][][]SubArray3=randomMatrix(dimensions[2][0],dimensions[2][1],dimensions[2][2]);
        double[][][][] jaggedArray = new double[3][][][];
        jaggedArray[0]=SubArray1;
        jaggedArray[1]=SubArray2;
        jaggedArray[2]=SubArray3;
        print4DMatrix(jaggedArray);
        print2DMatrix(dimensions);
        statArray(jaggedArray,dimensions);
        sort4DArray(dimensions,jaggedArray);
        print4DMatrix(jaggedArray);
        ///////////////////////////////////////////////////////
        vectorSelector(SubArray1,dimensions,0,0,0);
    }

   public static double [][][] randomMatrix(int x,int y,int z){//Method to create random matrix
        double [][][] array= new double [x][y][z]; //create new array with given dimensions
        for(int i =0; i<x; i++){ //loop to assign column 
            for(int j=0; j<y; j++){//loop to assign row
                for(int k=0; k<z; k++){
                    array[i][j][k]=(Math.random()*30);//fill array slot with random number from -10 to 10
                }
            }
        }
        return array;//return the array
    }
    
      public static void print2DMatrix(double[][]array){ //Method to print a 2D matrix
        for(int i=0; i<array[0].length; i++){ //loop from 0 to the height of the matrix
            for(int j=0; j<array.length; j++){//loop from 0 to the width of the matrix
                System.out.print(array[j][i]+" ");//Print the value of the current selected space
            }
            System.out.println(" ");//Print a space once a column is printed
        }
    }
    
    public static void print2DMatrix(int[][]array){ //Method to print a 2D matrix
        for(int i=0; i<array[0].length; i++){ //loop from 0 to the height of the matrix
            for(int j=0; j<array.length; j++){//loop from 0 to the width of the matrix
                System.out.print(array[j][i]+" ");//Print the value of the current selected space
            }
            System.out.println(" ");//Print a space once a column is printed
        }
    }
    
    public static void print3DMatrix(double[][][]array){ //Method to print a 3D matrix
        double[][]leedle= array[0];//initialize a 2 dimensional array to be a layer of the input 3D array
        System.out.println("{ ");//Formating bracket
        for(int i=0; i<array.length; i++){ //loop from 0 to the length of the array
            System.out.println("{ "); //format bracket
            leedle = array[i]; //reassign the 2D array to a different layer every iteration
            print2DMatrix(leedle); //print the 2D array
            System.out.print("  }"); //format bracket
            System.out.println(""); //format space
        }
        System.out.print("  }"); //Final format bracket
        
    }
    
    public static int[][] randomizeDimension(int x,int y){ //method to randomize the dimensions of the subarrays
        int [][] dimensions = new int [3][3]; //initialize matrix dimensions to be 3x3. This matrix will encode
        //all of the data for the sizes of the subArrays
        for(int i=0; i<3; i++){ //loop from 0 to 3
            for(int j=0; j<3; j++){ //loop from 0 to 3
                dimensions[i][j]= (int)((Math.random()*y)+x); //fill selected array slot with random number from the upper
                //bound to the lower bound from the user
        
            }
        }
        return dimensions; //return two dimensional array dimensions
    }
    
    public static void statArray(double[][][][]array, int [][]dimensions){
        double sum = 0; //initialize counter sum
        int c = 0; //initialize counter c
        for(int i=0; i<3; i++){ //loop from 0 to 3 (number of 3D arrays)
            for(int j=0; j<dimensions[i][0]; j++){ //loop from 0 to z values
                for(int k=0; k<dimensions[i][1]; k++){ //loop from 0 to y values
                    for(int a=0; a<dimensions[i][2]; a++){ //loop from 0 to x values
                        sum = sum+array[i][j][k][a]; //add value to sum
                        c++; //increment c to find the number of array elements
                    }
                }
            }
        }
        double mean = sum / c ; //print statistics
        System.out.println("The sum of all of the elements in the array is "+sum);
        System.out.println("There are "+c+" elements in the array");
        System.out.println("The mean is "+mean);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public static double[]vectorSelector(double[][][]array,int[][]dimensions, int x, int z,int d){ //selects 
        double[]vector=new double[dimensions[d][1]];
        for(int i=0; i<dimensions[d][1]; i++){
            vector[i]=array[x][i][z];
            System.out.println(vector[i]);
        }
         return vector;
   }
   
   public static void sort4DArray(int[][]dimensions,double[][][][]jaggedArray){
       double[][][]SubArray1=jaggedArray[0];
       double[][][]SubArray2=jaggedArray[1];
       double[][][]SubArray3=jaggedArray[2];
       double size1 = dimensions[0][0]*dimensions[0][1]*dimensions[0][2];
       double size2 = dimensions[1][0]*dimensions[1][1]*dimensions[1][2];
       double size3 = dimensions[2][0]*dimensions[2][1]*dimensions[2][2];
       double[]array=new double[3];
       array[0]=size1;
       array[1]=size2;
       array[2]=size3;
       Arrays.sort(array);
       if(size1==array[0]){
           jaggedArray[0]=SubArray1;
       }
       else if(size2==array[0]){
           jaggedArray[0]=SubArray2;
       }
       else{
           jaggedArray[0]=SubArray3;
       }
       
       if(size1==array[1]){
           jaggedArray[1]=SubArray1;
       }
       else if(size2==array[1]){
           jaggedArray[1]=SubArray2;
       }
       else{
           jaggedArray[1]=SubArray3;
       }
       
       if(size1==array[2]){
           jaggedArray[2]=SubArray1;
       }
       else if(size2==array[2]){
           jaggedArray[2]=SubArray2;
       }
       else{
           jaggedArray[2]=SubArray3;
       }
       
   }
   
   public static void print4DMatrix(double[][][][]jaggedArray){
       double[][][]SubArray1=jaggedArray[0];
       double[][][]SubArray2=jaggedArray[1];
       double[][][]SubArray3=jaggedArray[2];
       System.out.println("{");
        print3DMatrix(SubArray1);
        System.out.println("  ");
        System.out.println("  ");
        print3DMatrix(SubArray2);
        System.out.println("  ");
        System.out.println("  ");
        print3DMatrix(SubArray3);
        System.out.println("  }");
   }

}