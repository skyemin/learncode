package com.wei.learncode.newcoder;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/4/20 14:02
 */
public class MinPathSum {

    public int minPathSum (int[][] matrix) {
        // write code here
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                //左上都是边界
                if(i == 0 && j ==0) continue;
                else if(i == 0){
                    //左是边界,只能从上面来
                    matrix[i][j] = matrix[i][j-1]+matrix[i][j];
                }
                else if(j == 0){
                    //上是边界,只能从左边来
                    matrix[i][j] = matrix[i-1][j]+matrix[i][j];
                }
                else {
                    matrix[i][j] = Math.min(matrix[i][j-1],matrix[i-1][j])+matrix[i][j];
                }
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
