
public class numPall {
    public static void main (String[] args){
        boolean aa = isPalindrome("kok");

        System.out.println(aa);
    }



    public static boolean isPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) {
            // base case 1, palindrome!
            return true;
        }
        else if (word.charAt(0) != word.charAt(word.length() - 1)){
        // base case 2, first and last disagree, not a palindrome!
            return false;
        }
        else{
        // recursive case!
        // extract the middle word
        String middle = word.substring(1, word.length() - 1);
        return isPalindrome(middle);
        }
    }
    
}

