public class SpaceExploration{
    public static void main(String [] args){
        int year = (int)(2000+Math.random()*11); 
        switch(year){
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid.");
                break;
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid.");
                break;
            case 2003:
                System.out.println("2003: Largest infrared telescope released.");
                break;
            case 2005:
                System.out.println("2005: Spacecraft collides with comet.");
                break;
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet.");
                break;
            case 2008:
                System.out.println("2008: Kepler launched to study deep space.");
                break;
            case 2010:
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back.");
                break;
            default:
                System.out.println(year+" N/A");
        }
    }
}