package com.ydl.leetcode.array;

public class MaxAreaOfIsland {

    /**
     * 求岛屿中的最大值。
     * 1、求相邻的1的最大个数。
     * 2、避免重复计算。将走过的数字变成0。
     */

    public int maxAreaOfIsland(int[][] grid) {

        int maxValue = 0;

        for(int i = 0;i < grid.length;i++){
            for (int j = 0;j < grid[0].length;j++){
                maxValue = Math.max(maxValue,dfs(grid,i,j));
            }
        }
        return maxValue;
    }

    public int dfs(int[][] grid,int i,int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        int tempMaxValue = 1;
        grid[i][j] = 0;
        tempMaxValue += dfs(grid,i,j-1) + dfs(grid,i,j+1)+dfs(grid,i-1,j)+dfs(grid,i+1,j);

        return tempMaxValue;
    }
}
