package array;

/**
 * leetcode 283. 移动零
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class MoveZeroes {
    //1、loop,count zero,
    //2、开一个新数组，loop
    //3、直接在数组中进行index操作
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
