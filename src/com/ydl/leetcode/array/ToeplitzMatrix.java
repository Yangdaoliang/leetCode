package com.ydl.leetcode.array;

public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int xLength = matrix.length;
        int yLength = matrix[0].length;
        for (int i = 0;i < xLength-1;i++){
            for(int j = 0;j < yLength-1;j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }

        }
        return true;
    }
}
