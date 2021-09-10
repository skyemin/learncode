package com.wei.learncode.gs;

import java.util.Scanner;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/9/7 19:39
 */
public class Test2 {

    public static void main(String[] args) {
        int year, month, day;
        int days = 0;
        int d = 0;
        Scanner s = new Scanner(System.in);
        year = s.nextInt();
        month = s.nextInt();
        day = s.nextInt();
        if (year < 0 || month <= 0 || month > 12 ||day < 0 || day > 31) {
            System.out.println("输入错误，请重新输入！");
            return;
        }
        for (int i=1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0&& year % 100 != 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }
        d += days;
        }
        System.out.println(year + "-" + month +"-" + day + "是这年的第" +(d+day) + "天。");
    }
}
