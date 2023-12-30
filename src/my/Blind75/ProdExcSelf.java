package Blind75;

import java.util.Arrays;
import java.util.Scanner;

public class ProdExcSelf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[4];
        int i =0;
        while (input.hasNextInt() && i < arr.length ) {
            arr[i] = input.nextInt();
            i++;
        }
        input.close();
        
        arr = prod(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] prod(int[] arr) {
    //Step 1 create a prefix array

        int[] prefix = new int[arr.length];
        prefix[0] = 1; 
        for( int i=1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] * arr[i-1];
        }
        int suffix = 1;

        for(int i=arr.length-1; i>=0; i--) {
            prefix[i] = suffix * prefix[i];
            suffix = suffix*arr[i];
        }
        return prefix;
    
    }

    
}
