package Easy;

/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        
        
    if (x  < 0){
        return false;
    }
    
    int rev  = 0;
    int rn = x;


    while (rn > 0){
        rev = rev * 10 + (rn % 10);
        rn /=10;
    }


    return rev==x;


    }
}
// @lc code=end

