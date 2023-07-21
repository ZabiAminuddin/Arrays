package my.arrays;

public class MaxProfit {

    public static void main(String[] str) {
        int[] arr = {7,1,5,3,6,4};
        int minSoFar = Integer.MAX_VALUE;
        int profit;
        int max=0;

        for (int i = 0; i<arr.length;i++) {
            minSoFar = Math.min(minSoFar,arr[i]);
            profit = arr[i]-minSoFar;
            max = Math.max(max,profit);
        }
        System.out.println("MAX PROFIT = "+max);
    }
}
