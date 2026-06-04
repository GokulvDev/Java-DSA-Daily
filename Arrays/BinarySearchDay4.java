public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,16,23,38};
        int target = 16;

        System.out.println(linearSearch(arr,target));

        System.out.println(binarySearch(arr,target));

    }

    private static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
       return -1;
    }

    // TC - O(N)
    // Linear Search
    private static int linearSearch(int[] arr,int target){

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }

        return -1;
    }
}
