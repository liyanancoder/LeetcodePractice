package array;

/**
 * leetcode 11. 盛最多水的容器
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {
    //方法一：
    // //1、枚举：left bar x,right bar y ,(x-y)*height_diff ，时间复杂度O(n^2)
    // public int maxArea(int[] height) {
    //     int maxArea = 0;
    //     for (int i = 0; i < height.length - 1; ++i){
    //         for (int j = i + 1; j < height.length; ++j){
    //             int area = (j - i) * Math.min(height[i],height[j]);
    //             maxArea = Math.max(maxArea,area);
    //         }
    //     }
    //     return maxArea;
    // }

    //方法二：
    //O(n),左右边界向中间收敛，左右夹逼的办法
    //我们只要一开始左右两根棒子选在最右边的，然后再往里面慢慢收敛即可，因为现在宽度是最宽的，选出
    //最高的棒子往中间收即可，如果它的高度不及外面的棒子的话，就不用看了。所以在往里收敛的时候只
    //需要关注哪些棒子更高的就可以了，
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            maxArea = Math.max(maxArea, (j - i + 1) * minHeight);
        }
        return maxArea;
    }

}
