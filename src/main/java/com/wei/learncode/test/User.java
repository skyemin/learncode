package com.wei.learncode.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: weizz
 * @Date: 2019/7/3 15:00
 * @Description:
 * @Version:1.0
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Scope
public class User {
    private String name;
    private Integer age;

    public static void main(String[] args) {
       quickSort(new int[]{1,2,3,4,5,6,7,8,9},0,8);
    }
    //quick sort    快速排序
        public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }
}
