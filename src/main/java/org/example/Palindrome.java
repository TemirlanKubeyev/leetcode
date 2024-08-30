package org.example;

public class Palindrome {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            // нечетное
            int obtainedLength = getLengthLAndR(s, i, i);
            // четное
            int obtainedLength2 = getLengthLAndR(s, i, i+1);
            int maxLength = Math.max(obtainedLength, obtainedLength2);

            if (maxLength > length) {
                length = maxLength;
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int getLengthLAndR(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}

