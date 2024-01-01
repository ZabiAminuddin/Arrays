package my.Blind75;

import java.util.Scanner;

public class SearchRotSort {

    public static void main(String[] args) {
        int[] arr = {5,6,7,0,1,2,3,4};
        int ind = getIndex(arr);
        System.out.println("Index = "+ind);
    }

    static int getIndex(int arr[]) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        input.close();
        if(arr.length == 0 && arr[0] == target) return 0;

        int left = 0;
        int right = arr.length -1;

        while(left <= right) {
            int mid = left + (right-left)/2;
            if(arr[mid] == target) return mid;
            if(arr[left] == target) return left;
            if(arr[right] == target) return right;
            if(arr[left] < arr[mid]) {
                if( arr[left] < target && target < arr[mid]) right = mid-1;
                else left = mid + 1;
            }
            else {
                if(arr[right] > target && target > arr[mid])
                    left = mid+1;
                else 
                    right = mid-1;
            }

        }
        return -1;
    }
    
}
