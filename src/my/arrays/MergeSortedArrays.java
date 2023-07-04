package my.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] arr3= new int[arr1.length + arr2.length];

        int i=0;
        int j=0;
        int k = 0;
        while( i< arr1.length && j <arr2.length) {
            if(arr1[i]< arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i<arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while( j< arr2.length) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
       for (int x =0; x<arr3.length; x++) {
           System.out.println(arr3[x]);
       }
        withOutSpace(arr1,arr2);
    }


    public static void withOutSpace(int[] arr1, int[] arr2) {
        int i=arr1.length-1;
        int j=0 ;

        while (i>0 && j<arr2.length) {
            if(arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            } else if(arr1[i] < arr2[j]) {
                i--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("SORTED");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
