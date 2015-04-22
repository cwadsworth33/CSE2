//Christian Wadsworth
//CSE 002
//Homework 12- Matrix Multiplication


import java.util.Scanner; //Import Scanner

public class Multiply{ //create class
    public static void main(String [] args){ //main method
        Scanner myScanner; //Create new scanner
        myScanner = new Scanner(System.in);
        int c = 0; //initialize variable c; condition variable
        while(c==0){ //while loop to make sure the given matrix dimensions are valid
            System.out.println("Please enter the width of array 1."); //prompt user
            int width1 = myScanner.nextInt(); //width dimension for matrix 1 from user
            System.out.println("Please enter the height of array 1."); //prompt user
            int height1 = myScanner.nextInt();//height dimension for matrix 1 from user
            if(height1 <=0 || width1 <=0){ //if an input is negative or 0, print error message
            //and go back to beginning of while loop
                System.out.println("Dimension of matrix cannot be negative.");
                continue;
            }
            int[][] array1 = new int[width1][height1];
            array1=randomMatrix(width1,height1);//create matrix 1 as array with
            //input dimensions
            System.out.println("The first matrix is:");
            printMatrix(array1);//call print matrix method of array 1
            System.out.println("Please enter the width of array 2.");//prompt user for width of array 2
            int width2 = myScanner.nextInt();//width of array 2 initialized as scanner input
            System.out.println("Please enter the height of array 2.");//prompt user for height of array 2
            int height2 = myScanner.nextInt();//height of array 2 initialized as scanner input
            if(height2 <=0 || width2 <=0){ //if an input is negative or 0, print error message
            //and go back to beginning of while loop
                System.out.println("Dimension of matrix cannot be negative.");
                continue;
            }
            int[][] array2 = randomMatrix(width2,height2);//create matrix 2 as array with
            //input dimensions
            System.out.println("The second matrix is:"); 
            printMatrix(array2);//call print matrix method of array 2
            if(height1==width2){ //condition for matrix multiplication to be valid
                int[][] product = matrixMultiply(array1,array2);//call matrix multiplication method and multiply the 2 matrices
                c=1;//reassign variable c as 1 to break loop
                System.out.println("The product of the two matrices in the given order is:");
                printMatrix(product);//Print calculated matrix
            }
            else{ //condition for matrix multiplication to be not valid
                System.out.println("Matrix multiplication not possible try again.");//Error statement
            }
        }
        
        
    }
    
    public static int [][] randomMatrix(int width,int height){//Method to create random matrix
        int [][] array= new int [width][height]; //create new array with given dimensions
        for(int i =0; i<width; i++){ //loop to assign column 
            for(int j=0; j<height; j++){//loop to assign row
                array[i][j]=(int)(Math.random()*20 - 10);//fill array slot with random number from -10 to 10
            }
        }
        return array;//return the array
    }
    
    public static void printMatrix(int[][]array){ //Method to print a matrix
        for(int i=0; i<array[0].length; i++){ //loop from 0 to the height of the matrix
            for(int j=0; j<array.length; j++){//loop from 0 to the width of the matrix
                System.out.print(array[j][i]+" ");//Print the value of the current selected space
            }
            System.out.println(" ");//Print a space once a column is printed
        }
    }
    
    public static int[][] matrixMultiply(int[][]array1,int[][]array2){ //Method to multiply two matrices
        int[][]multiply=new int[array1[0].length][array2.length];//initialize matrix multiply to be the length of
        //array1 by the width of array 2
        for(int i=0; i<array1[0].length; i++){//loop from 0 to the length of array 1, and therefore length of new matrix
            for(int j=0; j<array2.length; j++){//loop from 0 to the height of array 2, and therefore height of new matrix
                multiply[i][j]=dotProduct(vectorRowSelector(array1,j),vectorColumnSelector(array2,i));
            }
        }
        return multiply; //return result of matrix multiplication
    }
    
    public static int[] vectorRowSelector(int[][] array1, int row){ //Method to select a row from a matrix
        int[] vector1 = new int[array1.length]; //initialize a one dimensional array with same length as input array
        for(int i=0; i<array1.length; i++){ //loop from 0 to number of columns of matrix
            vector1[i]=array1[i][row];//fill in one dimensional array with values of array in given row
        }
        return vector1;//return the row
    }
    
    public static int[] vectorColumnSelector(int[][] array, int column){//Method to select a column from a matrix
        int[] vector = new int[array[0].length];//initialize a one dimensional array with same height as input array
        for(int i=0; i<array[0].length; i++){ //loop from 0 to number of rows of matrix
            vector[i]=array[column][i]; //fill in one dimensional array with values of array in given column
        }
        return vector; //return the column
    }
    
    public static int dotProduct(int[] vector1,int[]vector2){//Method that finds the dot product between two vectors
        int product = 0; //initialize variable product as 0
        int sum = 0; //initialize variable sum as 0
        for(int i=0; i<vector1.length;i++){ //loop from 0 to the length of the vectors
        //it is not necessary for this program to check to see if the two vectors are in the same dimension
        //because it is assumed that those vector combinations will have been filtered out in the main method
            product = vector1[i]*vector2[i];//multiplies the cooresponding slots of both vectors together
            sum = sum+ product;//adds together all of the products to get the value of the dot product
        }
        return sum;//return the value of the dot product
        
    }
    
}