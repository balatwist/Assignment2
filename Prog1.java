
import java.util.*;

/**
 *  This class keeps hold of an instance of Random and guarantees
 *  that the same instance will be used over and over (so the cost
 *  of re-seeding the random number generator is avoided).
 *  Each time the getRandomInt() method is called, the next integer
 *  from this Random instance is returned.
 */
public class Prog1 {

    public static void main(String[] args){

        System.out.println("X Random Number : " + Math.random());

        RandomNumbers rn = new RandomNumbers();


        int x =rn.getRandomInt(1,9);
        double result= Math.pow(Math.PI,x);
        System.out.println("RESULTS FOR X = " +result);

        int y=rn.getRandomInt(3,14);
        System.out.println("RESULTS FOR Y = " +Math.pow(y,Math.PI));
    }
}
