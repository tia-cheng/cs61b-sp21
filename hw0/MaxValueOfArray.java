/**
 * create a function with the signature public static int max(int[] m)
 * returns the maximum value of an int array
 * assume that all the numbers are >= 0
 * {@code @TODO} how to print an array?
 * This version use for loop instead of while
 */
public class MaxValueOfArray {
    public static int forMax(int[] m){
        int maxNumber = m[0];
        int i;
        for (i = 1; i < m.length; ++i){
            if (maxNumber < m[i]){
                maxNumber = m[i];
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.print("The Max value is "+  forMax(numbers));
    }
}
