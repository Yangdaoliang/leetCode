package com.ydl.leetcode.string;

public class DetectCapital {

    public boolean detectCapitalUse(String word){
        if(word == null || word.length() == 0) return false;
        if (word.length() == 1) return true;
        int count = 0;
        for(int i = 1; i < word.length(); i++)
            if(Character.isUpperCase(word.charAt(i)))    count++;
            else    count--;
        //如果除了第一个字母全部是小写或者大写
        if(Math.abs(count) != (word.length() - 1))    return false;
        //全部都是大写
        else if(count > 0 && Character.isUpperCase(word.charAt(0)))    return true;
        //全部是小写
        else if(count < 0)    return true;
        return false;
    }

}
