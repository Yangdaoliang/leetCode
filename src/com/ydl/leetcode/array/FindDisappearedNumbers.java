package com.ydl.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    /**
     * 标志位方法
     * 1、将这些数字本来应该出现的位置标记为负数
     * 2、找寻没有出现负数的位置的数
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>();
        //判空处理一下
        if (nums == null || nums.length == 0){
            return res;
        }
        int n = nums.length;
        for (int i = 0;i < n;i++){
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0){
                nums[val] = -nums[val];
            }
        }
        for (int i = 0;i < n;i++){
            if (nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }

}
