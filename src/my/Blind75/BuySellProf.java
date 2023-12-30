package Blind75;

public class BuySellProf {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println("Max profit is "+ prof(arr));
    }
    
    public static int prof(int arr[]) {

        int left = 0;
        //int right = 1;
        int prof =0;

        for(int right=1; right< arr.length; right++) {
            if(arr[left] < arr[right] ) {
                prof = Math.max(prof, arr[right]-arr[left]);
            } else {
                left = right;
            }
        }
        return prof;
    }
}
