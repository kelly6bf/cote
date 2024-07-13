import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        String input4 = "]";

        boolean result = false;

        result = new Solution().isValid(input1);
        System.out.println(result);

        System.out.println();
        System.out.println();

        result = new Solution().isValid(input2);
        System.out.println(result);

        System.out.println();
        System.out.println();

        result = new Solution().isValid(input3);
        System.out.println(result);

        System.out.println();
        System.out.println();

        result = new Solution().isValid(input4);
        System.out.println(result);
    }
}
