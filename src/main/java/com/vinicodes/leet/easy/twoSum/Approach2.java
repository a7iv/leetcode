package com.vinicodes.leet.easy.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * TIME: O(n)
 * SPACE: O(n)
 */

public class Approach2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valIdxMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length - 1; i++){
            int currentNum = nums[i];

            if(valIdxMap.containsKey(target - currentNum)){
                return new int[] { valIdxMap.get(target - currentNum), i };
            }

            valIdxMap.put(currentNum, i);
        }

        return null;
    }
}
