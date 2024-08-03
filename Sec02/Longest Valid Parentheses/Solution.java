import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {
        char[] input = s.toCharArray();
        Deque<Piece> stack = new ArrayDeque<>();

        int longestLength = 0;
        for (int i = 0; i < input.length; i++) {
            Piece piece = new Piece(i + 1, input[i]);

            if (piece.value == '(') {
                stack.push(piece);
                continue;
            }

            if (!stack.isEmpty() && stack.peek().value == '(') {
                stack.pop();
                longestLength = Math.max(longestLength, calculateValidBracketStringLength(stack, piece));
            } else {
                stack.push(piece);
            }
        }

        return longestLength;
    }

    private int calculateValidBracketStringLength(Deque<Piece> stack, Piece piece) {
        int startIndex = 0;

        if (!stack.isEmpty()) {
            startIndex = stack.peek().index;
        }

        return piece.index - startIndex;
    }
}

class Piece {
    int index;
    int value;

    Piece(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
