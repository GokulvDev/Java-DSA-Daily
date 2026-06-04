public class EquilibiriumPoint {
    public static void main(String[] args) {
//        int[] arr = {1,3,5,2,2};

          int[] arr = {-7,1,5,2,-4,3,0};

        System.out.println(brute(arr));
        System.out.println(findEquilibirium(arr));

    }

    // brute
    // TC O(N2)
    private static int brute(int[] arr){

        for(int i = 0;i<arr.length;i++){
            int leftSum = 0;
            for(int j = 0;j<i;j++){
                leftSum += arr[i];
            }

            int rightSum = 0;
            for(int j = i +1;j<arr.length;j++){
                rightSum += arr[i];
            }
            if(leftSum == rightSum)
                return i;
        }

        return -1;
    }

  // Optimized O(N)
    private static int findEquilibirium(int[] arr){

        int rightSum = 0;
        for(int i : arr){
            rightSum += i;
        }

        int leftSum = 0;

        for(int i = 0;i<arr.length;i++){

           if(leftSum == (rightSum -= arr[i]))
               return i;

           leftSum += arr[i];

        }

        return -1;
    }

}
