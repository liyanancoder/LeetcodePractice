package bitoperation;

/**
 * leetcode 190. 颠倒二进制位
 * https://leetcode-cn.com/problems/reverse-bits/
 */
public class ReverseBits {
    /**
     * 原数字 1011 ，res = 0
     *
     * res 左移一位，res = 0，
     * 得到 1011 的最低位 1 加过来, res = 1
     * 1011 右移一位变为 101
     *
     * res = 1 左移一位，res = 10，
     * 得到 101 的最低位 1 加过来, res = 11
     * 101 右移一位变为 10
     *
     * res = 11 左移一位，res = 110，
     * 得到 10 的最低位 0 加过来, res = 110
     * 10 右移一位变为 1
     *
     * res = 110 左移一位，res = 1100，
     * 得到 1 的最低位 1 加过来, res = 1101
     * 1 右移一位变为 0, 结束
     */
    public int reverseBits(int n) {
//        int ans = 0;
//        for (int bitsSize = 31; n != 0; n = n >>> 1, bitsSize--){
//            ans += (n & 1) << bitsSize;
//        }
//        return ans;

        int res = 0;
        int count = 0;
        while (count < 32) {
            res <<= 1; // res 左移一位空出位置
            res |= (n & 1); //得到的最低位加过来
            n >>= 1; //原数字右移一位去掉已经处理过的最低位
            count++;
        }
        return res;
    }
}
