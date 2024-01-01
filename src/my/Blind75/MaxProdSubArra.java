package my.Blind75;

public class MaxProdSubArra {

    public static void main(String[] args) {
        //int arr[] = {1,2,3,4};
        int arr[] = {-1,-2,-3,-4,-5};
        int max = maxProd(arr);
        System.out.println("MAX PROD = "+max);

    }

    static int maxProd(int[] arr) {
        int min = 1;
        int max = 1;
        int ans = arr[0];
        
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] == 0) {
            min = 1;
            max = 1;
            ans = Math.max(ans, arr[i]);
            continue;
        }
            int temp = min;
            min = Math.min(arr[i], Math.min(min*arr[i], max*arr[i]));
            max = Math.max(arr[i], Math.max(temp*arr[i], max*arr[i]));
            ans = Math.max(ans, max);
        }
        return ans;
    }
    
}
