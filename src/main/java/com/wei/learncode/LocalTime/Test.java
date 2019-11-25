package com.wei.learncode.LocalTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoField;

/**
 * @Author: skye
 * @Date: 2019/11/24 11:38
 * @Description:
 * @Version:1.0
 */
public class Test {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int year1 = localDate.get(ChronoField.YEAR);
        Month month = localDate.getMonth();
        int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
        int day = localDate.getDayOfMonth();
        int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK);
        System.out.println(day);
        System.out.println(day1);
    }
}
