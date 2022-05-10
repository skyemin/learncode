package com.wei.learncode.design.adapt.begin;

/**
 * @Author: skye
 * @Date: 2020/8/29 11:57
 * @Description: 八皇后问题
 * @Version:1.0
 */
public class Cal8queens {

    public static void main(String[] args) {
        Cal8queens c = new Cal8queens();
        c.cal8queens(0);
    }

    //下标表示第几行,值表示第几列
    int[] result = new int[8];

    public void cal8queens(int row){

        if(row == 8){
            printQueens(result);
        }
        for (int column = 0; column < 8; column++) {
            if(isOk(row,column)){
                result[row] = column;
                cal8queens(row+1);
            }
        }
    }

    //判断row行column列是否合法
    private boolean isOk(int row, int column) {
        int leftup = column - 1, rightup = column + 1;
        for (int i = row-1; i >=0 ; i--) {
            if(result[i] == column) return false;
            if(leftup>0){
                if(result[i] == leftup){
                    return false;
                }
            }
            if(rightup<8){
                if(result[i] == rightup){
                    return false;
                }
            }
            leftup--;rightup++;
        }
        return true;
    }

    private void printQueens(int[] result) {
        for (int row = 0; row < 8; ++row) {
            for (int column = 0; column < 8; ++column) {
                if (result[row] == column) System.out.print("Q ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
