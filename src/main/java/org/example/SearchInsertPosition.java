package org.example;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        // 1 3 5 6   -> nums
        //         7 -> target
        int startPos = 0;
        int endPos = nums.length - 1;

        while (startPos <= endPos) {
            int middlePos = (startPos + endPos) / 2;
            if (nums[middlePos] == target) {
                return middlePos;
            } else if (nums[middlePos] < target) {
                startPos = middlePos + 1;
            } else {
                endPos = middlePos - 1;
            }
        }
        return startPos;
    }

}
