package com.wei.learncode.begin;

/**
 * @Author: skye
 * @Date: 2020/9/9 14:30
 * @Description:  岛屿数量
 * @Version:1.0
 */
public class Daoyu {


    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    //网格dfs的通用模板   grid[列][行]
    void dfs(char[][] grid,int r,int c){
        if(!isArea(grid,r,c)){
            return;
        }
        if(grid[r][c] != '1'){
            return;
        }
        //标记岛屿已处理
        grid[r][c] = '2';
        //上
        dfs(grid,r-1,c);
        //下
        dfs(grid,r+1,c);
        //左
        dfs(grid,r,c-1);
        //右
        dfs(grid,r,c+1);
    }

    private boolean isArea(char[][] grid, int r, int c) {
        return r>=0 && r<grid.length && c>=0 && c<grid[0].length;
    }

    public static void main(String[] args) {
        char[][] grid1 = {
                {'1', '1', '0', '1', '0'},
                {'0', '0', '0', '1', '0'},
                {'1', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        Daoyu daoyu = new Daoyu();
        System.out.println(daoyu.numIslands(grid1));
    }
}
