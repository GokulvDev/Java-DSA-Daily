package StringPackage;

import java.util.Arrays;

public class MoveZeroEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,4,6,3,0,0,8};

        System.out.println(Arrays.toString(brute(arr)));

        System.out.println(Arrays.toString(optimal(arr)));


    }

    public static int[] brute(int[] arr){
        int idx = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[idx++] = arr[i];
            }
        }

        while(idx != arr.length){
            arr[idx++] = 0;
        }

        return arr;

    }

    public static int[] optimal(int[] arr){

        int start = 0;
        int end = 0;

        while(end<arr.length){
            if(arr[end] != 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end++;
            }else{
                end++;
            }
        }

        return arr;
    }

}

