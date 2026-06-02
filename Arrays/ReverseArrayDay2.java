import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

//        System.out.println(Arrays.toString(brute(arr)));

        System.out.println(Arrays.toString(optimized(arr)));


    }

    public static int[] brute(int[] arr){

        int[] temp = new int[arr.length];
        int idx = 0;
        int n = arr.length;

        for(int i = n-1;i>=0;i--){
            temp[idx++] = arr[i];
        }

        for(int i = 0;i<temp.length;i++){
            arr[i] = temp[i];
        }

        return arr;

    }

    public static int[] optimized(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        return arr;

    }

}
