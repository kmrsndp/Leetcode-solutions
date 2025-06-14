/**
 * Problem: 9. Palindrome Number
 * Difficulty: Easy
 * 
 * Description:
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * An integer is a palindrome when it reads the same forward and backward.
 * For example, 121 is a palindrome while 123 is not.
 * 
 * Constraints:
 * - -2^31 <= x <= 2^31 - 1
 * 
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-.
 * Therefore it is not a palindrome.
 * 
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return reversed == x || reversed / 10 == x;
    }
}

/*
 * The algorithm works by:
 * First checking edge cases (negative numbers and numbers ending with 0)
 * Reversing only half of the number
 * Comparing the original half with the reversed half
 * For example, let's see how it works with 12321:
 * Initially: x = 12321, reversed = 0
 * After first iteration: x = 1232, reversed = 1
 * After second iteration: x = 123, reversed = 12
 * After third iteration: x = 12, reversed = 123
 * Now x < reversed, so we stop
 * Since x (12) == reversed/10 (123/10 = 12), it's a palindrome
 * 
 */