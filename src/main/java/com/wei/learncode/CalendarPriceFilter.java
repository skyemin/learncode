package com.wei.learncode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalendarPriceFilter {

    static class DateRange {
        LocalDate startDate;
        LocalDate endDate;

        DateRange(LocalDate startDate, LocalDate endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        @Override
        public String toString() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return "[" + startDate.format(formatter) + " - " + endDate.format(formatter) + "]";
        }
    }

    public static void main(String[] args) {

        //获取当前时间
        Date currentDate = new Date(); // 获取当前时间
        //转localDate
        LocalDate localDate = currentDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);
        // 定义日历价格区间
        LocalDate calendarStart = LocalDate.of(2025, 1, 1);
        LocalDate calendarEnd = LocalDate.of(2025, 1 ,3);

        // 定义节假日区间
        List<DateRange> holidays = new ArrayList<>();
        holidays.add(new DateRange(LocalDate.of(2025, 2, 1), LocalDate.of(2025, 8, 7))); // 春节
        holidays.add(new DateRange(LocalDate.of(2025, 3, 1), LocalDate.of(2025, 5, 5))); // 五一

        // 存储有效的日期段
        List<DateRange> availableRanges = new ArrayList<>();

        // 初始化有效日期段的首尾
        LocalDate rangeStart = calendarStart;
        LocalDate rangeEnd = calendarEnd;

        // 检查与节假日区间的相交
        for (DateRange holiday : holidays) {
            // 节假日与有效日期范围相交的情况
            if (!(rangeEnd.isBefore(holiday.startDate) || rangeStart.isAfter(holiday.endDate))) {
                // 如果假期开始日期在有效范围内，更新范围
                if (rangeStart.isBefore(holiday.startDate)) {
                    availableRanges.add(new DateRange(rangeStart, holiday.startDate.minusDays(1)));
                }
                // 更新范围的开始日期
                rangeStart = holiday.endDate.plusDays(1);
            }
        }

        // 添加最后的有效日期段（如果有的话）
        if (!rangeStart.isAfter(calendarEnd)) {
            availableRanges.add(new DateRange(rangeStart, calendarEnd));
        }

        // 输出结果
        System.out.println("有效的日期区段：");
        for (DateRange range : availableRanges) {
            System.out.println(range);
        }
    }
}
