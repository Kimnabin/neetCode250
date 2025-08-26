class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        // copy nums vao nua dau result
        System.arraycopy(nums, 0, result, 0, nums.length);

        // copy nums vao nua sau result
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        
        return result;
    }
}


