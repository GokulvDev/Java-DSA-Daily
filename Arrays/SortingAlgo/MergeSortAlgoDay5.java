import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] arr = {3,9,1,7,8,6,5,2,4};

        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    private static int[] mergeSort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left,int[] right){
        int[] mergedArr = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        int n1 = left.length;
        int n2 = right.length;

        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                mergedArr[k++] = left[i++];
            }else{
                mergedArr[k++] = right[j++];
            }
        }

        while(i<n1){
            mergedArr[k++] = left[i++];
        }

        while(j<n2){
            mergedArr[k++] = right[j++];
        }

        return mergedArr;
    }

}
