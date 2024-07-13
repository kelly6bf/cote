/**
 * 풀이법 : Stack 활용
 */

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque();
        char[] determines = s.toCharArray();
        for (char c : determines) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.peek() != null && c == stack.peek()) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
