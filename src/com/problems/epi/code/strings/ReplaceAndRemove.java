package com.problems.epi.code.strings;

/**
 * Problem Type: String Problem
 */
public class ReplaceAndRemove {

    /**
     * Key Insights:
     * 1) The total number of elements in the resulting array = length given - number of b's + number of a's.
     * 2) Begin inserting from the back of the array if charcater is equal to 'a'
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static char[] replaceAndRemove(char[] chars, int size) {
        if(chars == null || chars.length == 0) return null;
        int writeIdx = 0, aCount = 0;
        for(int i = 0; i < size; i++) {
            if(chars[i] != 'b') chars[writeIdx++] = chars[i];
            if(chars[i] == 'a') aCount++;
        }
        int curr = writeIdx - 1;
        writeIdx = writeIdx + aCount - 1;
        int finalSize = writeIdx + 1;
        while(curr >= 0) {
            if(chars[curr] == 'a') {
                chars[writeIdx--] = 'd';
                chars[writeIdx--] = 'd';
            }
            else chars[writeIdx--] = chars[curr];
            --curr;
        }
        return chars;
    }
}