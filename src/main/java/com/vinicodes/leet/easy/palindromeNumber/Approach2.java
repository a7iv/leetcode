package com.vinicodes.leet.easy.palindromeNumber;

public class Approach2 {
    /**
     * Reversing the number without converting to a string
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        int original = x, reverse = 0;
        if(x < 0) {
            return false;
        }

        while(x != 0){
            int remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = x / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Approach2 app = new Approach2();
        System.out.println(app.isPalindrome(122121));
    }
}
