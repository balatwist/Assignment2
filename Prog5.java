import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[]a={5,6,-4,31,1};
        int[]b={3,8,9,11};
        int[]com=new int[9];
        System.arraycopy(a,0,com,0,5);
        System.out.println(Arrays.toString(com));
        System.arraycopy(b,0,com,5,4);
        System.out.println("COMBINED ARRAY = "+Arrays.toString(com));
    }



}
