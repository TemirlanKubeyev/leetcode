package org.example;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String y = String.valueOf(x);

        int start = 0;
        int end = y.length()-1;

        for (int i = 0; i < y.length()/2; i++) {
            if (y.charAt(start)!=y.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

