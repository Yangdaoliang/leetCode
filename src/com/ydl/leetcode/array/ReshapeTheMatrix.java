package com.ydl.leetcode.array;

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        //先将二维数组拉成一维数组。然后在进行数组位置转换。
        int row = nums.length;
        int colnum = nums[0].length;
        int n = row * colnum;
        if (n == r * c){
            int[][] res = new int[r][c];
            for (int i = 0;i < n;i++){
                res[i/c][i%c] = nums[i/colnum][i%colnum];
            }
            return res;
        }else{
            return nums;
        }
    }
}
