package com.wei.learncode.interview2025;

import java.util.ArrayList;
import java.util.List;

public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        Integer[] tmp = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }
        return findKthLargest(tmp, k);
    }

    public int findKthLargest(Integer[] nums, int k) {
        int pivot = nums[0];  // pivot是值，不是下标

        List<Integer> big = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                big.add(nums[i]);
            } else if (nums[i] < pivot) {
                small.add(nums[i]);
            } else {
                equal.add(nums[i]);
            }
        }

        if (k <= big.size()) {
            return findKthLargest(big.toArray(new Integer[0]), k);
        } else if (k > big.size() + equal.size()) {
            return findKthLargest(small.toArray(new Integer[0]), k - big.size() - equal.size());
        } else {
            return pivot;
        }
    }
}
