/*
 * @lc app=leetcode id=2810 lang=java
 *
 * [2810] Faulty Keyboard
 */

// @lc code=start
class Solution {
    public String finalString(String s) {
        StringBuilder aa = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'i'){
                aa.reverse();
            }
            else{
                aa.append(s.charAt(i));
            }
        }
        return aa.toString();     
    }
}
// @lc code=end

