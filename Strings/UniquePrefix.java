package Strings;

import java.util.*;

/*
 * Find shortest unique prefix to represent each word in the list.

	Example:
	
	Input: [zebra, dog, duck, dove]
	Output: {z, dog, du, dov}
	where we can see that
	zebra = z
	dog = dog
	duck = du
	dove = dov
	NOTE : Assume that no word is prefix of another. In other words, the representation is always possible.
 */
public class UniquePrefix {

	
	public static void main(String[] args){
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("zebra");
		a.add("dog");
		a.add("duck");
		a.add("dove");
		
		a=prefix(a);
		
		for(String s:a){
			System.out.println(s);
		}
		
		
	}
	
	public static ArrayList<String> prefix(ArrayList<String> a) {
		    
	    TrieNode root=new TrieNode();
	    for(String s: a){
	        System.out.println(s);
	        root.insertWord(s,0);
	    }
	    
	    ArrayList<String> out = new ArrayList<String>();
	    
	    for(String s:a){
	        String prefix=root.findPrefix(s,0);
	        out.add(prefix);
	    }
	    
	    return out;
	}
}
class TrieNode{
    
    TrieNode[] chars=new TrieNode[26];
    
    public int count=0;
    
    public void insertWord(String s,int index){
        
        if(index>=s.length())
            return;
        
        char c=s.charAt(index);
        
        if(chars[c-'a']==null)
            chars[c-'a']=new TrieNode();
        
        chars[c-'a'].count++;
        
        chars[c-'a'].insertWord(s,index+1);
        
    }
    
    public String findPrefix(String s,int index){
    	
    	if(index>=s.length())
    		return "";
    	
    	char c=s.charAt(index);
    	
    	if(chars[c-'a'].count==1)
    		return s.substring(0,index+1);
    	
    	return chars[c-'a'].findPrefix(s, index+1);
    	
    }
}
