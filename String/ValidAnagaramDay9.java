import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

//        System.out.println(isValidBrute(s,t));
//        System.out.println(isValidOptimal(s,t));
        System.out.println(isValid(s,t));


    }

    private static boolean isValidBrute(String s,String t){

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);
    }

    private static boolean isValidOptimal(String s,String t){

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }

        for(var pair : map.entrySet()){
            if(pair.getValue() != 0){
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(String s,String t){
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            freq[c - 'a']--;
        }

        for(int i = 0;i<freq.length;i++){
            if(freq[i] != 0)
                return false;
        }

       return true;

    }
}
