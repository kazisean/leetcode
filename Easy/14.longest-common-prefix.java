/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++){ 
            char ltrNow = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++){
                if ( i >= strs[j].length() || strs[j].charAt(i) != ltrNow){
                    return output.toString();
                }
            }
            output.append(ltrNow);
        }


        if (output.toString().equals(null)){
            return "";
        }
        
        return output.toString();
    }
}
// @lc code=end

