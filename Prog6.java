public class Prog6 {
    public static int main(String[] args) {
         static int[] min(int[] arrayOfInts ){

            int minValue = arrayOfInts[0];
            for (int i = 1; i < arrayOfInts.length; i++) {
                if (arrayOfInts[i] < minValue) {
                    minValue = arrayOfInts[i];
                }

            }
              return minValue;
        }
    }
}
