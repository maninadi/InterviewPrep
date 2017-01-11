package ctci;

import java.util.*;

public class RansomNote {

	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomNote(String magazine, String note) {
        
    	magazineMap=new HashMap<String, Integer>();
    	noteMap=new HashMap<String, Integer>();		
    	buildFrequency(magazineMap, magazine);
    	buildFrequency(noteMap, note);
    	
    }
    
    private void buildFrequency(Map<String, Integer> map,String input){
    	for(String s:input.split(" ")){
        	if(map.containsKey(s))
        		map.put(s, map.get(s)+1);
        	else
        		map.put(s, 1);
        }
    }
    
    public boolean solve() {
     
    	if(magazineMap.size()<noteMap.size())
    		return false;
    	for(String key:noteMap.keySet()){
    		if(!magazineMap.containsKey(key) || magazineMap.get(key)<noteMap.get(key))
    			return false;
    	}
    	return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
