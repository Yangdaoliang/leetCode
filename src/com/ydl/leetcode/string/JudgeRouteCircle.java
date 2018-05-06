package com.ydl.leetcode.string;

public class JudgeRouteCircle {
    /**
     * 坐标问题。回到原点就是x=0和y=0
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0;i < moves.length();i++){
            if (moves.charAt(i) == 'L') x--;
            else if (moves.charAt(i) == 'R') x++;
            else if (moves.charAt(i) == 'U') y++;
            else y--;
        }
        if (x == 0 && y == 0){
            return true;
        }else{
            return false;
        }

    }

}
