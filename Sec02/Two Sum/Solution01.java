/**
 * 풀이법 01 : 2중 iter 방식
 */

public class Solution01 {

    public int[] twoSum(int[] nums, int target) {
        int numsCount = nums.length;

        for(int firstIndex = 0; firstIndex < numsCount - 1; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex < numsCount; secondIndex++) {
                if (checkSum(target, nums[firstIndex], nums[secondIndex])) {
                    return new int[]{firstIndex, secondIndex};
                }
            }
        }

        return new int[]{0, 0};
    }

    private boolean checkSum(int target, int num1, int num2) {
        return num1 + num2 == target;
    }
}
