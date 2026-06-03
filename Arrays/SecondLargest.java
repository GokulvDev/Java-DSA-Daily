import java.util.Arrays;

public class SecondLarge {
    public static void main(String[] args) {

        int[] arr = {2,4,1,8,7,9,6,10};

        System.out.println(brute(arr));

        System.out.println(optimalSecond(arr));

    }

    private static int optimalSecond(int[] arr) {
        int large = arr[0];
        int second = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>large){
                second = large;
                large = arr[i];
            }else if(arr[i] > second && arr[i] < large){
                second = arr[i];
            }
        }

        return second;
    }

    public static int brute(int[] arr){

        Arrays.sort(arr);

        return arr[arr.length-2];
    }
}
