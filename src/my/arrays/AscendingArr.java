package my.arrays;

public class AscendingArr {
    public static void main(String[] str) {
        int[] arr = {1,2,3,5,6,7,8};

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is  sorted");
    }
}
