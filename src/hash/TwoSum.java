package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 1. 两数之和
 * https://leetcode-cn.com/problems/two-sum/description/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //方法一：暴力法
        // if(nums.length == 0){
        //     return null;
        // }
        // int[] result = new int[2];
        //  int numsSize = nums.length;
        // for (int i = 0; i < numsSize; i++){
        //     for (int j = i + 1; j< numsSize; j++){
        //         if (nums[i] + nums[j] == target){
        //             result[0] = i;
        //             result[1] = j;
        //             return result;
        //         }
        //     }
        // }

        // return null;

        //方法二：哈希表
        if (nums.length == 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
