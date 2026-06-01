package ArrayProblems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] brute(int[] arr,int target){

        for(int i =0;i<arr.length;i++){
            for(int j = i + 1;j<arr.length;j++){
                int sum = arr[i] + arr[j];
                if(sum == target)
                    return new int[]{i,j};
            }
        }

        return new int[]{-1,-1};
    }

    public static int[] optimized(int[] arr,int target){
        HashMap<Integer,Integer> pairs = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            int current = arr[i];
            int value = target - current;

            if(pairs.containsKey(value)){
                return new int[]{pairs.get(value),i};
            }

            pairs.put(arr[i],i);

        }

        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(brute(nums,target)));
        System.out.println(Arrays.toString(optimized(nums,target)));

    }
}
