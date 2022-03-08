import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
You are given two string arrays username and website and an integer array timestamp. All the given arrays are of the same length and the tuple [username[i], website[i], timestamp[i]] indicates that the user username[i] visited the website website[i] at time timestamp[i].

A pattern is a list of three websites (not necessarily distinct).

For example, ["home", "away", "love"], ["leetcode", "love", "leetcode"], and ["luffy", "luffy", "luffy"] are all patterns.
The score of a pattern is the number of users that visited all the websites in the pattern in the same order they appeared in the pattern.

For example, if the pattern is ["home", "away", "love"], the score is the number of users x such that x visited "home" then visited "away" and visited "love" after that.
Similarly, if the pattern is ["leetcode", "love", "leetcode"], the score is the number of users x such that x visited "leetcode" then visited "love" and visited "leetcode" one more time after that.
Also, if the pattern is ["luffy", "luffy", "luffy"], the score is the number of users x such that x visited "luffy" three different times at different timestamps.
Return the pattern with the largest score. If there is more than one pattern with the same largest score, return the lexicographically smallest such pattern.
*/

public class UserWebSitePattern {

    class Visit{
        String name;
        String website;
        int timestamp;
        Visit(String name, String website, int timestamp){
            this.name = name;
            this.website = website;
            this.timestamp = timestamp;
        }
    }

    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        
        ArrayList<Visit> visits = new ArrayList<>();
        int L = username.length;
        for(int i=0; i<L; i++){
            visits.add(new Visit(username[i], website[i], timestamp[i]));
        }
        Comparator<Visit> c = new Comparator<Visit>() {
            @Override
            public int compare(Visit v1, Visit v2){
                return v1.timestamp - v2.timestamp;
            }
        }; 

        Collections.sort(visits, c);

        HashMap<String, List<String>> lookup = new HashMap<>(); 

        for(Visit v: visits){
            lookup.putIfAbsent(v.name, new ArrayList<>());
            lookup.get(v.name).add(v.website);
        }

        HashMap<ArrayList<String>, Integer> counts = new HashMap<>();

        for(List<String> webs: lookup.values()){
            Set<ArrayList<String>> combos = get_combinations(webs);
            for(ArrayList<String> combo: combos){
                counts.putIfAbsent(combo, 0);
                counts.put(combo, counts.get(combo)+1);
            } 
        }

        ArrayList<String> result = null;
        String resultValue = "";
        int max = Integer.MIN_VALUE;
        for(ArrayList<String> key: counts.keySet()){
            int count = counts.get(key);
            if(count > max){
                result = key;
                max = count;
                resultValue = String.valueOf(key);
            }
            else if(count == max && String.valueOf(key).compareTo(resultValue) <0 ){
                result = key;
                resultValue = String.valueOf(key);
            }
        }
        return result;
    }

    private Set<ArrayList<String>> get_combinations(List<String> webs) {
        Set<ArrayList<String>> combos= new HashSet<>();
		for(int i=0;i<webs.size();i++){
			for(int j=i+1;j<webs.size();j++){
				for(int k=j+1;k<webs.size();k++){
					ArrayList<String> list = new ArrayList<>();
					list.add(webs.get(i));
					list.add(webs.get(j));
					list.add(webs.get(k));
					combos.add(list);
				}
			}
		}
		return combos;
    }
    
}
