package com.ydl.leetcode.Interview;

public class EightQueue {

    public static void main(String[] args) {
        EightQueue test = new EightQueue();
        test.cal8queues(0);
    }

    int[] result = new int[8];
    public void cal8queues(int row){
        if (row == 8){
            printQueues(result);
            return ;
        }
        for (int colnum = 0;colnum < 8;++colnum){
            if (isOk(row,colnum)){
                result[row] = colnum;
                cal8queues(row+1);
            }
        }
    }

    public boolean isOk(int row,int colnum){
        int leftup = colnum - 1,rightup = colnum + 1;
        for (int i = row-1;i>=0;--i){
            if (result[i] == colnum) return false; // 检查第colnum列有没有元素
            if (leftup >= 0){
                if (result[i] == leftup) return false; // 检查左上对角线
            }
            if (rightup < 8){
                if (result[i] == rightup) return false; // 检查右上对角线
            }
            --leftup;
            ++rightup;
        }
        return true;
    }


    public void printQueues(int[] result){
        for (int row = 0;row < 8;++row){
            for (int colnum = 0;colnum < 8;++colnum){
                if (result[row] == colnum) System.out.print("Q ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
