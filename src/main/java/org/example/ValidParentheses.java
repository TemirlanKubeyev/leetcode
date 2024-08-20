package org.example;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;
        if (!(s.contains("]") || s.contains(")") || s.contains("}"))) return false;

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(")", "(");
        hashMap.put("}", "{");
        hashMap.put("]", "[");

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                String openItem = String.valueOf(s.charAt(i));
                stack.push(openItem);
            } else {
                String closeItem = String.valueOf(s.charAt(i));
                if (stack.empty() || (!(stack.pop().equals(hashMap.get(closeItem))))) {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }

    }
}
