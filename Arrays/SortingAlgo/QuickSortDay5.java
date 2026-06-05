import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,4,1,6};
        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int part = partition(arr,low,high);
            quickSort(arr,low,part-1);
            quickSort(arr,part+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i<j){
            while (arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j > low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }

}
