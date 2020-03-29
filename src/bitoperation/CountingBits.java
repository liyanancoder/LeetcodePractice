package bitoperation;

/**
 * leetcode 338. 比特位计数
 * https://leetcode-cn.com/problems/counting-bits/description/
 */
public class CountingBits {
    public int[] countBits(int num) {
        //方法一：
        int[] ans = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            ans[i] = popCount(i);
        }
        return ans;
    }

    private int popCount(int x) {
        int count = 0;
        while (x != 0) {
            count++;
            x &= x - 1;
        }
        return count;
    }
}
