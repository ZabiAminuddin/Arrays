package my.arrays;

public class MinMaxArray {
    public static void main(String[] str) {
        int[] arr = {1, 5, 7, 3, 4, -4, 30};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}
