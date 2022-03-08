/*
A binary string is monotone increasing if it consists of some number of 0's (possibly none), followed by some number of 1's (also possibly none).

You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.

Return the minimum number of flips to make s monotone increasing.

 

Example 1:

Input: s = "00110"
Output: 1
Explanation: We flip the last digit to get 00111.
*/
public class MonotoneIncreasing {

    public int minFlipsMonoIncr(String s) {

        int result = 0;
        int totalOnes = (int) s.chars().filter(c -> c == '1').count();
        int l = s.length();
        result = Math.min(totalOnes, l-totalOnes);
        int running1s = 0;
        for(int i=0; i<l; i++){
            if(s.charAt(i) == '1'){
                running1s++;
            }
            int flips = running1s + ((l-i-1)-(totalOnes-running1s));
            result = Math.min(result,flips);
        }


        return result;
        
    }
}




