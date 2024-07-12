/**
 * 풀이법 01 : 2중 looping
 * 실행 시간 : 53ms
 */

public class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (equalSumValueToTarget(target, nums[i], nums[j])) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[2];
    }

    private boolean equalSumValueToTarget(int target, int num1, int num2) {
        return num1 + num2 == target;
    }
}
