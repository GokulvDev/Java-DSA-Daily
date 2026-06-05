import java.util.Arrays;

public class SortingAlgo {
    public static void main(String[] args) {
        int[] arr = {7,4,3,2,5,1,6};

//      System.out.println(Arrays.toString(selectionSort(arr)));
//      System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr)));

    }

    private static int[] selectionSort(int[] arr){

        for(int i = 0;i<arr.length;i++){
            int minIdx = i;
            for(int j = i + 1;j<arr.length;j++){
                if(arr[j]<arr[minIdx])
                    minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }

    private static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<n-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] insertionSort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
}
