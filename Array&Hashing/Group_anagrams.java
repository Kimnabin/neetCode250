import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // check xem mang co null hay rong khong?
        if (strs == null || strs.length == 0) return new ArrayList<>();

        // Tạo một map để nhóm các anagram
        Map<String, List<String>> map = new HashMap<>();
        // Duyệt qua từng chuỗi trong mảng
        for (String s : strs) {
            char[] chars = s.toCharArray(); // Chuyển đổi chuỗi thành mảng ký tự
            Arrays.sort(chars);             // Sắp xếp mảng ký tự
            String key = new String(chars); // Tạo khóa từ mảng ký tự đã sắp xếp
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);    // Thêm chuỗi vào danh sách tương ứng với khóa
        }
        return new ArrayList<>(map.values());   // Trả về danh sách các nhóm anagra
    }

    public List<List<String>> groupAnagrams2(String[] strs) {

        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];  // Mảng đếm số lần xuất hiện của từng ký tự
            for (char c : s.toCharArray()) {
                count[c - 'a']++;       // Tăng số lần xuất hiện của ký tự c
            }
            String key = Arrays.toString(count);    // Tạo khóa từ mảng đếm
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);    // Thêm chuỗi vào danh sách tương ứng với khóa
        }

        return new ArrayList<>(map.values());   // Trả về danh sách các nhóm anagram
    }
}
