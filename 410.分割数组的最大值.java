/*
 * @lc app=leetcode.cn id=410 lang=java
 *
 * [410] 分割数组的最大值
 */

// @lc code=start
class Solution {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        int[][] f = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(f[i], Integer.MAX_VALUE);
        }
        int[]  g= new int[n + 1];
        for (int i = 0; i < n; i++) {
            g[i + 1] = g[i] + nums[i];
        }
        f[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, m); j++) {
                for (int k = 0; k < i; k++) {
                    f[i][j] = Math.min(f[i][j], Math.max(f[k][j - 1], g[i] - g[k]));
                }
            }
        }
        return f[n][m];
    }
}

   
// @lc code=end

