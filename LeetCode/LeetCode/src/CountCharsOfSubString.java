
/*
    Let's define a function countUniqueChars(s) that returns the number of unique characters on s.

    For example, calling countUniqueChars(s) if s = "LEETCODE" then "L", "T", "C", "O", "D" are the unique characters since they appear only once in s, therefore countUniqueChars(s) = 5.
    Given a string s, return the sum of countUniqueChars(t) where t is a substring of s.

    Notice that some substrings can be repeated so in this case you have to count the repeated ones too.
*/
public class CountCharsOfSubString {

    public int uniqueLetterString(String s) {
        
        int result = 0;

        int[] lastSeenAt = new int[128];
        int[] lastCount = new int[128];
        int runningCount = 0;
        for(int i=0; i<s.length(); i++){
            // every character when added to previous set of substrings
            // will lead to adding i+1 unique chars
            // e.g. in AB
            // A if the first set of substring
            // AB and B are the second send of substring
            // in second set B 1 unique char to previous set of substring and 1 char for a substring of itself
            int currCount=i; 

            // Everything is all and good if all chars are unique in the string
            // what happens if the char is a repeating char
            // So this means that character is already counted and we have 
            // to ignore it this time.
            // If you look at it you have two possibilities for this char that we have to ignore
            //   1. Reduce a value of X from current count where X is number of times
            //      the char is added to a substrings from previous set which already has the char
            //     e.g. for s = ABB
            //        A
            //        AB B
            //        ABB BB B
            //       For the 3rd level we added 3 uniq B in line #28 (currCount=i+1)
            //       But looking at it we can say there is only one string "B" with B as a unique.
            //       So we have to reduce 2 from the currCount
            char c = s.charAt(i);
            int k = lastSeenAt[c];
            currCount = (currCount - (k-1));

            // So now 2nd possibility (Using s="ABB" as example)
            // 2. We reduced the count for B we are adding in location i. 
            //    However we have to reduce the count of B's which is already in previous set i.e. 
            //    We have to reduce the count of B's in { AB, B} since we those are the base for next level
            //    We maintain this in lastCount
            runningCount -= lastCount[c];

            // When we see this char again, this will be the new count we have use for calc
            lastCount[c] = currCount;

            lastSeenAt[c] = i+1;

            runningCount += currCount;

            result += runningCount;
        }


        return result;
    }
    
}
