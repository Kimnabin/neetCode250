import java.util.Arrays;
import java.util.HashMap;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) return false;

        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if(!count.containsKey(c)) {
                return false; // Character in t not found in s
            }
            count.put(c, count.get(c) - 1);
            if (count.get(c) < 0) {
                return false; // More occurrences in t than in s
            }
        }
        return true; // All counts matched
    }

    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // Assuming only lowercase letters a-z

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false; // More occurrences in t than in s
            }
        }
        return true; // All counts matched
    }

}
