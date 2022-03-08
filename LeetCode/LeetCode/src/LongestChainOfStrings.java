import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
You are given an array of words where each word consists of lowercase English letters.

wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without changing the order of the other characters to make it equal to wordB.

For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1, where word1 is a predecessor of word2, word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.

Return the length of the longest possible word chain with words chosen from the given list of words.
*/


public class LongestChainOfStrings {
    public int longestStrChain(String[] words) {
        HashMap<String, Integer> counts = new HashMap<>();
        Set<String> lookup = new HashSet<String>();
        Collections.addAll(lookup, words);
        int maxLength = Integer.MIN_VALUE;
        for(int i=0; i<words.length; i++){
            int currLength = findLength(words[i], lookup, counts);
            maxLength = Math.max(maxLength, currLength);
        }
        return maxLength;
    }

    private int findLength(String word, Set<String> lookup, HashMap<String, Integer> counts) {
        if(counts.containsKey(word)){
            return counts.get(word);
        }
        int runningMax = 1;

        for(int i=0; i<word.length(); i++){
            String remaining = word.substring(0, i) + word.substring(i+1);
            if(lookup.contains(remaining)){
                int currMax = 1 + findLength(remaining, lookup, counts);
                runningMax = Math.max(runningMax, currMax);
            }
        }
        counts.put(word, runningMax);
        return runningMax;
    }
}


