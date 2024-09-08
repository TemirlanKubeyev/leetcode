package org.example;

import java.util.Arrays;

public class MergeArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m != 0 && n != 0) {
            int count = 0;
            for (int i = m; i < nums1.length; i++) {
                nums1[i]=nums2[count];
                count++;
            }
            for (int i = 1; i < nums1.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums1[i] < nums1[j]) {
                        int num = nums1[i];
                        nums1[i] = nums1[j];
                        nums1[j] = num;
                    }
                }
            }
        }else {
            if (nums2.length!=0) {
                for (int i = 0; i < nums1.length; i++) {
                    nums1[i] = nums2[i];
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
