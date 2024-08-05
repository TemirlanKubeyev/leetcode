package org.example;

import java.util.ArrayList;
import java.util.List;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        // отправляем все возможные префиксы в один список
        String string = strs[0];
        List<String> allPefixes = new ArrayList<>();
        for (int i = 1; i <= string.length(); i++) {
            allPefixes.add(string.substring(0, i));
        }
        // начинаем сравнивает с остальными словами все префиксы
        String prefix = "";
        boolean res = false;
        for (int i = 0; i < allPefixes.size(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].startsWith(allPefixes.get(i))) {
                    res = true;
                } else {
                    res = false;
                    break;
                }
            }
            if (res) {
                prefix = allPefixes.get(i);
            }
        }
        return prefix;
    }
}
