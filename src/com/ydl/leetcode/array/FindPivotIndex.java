package com.ydl.leetcode.array;

public class FindPivotIndex {
    /**
     * 先求数组总和，在维护一个数组等于每次遍历前的数据之和。
     * 然后遍历数组。将数组的总和减去当前元素的值。看看是否等于维护数组的值的两倍。
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0;i < nums.length;i++){
            sum += nums[i];
        }
        int tempSum = 0;
        for (int i = 0;i < nums.length;i++){
            if ((sum - nums[i]) == 2*tempSum){
                return i;
            }else{
                tempSum += nums[i];
            }
        }
        return -1;
    }

}
