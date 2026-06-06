import java.util.HashMap;

public class Majority {
    public static void main(String[] args) {
        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};

//        System.out.println(brute(arr));
//        System.out.println(better(arr));

          System.out.println(boyerMooreVoting(arr));

    }


  // TC - O(N2) SC - O(1)
    private static int brute(int[] arr){

        int n = arr.length;

        for(int i = 0;i<arr.length;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[j] == arr[i])
                    count++;
            }
            if(count > n/2){
                return arr[i];
            }
        }

        return -1;
    }

  // TC - O(N) SC - O(N)
    private static int better(int[] arr){

        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i]) > n/2)
                return arr[i];
        }

        return -1;
    }

    // TC - O(N) SC - O(1)
    private static int boyerMooreVoting(int[] arr){
        int el = arr[0];
        int count = 0;

        int n = arr.length;

        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                el = arr[i];
                count = 1;
            }else if(el == arr[i]){
                count++;
            }else{
                count--;
            }
        }

        count = 0;
        for(int i = 0;i<arr.length;i++){
            if(el == arr[i]){
                count++;
            }
        }

        return count > n/2 ? el : -1 ;
    }

}
