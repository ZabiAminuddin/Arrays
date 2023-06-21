package my.arrays;

public class SumOfArray {
    public static void main(String[] str) {
        int[] arr = {1, 5 ,7 ,3, 4};
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum= arr[i] + sum;
        }
        System.out.println("Sum is "+sum);
    }
}
