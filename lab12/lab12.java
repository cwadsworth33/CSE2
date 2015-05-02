public class lab12{
    public static void main(String [] args){
        
        int height =(int) (Math.random()*5)+1;
        int width = (int) (Math.random()*5)+1;
        int height2 =(int) (Math.random()*5)+1;
        int width2 = (int) (Math.random()*5)+1;
        System.out.print("Width: "+width);
        System.out.println("Height: "+height);
       int[][]matrix1=increasingMatrix(width,height,true);
       printMatrix(matrix1,true);
       System.out.println("");
      
      int[][]matrix2=increasingMatrix(height,width,false);
      //matrix2=translate(matrix2);
       printMatrix(matrix2,false);
       System.out.println("");
       int[][]matrix3=increasingMatrix(width2,height2,true);
       printMatrix(matrix3,true);
       System.out.println("");
       System.out.println("The sum of A and B is ");
       printMatrix(addMatrix(matrix1,matrix2,true,false),true);
       addMatrix(matrix1,matrix3,true,true);
       
       
       
    }
    
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int[][] array = new int[width][height];
        int a = 0;
        if(format){
           for(int i=0; i<width; i++){
               for(int j=0; j<height; j++){
                   a++;
                   array[i][j]=a;
               }
           } 
        }
        else{
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    a=1+width*j+i;
                    array[i][j]=a;
                }
            }
        }
        return array;
    }
    
    public static void printMatrix(int[][]array,boolean format){ //Method to print a matrix
        if(format==false){
           for(int i=0; i<array[0].length; i++){ //loop from 0 to the height of the matrix
            for(int j=0; j<array.length; j++){//loop from 0 to the width of the matrix
                System.out.print(array[j][i]+" ");//Print the value of the current selected space
            }
            System.out.println(" ");//Print a space once a column is printed
        }
    } 
        
        else{
        for(int i=0; i<array.length; i++){ //loop from 0 to the height of the matrix
            for(int j=0; j<array[0].length; j++){//loop from 0 to the width of the matrix
                System.out.print(array[i][j]+" ");//Print the value of the current selected space
            }
            System.out.println(" ");//Print a space once a column is printed
        }
        }
    }
    
    public static int [][] translate(int[][]array){
        int[][]translated = new int[array[0].length][array.length];
        for(int i=0; i<array[0].length; i++){
            translated[i]=vectorRowSelector(array, i);
        }
        return translated;
    }
    
    public static int[] vectorRowSelector(int[][] array1, int row){ //Method to select a row from a matrix
        int[] vector1 = new int[array1.length]; //initialize a one dimensional array with same length as input array
        for(int i=0; i<array1.length; i++){ //loop from 0 to number of columns of matrix
            vector1[i]=array1[i][row];//fill in one dimensional array with values of array in given row
        }
        return vector1;//return the row
    }
    
    public static int[][]addMatrix(int[][]array1,int[][]array2,boolean format1, boolean format2){
        if (!format1){
            array1=translate(array1);
        }
        if (!format2){
            array2=translate(array2);
        }
        int[][]add=new int[array1.length][array1[0].length];
        if(array1.length==array2.length&&array1[0].length==array2[0].length){
            for(int i=0; i<add.length; i++){
                for(int j=0; j<add[0].length; j++){
                    add[i][j]=array1[i][j]+array2[i][j];
                }
            }
        }
        else{
            System.out.println("The matrix addition is not possible ");
            for(int i=0; i<add[0].length; i++){
                for(int j=0; j<add.length; j++){
                    add[j][i]=0;
                }
            }
        }

        return add;
    }
    
    
}

