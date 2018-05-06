package com.ydl.leetcode.array;

public class MissingNumber {

    /**
     * 将不缺失数组和缺失的数组进行异或处理就是缺失的数字
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 0;i < nums.length;i++){
            result ^= (i+1)^nums[i];
        }
        return result;
    }

}
