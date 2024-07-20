package LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String[] s = {"()", "{}", "[]", "{]", "{{", "({[]})"};
        for (String string : s) {
            boolean result = isValid(string);
            System.out.println(string + " : " + result);
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char result = stack.pop();
                if (c == ')' && result != '(' || c == '}' && result != '{' || c == ']' && result != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


