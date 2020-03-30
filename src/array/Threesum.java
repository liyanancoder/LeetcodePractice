package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leetcode 15. 三数之和
 * https://leetcode-cn.com/problems/3sum/
 */
public class Threesum {
    // a + b + c = 0 -> a + b = -c(target)

    //1、暴力O(n^3)

    //2、hash表来记录 a,b ,a+b = -c

    //3、左右下标推进

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0){
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();

        int size = nums.length;

        for (int i = 0; i < size - 2; i++){
            for (int j = i + 1; j < size - 1; j++){
                for (int k = j + 1; k < size; k++){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        return result;
    }
}
