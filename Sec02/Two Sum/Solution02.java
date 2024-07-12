/**
 * 풀이법 02 : 정렬 + 투포인터
 * 실행 시간 : 4ms
 */

import java.util.*;

public class Solution02 {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSumNumbers = findTwoSumNumbers(nums.clone(), target);  
        return findIndexes(nums, twoSumNumbers[0], twoSumNumbers[1]);  
    }
    
    private int[] findTwoSumNumbers(int[] nums, int target) {
        Arrays.sort(nums);  

        int front = 0;
        int back = nums.length - 1;
        while(front < back) {
            int sumValue = nums[front] + nums[back];
            if (sumValue < target) {
                front++;
            } else if (sumValue > target) {
                back--;
            } else {
                return new int[]{nums[front], nums[back]};
            }
        }

        return new int[2];
    }

    private int[] findIndexes(int[] nums, int target1, int target2) {
        int sequence = 0;
        int[] indexes = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target1 || nums[i] == target2) {
                indexes[sequence++] = i;
            }
        }

        return indexes;
    }
}
