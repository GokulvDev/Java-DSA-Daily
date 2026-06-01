import java.util.HashMap;

public class FindFirstNonRepeating {

    // Brute Force
    static char firstNonRepeating(String str) {
       for(int i = 0;i<str.length();i++){
           boolean found = true;
           for(int j = 0;j<str.length();j++){
               if(i!=j && str.charAt(i) == str.charAt(j)){
                   found = false;
                   break;
               }
           }
           if(found){
               return str.charAt(i);
           }
       }
       return '-';
    }

    public static char firstNonRepeatingOptimal(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        // Iterate string to maintain order
        for(int i = 0;i<str.length();i++){
            if(map.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }

     return '-';
    }

    public static void main(String[] args) {
        String str = "aabccbd";

        System.out.println(firstNonRepeating(str));
        System.out.println((firstNonRepeatingOptimal(str)));
    }
}
