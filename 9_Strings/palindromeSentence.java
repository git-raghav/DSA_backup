class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int lp = 0;
        int rp = s.length()-1;
        while(lp <= rp) {
            char left = s.charAt(lp);
            char right = s.charAt(rp);
            if(!Character.isLetterOrDigit(left)){
                lp++;
            } else if(!Character.isLetterOrDigit(right)){
                rp--;
            } else {
                if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                    return false;
                }
                lp++;
                rp--;
            }
        }
        return true;
    }
}
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
