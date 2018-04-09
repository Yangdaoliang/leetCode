package com.ydl.leetcode;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int _max = 0;
        for (int i = 0;i < nums.length;i++){
            if (nums[i] == 1){
                _max++;
                res = Math.max(res,_max);
            }else{
                _max = 0;
            }
        }
        return res;
    }

}
