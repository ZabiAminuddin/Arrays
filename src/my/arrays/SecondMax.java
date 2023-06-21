package my.arrays;

public class SecondMax {
    public static void main(String[] str) {
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int arr[] = {1,4,7,3,5,2,8,5,6};
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }

        }
        System.out.println(" Second Max = " + secondMax );
    }
}
