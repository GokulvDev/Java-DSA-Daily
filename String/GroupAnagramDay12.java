import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {

        String[] str = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(str));

    }

        public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> ans = new HashMap<>();

            for (String s : strs) {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                if (!ans.containsKey(key)) {
                    ans.put(key, new ArrayList<>());
                }
                ans.get(key).add(s);
            }

            return new ArrayList<>(ans.values());
        }

}
