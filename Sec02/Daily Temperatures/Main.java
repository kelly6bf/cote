import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] input1 = new int[]{73,74,75,71,69,72,76,73};
        int[] input2 = new int[]{30,40,50,60};
        int[] input3 = new int[]{30,60,90};

        String result = "";

        System.out.println(Arrays.toString(new Solution().dailyTemperatures(input1)));
        
        System.out.println();
        System.out.println();

        System.out.println(Arrays.toString(new Solution().dailyTemperatures(input2)));
        
        System.out.println();
        System.out.println();

        System.out.println(Arrays.toString(new Solution().dailyTemperatures(input3)));        
    }
}
