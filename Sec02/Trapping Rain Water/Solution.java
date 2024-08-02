import java.util.*;

class Solution {
    public int trap(int[] height) {
        Deque<Block> stack = new ArrayDeque<>();
        int[] rainWaterAmount = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            Block current = new Block(i, height[i]);

            if (stack.isEmpty() || stack.peek().height > current.height) {
                stack.push(current);
                continue;
            }

            Block popped;
            while (stack.peek().height <= current.height) {
                popped = stack.pop();
            }

            Block left;
            Block lower;
            if (stack.isEmpty()) {
                left = popped;
                lower = popped;
            } else {
                left = stack.peek();
                lower = current;
            }

            for (int i = left.index + 1; i < current.index; i++) {
                rainWaterAmount[i] = lower.height - height[i];
            }

            stack.push(current);
        }

        return rainWaterAmountSum(rainWaterAmount);
    }

    private int rainWaterAmountSum(int[] rainWaterAmount) {
        int sum = 0;
        for (int amount : rainWaterAmount) {
            sum += amount;
        }

        return sum;
    }
}

class Block {
    public int index;
    public int height;

    Blcok(int index, int height) {
        this.index = index;
        this.height = height;
    }
}
