package my.arrays;

public class MissingNumber {

    public static void main(String[] str) {
        int[] arr = {0,1};
        int[] newarr = new int[arr.length+1];

        for(int i=0; i<arr.length; i++) {
            newarr[arr[i]] =1;
        }
        for (int j=0; j<newarr.length;j++) {
            if (newarr[j]==0)
                System.out.println("missing number is "+j);
        }

        //Approach two is using formula n*n+1/2
    }
}
