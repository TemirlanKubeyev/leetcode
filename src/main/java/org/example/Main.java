package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{1, 2, 3, 4};
        int target = 3;
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));

    }



}