class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        // Numbers ending with 0 are not palindrome
        // except 0 itself
        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        // Even number of digits
        // Odd number of digits: ignore middle digit
        return x == reversed || x == reversed / 10;
    }
}