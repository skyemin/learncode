package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/9/9 15:27
 * @Description:
 * @Version:1.0
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int a = dfs(grid,i,j);
                max = Math.max(a,max);
            }
        }
        return max;
    }

    int dfs(int[][] grid,int r,int c){
        if(!isArea(grid,r,c)){
            return 1;
        }
        if(grid[r][c] == 0){
            return 1;
        }
        if(grid[r][c] != 1){
            return 0;
        }
        grid[r][c] = 2;
        return
        //上
        dfs(grid,r-1,c)+
        //下
        dfs(grid,r+1,c)+
        //左
        dfs(grid,r,c-1)+
        //右
        dfs(grid,r,c+1);

    }

    private boolean isArea(int[][] grid, int r, int c) {
        return r>=0 && r<grid.length && c>=0 && c<grid[0].length;
    }
}
