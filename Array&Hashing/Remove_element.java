import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_element {
    // tra ve so luong phan tu con lai trong mang moi
    public int Remove_elements(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;

       Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().toList());
       set.remove(val);
       // convert back to array
       int[] result = set.stream().mapToInt(Integer::intValue).toArray();
       return result.length;
    }

    // tra ve mang moi
    public int[] Remove_elements2(int[] nums, int val) {
        if (nums == null || nums.length == 0) return new int[0];

        Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().toList());
        set.remove(val);
        // convert back to array
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }


    public int removeElement(int[] nums, int val) {
        List<Integer> tmp = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                tmp.add(num);
            }
        }
        for (int i = 0; i < tmp.size(); i++) {
            nums[i] = tmp.get(i);
        }
        return tmp.size();
    }


    public int removeElement2(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
