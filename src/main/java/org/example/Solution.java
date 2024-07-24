package org.example;

public class Solution {

    public int reverse(int num) {
        int initNumber = num;

        if (num<0) {
            num *= -1;
        }

        String numberStr = Integer.toString(num);
        StringBuilder strB = new StringBuilder();

        for (int i = numberStr.length()-1; i >= 0; i--) {
            strB.append(numberStr.charAt(i));
        }
        numberStr = strB.toString();

        try {
            Integer.parseInt(numberStr);
        }catch (NumberFormatException e) {
            return 0;
        }

        int reverseNumber = Integer.parseInt(numberStr);

        if (reverseNumber>Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE) {
            return 0;
        }

        if (initNumber<0) {
            reverseNumber *= -1;
            return reverseNumber;
        }
        return reverseNumber;
    }
}

