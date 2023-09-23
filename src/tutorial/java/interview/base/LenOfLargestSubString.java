package tutorial.java.interview.base;

import java.util.ArrayList;
import java.util.List;

public class LenOfLargestSubString {

    /**
     * abcabcbb
     * 3
     *
     */

    public static void main(String[] args) {
        System.out.println(getLenOfLongestNonRepeatingString("abcabcdebbcdefghij"));
    }

    public static int getLenOfLongestNonRepeatingString( String input) {
        // 1st step : to loop through string
        // character by character
        // next character should not match with the previous
        //max = len
        if(input == null) return 0;
        char[] chars = input.toCharArray();
        List<Character> temp = new ArrayList<>(input.length());
        int max = 0;
        temp.add(chars[0]);
        for(int i= 1, j = 0; j < input.length() && i < input.length(); i++) {
            if(temp.contains(chars[i])) {
                max = Math.max(max, temp.size());
                temp.clear();
                j++;
                i = j-1;
            } else {
                temp.add(chars[i]);
            }
        }
        return max;
    }
}
