package com.wei.learncode;

/**
 * @Author: skye
 * @Date: 2020/9/6 11:23
 * @Description:
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {


    }

    void dfs(int[][]grid,int r,int c){
        if(grid[r][c] != 5){
            return;
        }
        if(!area(grid,r,c)){
            return;
        }
        grid[r][c] = 0;
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
    }

    private boolean area(int[][] grid, int r, int c) {
        return 0<=r & r<grid.length & 0<=c & c<grid[0].length;
    }
}
