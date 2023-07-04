package my.arrays;

import java.util.Arrays;

public class ZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,3,0,4,0};
        int k=0;
        int i=0;
        while(i< arr.length) {
            if(arr[i] !=0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
                i++;
            } else {
                i++;
            }
        }
        System.out.println("Sorted "+ Arrays.toString(arr));
    }
}
