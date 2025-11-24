package cat1;

import java.util.Scanner;

public class BinaryPalindrome {
    // Function to check if number is binary palindrome
    static boolean isBinaryPalindrome(int n) {
        String bin = Integer.toBinaryString(n);  // convert number to binary string
        int left = 0, right = bin.length() - 1;  // two pointers (start and end)

        while (left < right) {                   // check characters from both sides
            if (bin.charAt(left) != bin.charAt(right)) {
                return false; // if mismatch, not a palindrome
            }
            left++;
            right--;
        }
        return true; // if all matched, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isBinaryPalindrome(n))
            System.out.println(n + " is a Binary Palindrome.");
        else
            System.out.println(n + " is NOT a Binary Palindrome.");

        sc.close();
    }
}
