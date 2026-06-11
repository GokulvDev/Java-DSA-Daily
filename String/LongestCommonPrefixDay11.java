import java.util.Arrays;

public class LongestCommonPrefix {

    public static String findLongest(String[] arr){

        Arrays.sort(arr);

        String s1 = arr[0];
        String s2 = arr[arr.length-1];
        int len = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
          len++;
        }

        return s1.substring(0,len);
    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};

        System.out.println(findLongest(arr));

    }
}
