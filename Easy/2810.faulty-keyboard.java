/*
 * @lc app=leetcode id=2810 lang=java
 *
 * [2810] Faulty Keyboard
 */

// @lc code=start
class Solution {
    public String finalString(String s) {
        String output = "";
        StringBuilder input1 = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'i'){
            
         output = new StringBuffer(output).reverse().toString();

            }
            else {
                output += s.charAt(i);
            }
        }
        return output;
    }
}
// @lc code=end

