package my.arrays;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] str) {
       // int[] arr = {0,1,2,3,4,5,6,3};
        int[] arr = {1,2,4,5};

        int i = 0;
        int j = arr.length-1;
        int target=6;
        int sum =0;
        Arrays.sort(arr);
        while(i<j) {
            sum = arr[i] + arr[j];
            if(sum > target) {
                j--;
            } else if(sum < target) {
                i++;
            } else {
                System.out.println(arr[i] +" "+arr[j]);
                j--;
                i++;
            }
        }

    }
}
