package array;

/**
 * leetcode 1. 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {
    //a,b -> a + b == traget
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }
        int[] result = new int[2];
        int numsSize = nums.length;
        for (int i = 0; i < numsSize; i++) {
            for (int j = i + 1; j < numsSize; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return null;
    }

}
