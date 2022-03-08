import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!hm.containsKey(key)){
                hm.put(key, new ArrayList<String>());
            }
            hm.get(key).add(str);
        }
        return new ArrayList<List<String>>(hm.values());

    }
}
