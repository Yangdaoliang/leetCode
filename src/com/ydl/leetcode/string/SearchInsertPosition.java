package com.ydl.leetcode.string;

public class SearchInsertPosition {
    /**
     * 二分查找的变体
     * 如果二分查找找不到的话。那么就刚刚好等于start停留在目标索引大于1的值。end刚好停留在目标索引小于1的值。
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int middle = (start + end)/2;
            if (target == nums[middle]) return middle;
            else if (target > nums[middle]){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return start;
    }

}
