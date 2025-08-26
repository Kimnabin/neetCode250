import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Found a duplicate
            }
            seen.add(num);
        }
        return false; // No duplicates found
    }

    public static boolean hasDuplicateBruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Found a duplicate
                }
            }
        }
        return false; // No duplicates found
    }

    public static boolean hasDuplicate2(int[] nums) {
        return Arrays.stream(nums) // tạo stream từ mảng
                .distinct() // loại bỏ phần tử trùng lặp
                .count() // đếm số phần tử duy nhất
                != nums.length; // so sánh với độ dài ban đầu
    }

}
