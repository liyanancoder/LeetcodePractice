package array;

/**
 * leetcode 70. 爬楼梯
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    //找 最近 重复子问题

//if else
//for while，recursion

//1:1
//2:2
//3:f(1)+f(2),mutual exclusive,complete exhaustive
//4：f(2)+f(3)

//f(n) = f(n-1) + f(n-2):fibonacci

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int num1 = 1;
        int num2 = 2;
        int numN = 0;
        for (int i = 2; i < n; i++) {
            numN = num1 + num2;
            num1 = num2;
            num2 = numN;
        }
        return numN;
    }
}
