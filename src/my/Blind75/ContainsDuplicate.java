package Blind75;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};

        int max = Math.max(arr.length, Arrays.stream(arr).max().getAsInt());
        System.out.println("Is duplicate array ? "+isDuplicatearr(arr, max));
        
        System.out.println("Max of array " + Arrays.stream(arr).max().getAsInt());
        
        int[] a = Arrays.stream(arr).distinct().toArray();
           if(a.length < arr.length) {
            System.out.println("True");
           } else {
             System.out.println("False");
           }

    }

    public static boolean isDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for (int i =0; i< arr.length; i++) {
            if(!set.add(arr[i])) {
                return true;
            }
        }
        return false;
    }


    //ANother way

    public static boolean isDuplicatearr(int arr[], int max) {
        boolean[] newarr = new boolean[max+1];

        for( int i=0; i<arr.length; i++) {

            if(!newarr[arr[i]]) {
                newarr[i] = true;
            } else {
                return true;
            }
        }

        return false;
    }
    
}
