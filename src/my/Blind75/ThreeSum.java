package my.Blind75;
import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {
        int arr[] = {-2,-2,-1,-1,-1,0,0,0,2,2,2};
        int target =0;
        int[] ans = getTriplet(arr, target);
    }

    static int[] getTriplet(int[] arr, int target) {
        int[] x = {};
        Arrays.sort(arr);
        int l=0;
        int r =0;

        for(int i=0; i< arr.length-3; i++) {

            if(i==0 || arr[i] != arr[i-1] ) {
                l = i+1;
                r = arr.length-1;
                int temp = 0-arr[i];
                while(l<r) {
                    
                    if(temp == (arr[l] + arr[r])) {
                        System.out.println(arr[i]+" "+ arr[l] +" " +arr[r]);
                
                        while(l < arr.length-1 && arr[l] == arr[l+1]) l++;
                        while (r > 0 && arr[r] == arr[r-1]) r--;
                        l++;
                        r--;
                    
                }  else if(arr[l] + arr[r] < temp ) {
                    l++;
                    
                } else {
                    r--;
                }
                
            }
            }
           
        }
        return x;
    }
    
}
