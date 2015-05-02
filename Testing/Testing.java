public class Testing{
    public static void main(String [] args){
        //double [][][] random= randomMatrix(2,2,2);
        //double[][]leedle= random[1];
       // double[][]fish=random[0];
      //  printMatrix(leedle);
    //    System.out.println(" ");
  //      printMatrix(fish);
  double []random = new double[5];
  random[0]=5;
  random[1]=7;
  random[2]=1;
  random[3]=2;
  random[4]=8;
  double [] h=insertionSort(random);
  for(int i=0; i<5; i++){
    System.out.println(h[i]);  
  }
  
        
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
    
    public static void printMatrix(double[][]array){ //Method to print a matrix
        for(int i=0; i<array[0].length; i++){ //loop from 0 to the height of the matrix
            for(int j=0; j<array.length; j++){//loop from 0 to the width of the matrix
                System.out.print(array[j][i]+" ");//Print the value of the current selected space
            }
            System.out.println(" ");//Print a space once a column is printed
        }
    }
    
    public static double[] insertionSort(double array[]){
        int n = array.length;
        for(int i = 1; i<2; i++){
            double temp = array[i];
            int j=i-1;
            while((j>-1&&(array[j]>temp))){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
        double[] h=array;
        return h;
    }
    
    
}