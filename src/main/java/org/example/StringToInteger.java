package org.example;

public class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int step = 0;
        if (s.charAt(0)=='-' || s.charAt(0)=='+') {
            step++;
        }

        int minus = 1;
        if (s.charAt(0)=='-') {
            minus = -1;
        }

        String number = "";
        for (int i = step; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                number += s.charAt(i);
            } else {
                break;
            }
        }
        if (number.isEmpty()) {
            return 0;
        }

        try {
            Integer.parseInt(number);
        }catch (NumberFormatException e) {
            if (minus == -1) {
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }

        return Integer.parseInt(number) * minus;

    }
}

