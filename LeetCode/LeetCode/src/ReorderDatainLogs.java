import java.util.Arrays;
import java.util.Comparator;

/*
You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.

There are two types of logs:

Letter-logs: All words (except the identifier) consist of lowercase English letters.
Digit-logs: All words (except the identifier) consist of digits.
Reorder these logs so that:

The letter-logs come before all digit-logs.
The letter-logs are sorted lexicographically by their contents. If their contents are the same, then sort them lexicographically by their identifiers.
The digit-logs maintain their relative ordering.
Return the final order of the logs.
*/

public class ReorderDatainLogs {


    public String[] reorderLogFiles(String[] logs) {
        
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] s1Split = s1.split(" ", 2);
                String[] s2Split = s2.split(" ", 2);

                char x = s1Split[1].charAt(0);
                char y = s2Split[1].charAt(0);

                if(Character.isLetter(x) && Character.isLetter(y)){
                    int diff = s1Split[1].compareTo(s2Split[1]);
                    return diff !=0 ? diff : s1Split[0].compareTo(s2Split[0]);
                }
                else if(!Character.isLetter(x) && !Character.isLetter(y)){
                    return 0;
                }
                
                return Character.isLetter(x) ? -1 : 1;
            }
        };
        Arrays.sort(logs, c);;


        return logs;
    }
}
