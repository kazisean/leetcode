/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] sendArray = new int [2];

        for (int i = 0; i < nums.length; i++){


            for (int j = i + 1; j < nums.length; j++)

            if (nums[i] + nums[j] == target){
                sendArray[0] = j;
                sendArray[1] = i;
            }

            
        }

        return sendArray;
    }
}
// @lc code=end

