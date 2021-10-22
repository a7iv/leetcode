package com.vinicodes.leet.easy.p1_twosum;

/**
 * TIME: O(n^2) - n square
 * SPACE: O(n)
 */

public class Iterative {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        for(int i = 0; i <= nums.length - 1; i++){
            for(int j = nums.length - 1; j > i; j--){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        return result;
    }
}
