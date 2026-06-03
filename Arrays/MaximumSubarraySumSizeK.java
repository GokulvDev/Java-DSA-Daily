public class MaxSubSumK {
    public static void main(String[] args) {
        int[] arr = {100,300,200,400};
        int k = 3;

        System.out.println(brute(arr,k));
        System.out.println(optimal(arr,k));


    }

    private static int brute(int[] arr,int k){
        int maxSum = 0;

         for(int i = 0;i<=arr.length-k;i++){
             int sum = 0;
             for(int j = i;j< i + k;j++){
                 sum += arr[j];
             }
             maxSum = Math.max(sum,maxSum);
         }

        return maxSum;
    }

    private static int optimal(int[] arr,int k){
        int maxSum = 0;
        int curSum = 0;

        for(int i = 0;i<k;i++){
            curSum += arr[i];
        }

        maxSum = curSum;

        for(int i = k;i<arr.length;i++){
            curSum += arr[i] - arr[i-k];
            maxSum = Math.max(curSum,maxSum);
        }

        return maxSum;
    }

}
