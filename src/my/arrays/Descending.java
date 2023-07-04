package my.arrays;

public class Descending {
    public static void main(String[] str) {
        int[] arr = {8,7,6,5,4,3,2,1};

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] < arr[i+1]) {
                System.out.println("Array is not Descending");
                return;
            }
        }
        System.out.println("Array is Descending");
    }
}
