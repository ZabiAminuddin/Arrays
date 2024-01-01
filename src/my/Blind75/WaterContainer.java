package my.Blind75;

public class WaterContainer {

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int max = maxVal(arr);
        System.out.println("Max = "+ max);
    }

    static int maxVal(int[] arr) {
        int max = 0;
        int min =0;
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            min = Math.min(arr[left], arr[right]);
            max = Math.max(max, (right-left)*min);
            if (arr[left] < arr[right]) {
                left++;
            } else right --;
        }
        return max;
    }
    
}
