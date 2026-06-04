import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {10,20,10,5,15};
        // Op = 10,30,40,45,15

        int[] prefixSum = findPrefixSum(arr);

        System.out.println(Arrays.toString(prefixSum));

    }

    private static int[] findPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }
}
