package array;

/**
 * leetcode 26. 删除排序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {
    //双指针法 时间复杂度O(n) 空间复杂度O(1)
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        //p：慢指针，q：快指针
        int p = 0;
        for (int q = 1; q < nums.length; q++) {
            if (nums[p] != nums[q]) {
                //优化点：当有删除的元素后才去复制一遍，例如一个数组中没有重复元素的就没有必要挨个复制一遍
                if (q - p > 1) {
                    nums[p + 1] = nums[q];
                }
                p++;
            }
        }
        return p + 1;
    }
}
