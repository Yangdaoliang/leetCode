package com.ydl.leetcode.Interview;

public class PackageSolution {

    public static void main(String[] args) {
        PackageSolution test = new PackageSolution();
        int[] a = new int[]{10,13,14,15,6,8,23,14,15,19};
        test.f(0,0,a,10,100);
        System.out.println(test.maxW);
        System.out.println(test.knapsack(a,10,100));
    }

    public int maxW = Integer.MIN_VALUE;// 存储背包中物品总重量的最大值

    /**
     *
     * @param i 考察到第几个物品
     * @param cw 当前装进去的物品的重量
     * @param items 表示每个物品的重量
     * @param n 表示物品个数
     * @param w 背包重量
     */
    public void f(int i,int cw,int[] items,int n,int w){
        if (cw == w || i == n){ // 当前装进去的物品重量已经等于背包重量 或者 物品已经遍历完成
            if (cw > maxW) maxW = cw;
            return ;
        }
        f(i + 1,cw,items,n,w);// 表示不选择这个物品，所以不更新cw的值
        if (cw + items[i] <= w){ // 已经超过可以背包承受的重量的时候，就不要在装了。
            f(i+1,cw + items[i],items,n,w);//表示选择这个物品，所以更新cw的值
        }
    }


    public int knapsack(int[] weight,int n,int w){
        boolean[][] status = new boolean[n][w+1];
        status[0][0] = true;
        status[0][weight[0]] = true;
        for (int i = 1;i < n;i++){
            for (int j = 0;j <= w;j++){
                if (status[i-1][j] == true){ // 不把第i个物品放入背包
                    status[i][j] = status[i-1][j];
                }
            }
            for (int j = 0;j <= w - weight[i];j++){
                if (status[i-1][j] == true){// 把第i个物品放入背包
                    status[i][j+weight[i]] = true;
                }
            }
        }
        for (int i = w; i >=0 ;i--){
            if (status[n-1][i] == true) return i;
        }
        return 0;
    }

}
