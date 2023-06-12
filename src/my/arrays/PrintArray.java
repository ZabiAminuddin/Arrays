package my.arrays;

public class PrintArray {
    public static void main(String[] str) {

        int[] arr = {1,2,3,4,5};
        System.out.println("Array is printed below:");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
