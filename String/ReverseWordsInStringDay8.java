import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {

        String str = "Hello welcome to java world";

        String[] strArr = str.split("\\s");

        int start = 0;
        int end = strArr.length-1;

        while (start<end){
            String temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }

       StringBuilder rev = new StringBuilder();

        for(String s : strArr){
            rev.append(s).append(" ");
        }

        System.out.println(rev);

    }
}
