public class MaximumSubSum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxBrute(arr));
        System.out.println(maxOptimal(arr));

    }

    private static int maxOptimal(int[] arr) {
        int maxSum = 0;
        int curSum = 0;

        for(int i = 0;i<arr.length;i++){
            curSum += arr[i];
            if(curSum > maxSum){
                maxSum = curSum;
            }else if(curSum < 0){
                curSum = 0;
            }
        }

        return maxSum;
    }

    public static int maxBrute(int[] arr){
        int maxSum = 0;

        for(int i = 0;i<arr.length;i++){
            int curSum = arr[i];
            for(int j = i+1;j<arr.length;j++){
                curSum += arr[j];
                if(curSum>maxSum){
                    maxSum = curSum;
                }
            }
        }

        return maxSum;
    }

}
