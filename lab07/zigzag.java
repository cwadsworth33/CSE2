public class zigzag{
    public static void main(String[] args){
        int nStars=10;
        String star = "*";
        for(int i=0; i<nStars; i++){
            System.out.println("");
            for(int j=0; j<i; j++){
            System.out.print(star);}
        }
    }
}