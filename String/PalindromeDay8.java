import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        String s = "MADAM";
        
//        System.out.println(brute(s));
//        System.out.println(optimal(s));
          System.out.println(usingStreams(s));

    }

    private static boolean brute(String str){

        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev)){
            return true;
        }

        return false;
    }

    private static boolean optimal(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!= str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean usingStreams(String str){

        String rev = str.chars().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            java.util.Collections.reverse(list);
                            return String.join("", list);
                        }
                ));

        return str.equals(rev);
    }


}
