package com.ydl.leetcode.array;

public class RemoveElement {
    /**
     * 将不需要删除的数组直接放在数组的前面。然后直接返回数组的长度。
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int m = 0;
        for (int i = 0;i < nums.length;i++){
            if (val != nums[i]){
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }

}
