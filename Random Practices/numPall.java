
public class numPall {
    public static void main (String[] args){
        boolean aa = isPalindrome("kok");

        System.out.println(aa);
    }



    public static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        return isPalindromeHelper(numberString, 0, numberString.length() - 1);
    }
    
    private static boolean isPalindromeHelper(String numberString, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (numberString.charAt(left) != numberString.charAt(right)) {
            return false;
        }
        return isPalindromeHelper(numberString, left + 1, right - 1);
    }
    
    
}

