package my.arrays;

public class Kadanes {

    public static void main(String[] str) {
       // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
       // int[] arr = {-1,-2,-3,-4};
        int[] arr = {-1,-2,-3,0};
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++) {
            if(sum < 0) {
                sum =0;
            }
            sum = sum+arr[i];
            max = Math.max(max,sum);
        }
        System.out.println("MAX "+max);
    }
}
