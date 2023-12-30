package Blind75;

import java.util.Arrays;
import java.util.HashMap;

//O(n^2)
public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,8,6,3,4};
        int target = 9;
        int[] o = twoSumMap(arr, target);
        System.out.println("Two index is "+ o[0] + " "+o[1]) ;
        

    }

    public static int[] twosums(int[] arr, int target){
        
    int[] ans = new int[2];
    for(int i=0; i< arr.length; i++) {
        for(int j=i+1; j< arr.length; j++) {
            if(arr[i] + arr[j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
        }
    }
    return ans;
    }

// want to return index use hashmap for optimal

public static int[] twoSumMap(int[] arr, int target) {
    int ans[] = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < arr.length; i++) {
        int comp = target - arr[i];
        if (map.containsKey(comp)) {
            ans[0] = i;
            ans[1] = map.get(comp);
            return ans;
        } else {
            map.put(arr[i],i);
        }
    }
    return ans;
}

//Solution using two pointers
/// optimal if we want to return numbers
    public static int[] twoSumPointers(int[] arr, int target) {
        Arrays.sort(arr);
        int[] ans = new int[2];

        int lef = 0;
        int rig = arr.length -1;

        while (lef < rig) {
            if (arr[lef] + arr[rig] == target) {
                ans[0] = arr[lef];
                ans[1] = arr[rig];
                return ans;
            } else if (arr[lef] + arr[rig] < target) {
                lef++;
            } else {
                rig--;
            }
         }

        return ans;
    }
    
}



