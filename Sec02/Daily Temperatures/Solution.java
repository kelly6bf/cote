import java.util.*;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        Deque<TemperatureRecord> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek().temperature < temperatures[i]) {
                TemperatureRecord temperatureRecord = stack.pop();
                answer[temperatureRecord.day] = i - temperatureRecord.day;
            }

            stack.push(new TemperatureRecord(i, temperatures[i]));
        }

        return answer;
    }
}

class TemperatureRecord {
    public int day;
    public int temperature;

    TemperatureRecord(int day, int temperature) {
        this.day = day;
        this.temperature = temperature;
    }
}