package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastWordLength {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        return word[word.length - 1].length();
    }
}
