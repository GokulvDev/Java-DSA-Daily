package StringPackage;

import java.util.HashMap;

public class LongestSubstring {

    // brute Force
    private static int longestSub(String str) {
        int maxLen = 0;

        for(int i = 0;i<str.length();i++){
            int[] hash = new int[256];
            for(int j = i;j<str.length();j++){
                if(hash[str.charAt(j)] == 1)
                    break;
                int len = j - i + 1;
                maxLen = Math.max(maxLen,len);
                hash[str.charAt(j)] = 1;
            }
        }
        return maxLen;
    }

    // Sliding Window Pattern
    public static int longestSubStrLen(String s){
        int maxLen = 0;
        int l = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int r = 0;r<s.length();r++){
            char ch = s.charAt(r);

            if(map.containsKey(ch)){
                l = Math.max(l,map.get(ch)+1);
            }

            map.put(ch,r);

            int len = r - l + 1;
            maxLen = Math.max(maxLen,len);

         }
        return maxLen;
    }

    public static int longestFreq(String s){


        int longestSubStringLen = 0;

        for(int i = 0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j = i;j < s.length();j++){
                if(freq[s.charAt(j) - 'a'] == 1){
                    break;
                }
                freq[s.charAt(j) - 'a']++;
                int len =  j - i + 1;
                longestSubStringLen = Math.max(len,longestSubStringLen);
            }
        }

        return longestSubStringLen;

    }



    public static void main(String[] args) {
        String str = "aababcdebbe";

        System.out.println(longestSub(str));
        System.out.println(longestSubStrLen(str));
        System.out.println(longestFreq(str));

    }


}
