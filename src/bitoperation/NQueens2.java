package bitoperation;

/**
 * leetcode 52. N皇后 II
 * https://leetcode-cn.com/problems/n-queens-ii/description/
 */
public class NQueens2 {

    private int size;//可以放皇后的位置
    private int count;

    private void solve(int row, int ld, int rd) {
        if (row == size) {//终止条件
            count++;
            return;
        }
        int pos = size & (~(row | ld | rd));//当前层能放皇后的所有位置
        while (pos != 0) {//循环，只要皇后的位置还在的话
            int p = pos & (-pos);//先取到可以放皇后的位置，
            pos -= p; // pos &= pos - 1;//放上皇后
            solve(row | p, (ld | p) << 1, (rd | p) >> 1);
        }
    }

    public int totalNQueens(int n) {
        count = 0;
        size = (1 << n) - 1;// 所有可以放皇后的位置
        solve(0, 0, 0);
        return count;
    }
}
