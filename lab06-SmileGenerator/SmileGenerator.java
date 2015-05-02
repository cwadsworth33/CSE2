public class SmileGenerator{
	public static void main(String[] args){ //main method
    String smile = ":)"; //initialize string smile
    
    for(int x=0; x<5; x++){ //first for loop prints five smileys
        System.out.print(smile);}
    System.out.println("");

    int c = 0;
    while(c<5){ //while loop prints five smileys
        System.out.print(smile);
        c++;
        
}
System.out.println("");
    int a = 0;
    do {   //do while prints five smileys
        System.out.print(smile);
        a++;
    }while(a<5);
    System.out.println("");
    
    int random = (int)(Math.random()*100);
    System.out.println(random);
    for(int i=1; i<=random; i++){
        
        if(i==30||i==60||i==90){
            System.out.println(smile);
        }
        else{
           System.out.print(smile); 
        }
    }
    System.out.println("");
    
    for(int j=0; j<4; j++){
        if(j==0){System.out.println(smile);
    }
        else if(j==1){
            System.out.println(smile+smile);
        }
        else if(j==2){
            System.out.println(smile+smile+smile);
        }
        else{
            System.out.println(smile+smile+smile+smile);
        }
    

}
}
}