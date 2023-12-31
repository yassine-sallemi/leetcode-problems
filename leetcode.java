import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }

    public int[] twoSum(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[i] + nums[j] == target) {
            return new int[] {i, j};
          }
        }
      }
      return new int[] {};
    }
}
