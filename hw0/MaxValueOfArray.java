/**
 * create a function with the signature public static int max(int[] m)
 * returns the maximum value of an int array
 * assume that all the numbers are >= 0
 */
public class MaxValueOfArray {
    public static int max(int[] m){
        int maxNumber = m[0];
        int index = 1;
        while (index < m.length){
            if (maxNumber < m[index]){
                maxNumber = m[index];
            }
            ++index;
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.print(max(numbers));
    }
}
