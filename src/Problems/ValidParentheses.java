package Problems;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            //if c is an open bracket then stack them
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                //defines top value which should be a closed parentheses since cannot eb the open parentheses since in else loop
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        //since we are popping every top if it has a closed parentheses eventually isEmpty() == true
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));          // true
        System.out.println(isValid("()[]{}"));      // true
        System.out.println(isValid("(]"));          // false
        System.out.println(isValid("([)]"));        // false
        System.out.println(isValid("{[]}"));        // true
    }
}

