package com.vinicodes.leet.easy.palindromeNumber;

public class Approach1 {
    /**
     * Converting to string and then comparing the two pointers (left and right)
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        char[] arr = Integer.toString(x).toCharArray();

        for(int i=0, j=arr.length -1; i < j; i++, j--){
            if(arr[i] != arr[j]){
                return false;
            }
        }

        return true;
    }
}
