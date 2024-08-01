import java.util.*;

public class Solution {

    public int solution(int[] queue1, int[] queue2) {
        Deque<Integer> q1 = convertArrayToQueue(queue1);
        Deque<Integer> q2 = convertArrayToQueue(queue2);
        long q1Sum = queueSum(q1);
        long q2Sum = queueSum(q2);
        long targetSum = (q1Sum + q2Sum) / 2;

        int allQueueItemsLength = q1.size() + q2.size();
        for (int i = 0; i < allQueueItemsLength * 3; i++) {
            if (q1Sum == targetSum) {
                return i;
            }

            if (q1Sum > q2Sum) {
                int pollValue = q1.poll();
                q2.offer(pollValue);
                q1Sum -= pollValue;
                q2Sum += pollValue;
            } else {
                int pollValue = q2.poll();
                q1.offer(pollValue);
                q1Sum += pollValue;
                q2Sum -= pollValue;
            }
        }

        return -1;
    }

    private Deque<Integer> convertArrayToQueue(int[] array) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int number : array) {
            queue.offer(number);
        }

        return queue;
    }

    private boolean matchQueueSumEqual(Deque<Integer> queue1, Deque<Integer> queue2) {
        return queueSum(queue1) == queueSum(queue2);
    }

    private long queueSum(Deque<Integer> queue) {
        long sum = 0;
        for (int number : queue) {
            sum += number;
        }

        return sum;
    }    
}
