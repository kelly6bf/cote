import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] inputNums1 = new int[]{2,7,11,15};
        int inputTarget1 = 9;

        int[] inputNums2 = new int[]{3,2,4};
        int inputTarget2 = 6;

        int[] inputNums3 = new int[]{3,3};
        int inputTarget3 = 6;

        int[] inputNums4 = new int[]{0, 4, 3, 0};
        int inputTarget4 = 0;

        String result = "";
        result = Arrays.toString(new Solution01().twoSum(inputNums1, inputTarget1));
        System.out.println(result);
        result = Arrays.toString(new Solution01().twoSum(inputNums2, inputTarget2));
        System.out.println(result);
        result = Arrays.toString(new Solution01().twoSum(inputNums3, inputTarget3));
        System.out.println(result);

        System.out.println();
        System.out.println();

        result = Arrays.toString(new Solution02().twoSum(inputNums1, inputTarget1));
        System.out.println(result);
        result = Arrays.toString(new Solution02().twoSum(inputNums2, inputTarget2));
        System.out.println(result);
        result = Arrays.toString(new Solution02().twoSum(inputNums3, inputTarget3));
        System.out.println(result);
        result = Arrays.toString(new Solution02().twoSum(inputNums4, inputTarget4));
        System.out.println(result);
    }
}
