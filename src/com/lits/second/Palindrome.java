package com.lits.second;

public class Palindrome {

        public static void main(String[] args) {
            String str = "madam";
            boolean isPalindrome;
            if (isPalindrome(str)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }

    private static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        for(int i=0; i < str.length(); i++) {
            if(charArray[i] != charArray[(str.length()-1) - i]) {
                return false;
            }
        }
        return true;
    }
}