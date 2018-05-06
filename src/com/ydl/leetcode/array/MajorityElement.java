package com.ydl.leetcode.array;

public class MajorityElement {

    /**
     * 给定一个count。当元素相同的时候。count++。当元素不一样的时候count--
     * 因为元素一定超过了数组的一半了。所以count的数量一定会大于1
     */
    public int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if (count == 0){
                element = nums[i];
                count = 1;
            }else{
                if (element == nums[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return element;
    }
}
