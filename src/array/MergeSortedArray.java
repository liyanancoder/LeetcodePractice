package array;

/**
 * leetcode 88. 合并两个有序数组
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // //方法一：合并后排序 时间复杂度O(n)log(n) 空间复杂度O(1)
        // System.arraycopy(nums2, 0, nums1, m, n);
        // Arrays.sort(nums1);

        // //方法二：双指针/从前往后 时间复杂度O(n) 空间复杂度O(m)
        // //需要先将输出的num1数组copy一份
        // int[] nums1_copy = new int[m];
        // System.arraycopy(nums1,0,nums1_copy,0,m);

        // //num1_copy和num2的指针
        // int p1 = 0;
        // int p2 = 0;

        // //num1的指针
        // int p = 0;

        // while((p1 < m) && (p2 < n)){
        //     if(nums1_copy[p1] < nums2[p2]){
        //         nums1[p] = nums1_copy[p1];
        //         p++;
        //         p1++;
        //     } else {
        //         nums1[p] = nums2[p2];
        //         p++;
        //         p2++;
        //     }
        // }

        // if (p1 < m){
        //     System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        // }

        // if(p2 < n) {
        //     System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
        // }


        //方法三：双指针法/从后往前 时间复杂度O(n+m) 空间复杂度O(1)
        //num1未扩容尾部的指针
        int p1 = m - 1;
        //num2尾部的指针
        int p2 = n - 1;
        //num1扩容后尾部的指针
        int p = m + n - 1;

        while ((p1 >= 0) && (p2 >= 0)) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p] = nums2[p2];
                p--;
                p2--;
            } else {
                nums1[p] = nums1[p1];
                p--;
                p1--;
            }
        }

        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
