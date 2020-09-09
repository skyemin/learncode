package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/9/9 15:09
 * @Description:岛屿最大面积
 * @Version:1.0
 */
public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    int a = dfs(grid,i,j);
                    max = Math.max(max,a);
                }
            }
        }
        return max;
    }
    //网格dfs的通用模板   grid[行][列]
    int dfs(int[][] grid,int r,int c){
        if(!isArea(grid,r,c)){
            return 0;
        }
        if(grid[r][c] != 1){
            return 0;
        }
        //标记岛屿已处理
        grid[r][c] = 2;
        return 1+
        //上
        dfs(grid,r-1,c)
        //下
        +
        dfs(grid,r+1,c)
        //左
        +
        dfs(grid,r,c-1)
        //右
        +
        dfs(grid,r,c+1);
    }

    private boolean isArea(int[][] grid, int r, int c) {
        return r>=0 && r<grid.length && c>=0 && c<grid[0].length;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {1, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
        System.out.println(maxAreaOfIsland.maxAreaOfIsland(grid1));
    }

}
