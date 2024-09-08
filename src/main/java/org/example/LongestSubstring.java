package org.example;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!(str.contains(String.valueOf(s.charAt(j))))) {
                    str += s.charAt(j);
                } else {
                    str = "";
                    break;
                }
                if (str.length() > length) {
                    length = str.length();
                }
            }
        }
        return length;
    }
}
