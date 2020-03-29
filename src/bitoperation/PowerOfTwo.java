package bitoperation;

/**
 * leetcode 231. 2的幂
 * https://leetcode-cn.com/problems/power-of-two/
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        // // 方法一：
        // if (n == 0) return false;
        // long x = (long) n;
        // return (x & (-x)) == x;

        //方法二：
        if (n == 0) return false;
        long x = (long) n;
        return (x & (x - 1)) == 0;
    }
}
