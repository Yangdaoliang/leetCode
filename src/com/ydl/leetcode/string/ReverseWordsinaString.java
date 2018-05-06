package com.ydl.leetcode.string;

public class ReverseWordsinaString {

    public String reverseWords(String s) {
        if (s == null || s == ""){
            return null;
        }
        StringBuffer re = new StringBuffer();
        String[] worlds = s.split(" ");
        for (int i = 0;i < worlds.length;i++){
            re.append(new StringBuffer(worlds[i]).reverse().toString()+" ");
        }
        return re.toString().substring(0,re.toString().length()-1);
    }

}
