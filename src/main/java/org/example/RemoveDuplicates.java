package org.example;

import java.util.Arrays;

public class RemoveDuplicates {
    // {0,0,1,1,1,2,2,3,3,4}

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j < nums.length; j++) {
                nums[k] = nums[j];
                if (nums[j]==nums[i]) {
                    break;
                }
                k++;
            }
        }
        return k+1;
    }

}
