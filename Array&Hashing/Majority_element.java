import java.util.Arrays;
import java.util.HashMap;

public class Majority_element {
    // using HashMap 
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }

    // using Boyer-Moore Voting Algorithm
    public static int majorityElement2(int[] nums) {
        int candidate = 0; 
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    // using sort 
    public static int majorityElement3(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
