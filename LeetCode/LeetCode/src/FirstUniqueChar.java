import java.util.*;

/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

	Examples:
	
	return 0.
	s = "leetcode"
	
	s = "loveleetcode",
	return 2.
	Note: You may assume the string contain only lowercase letters.
 */

public class FirstUniqueChar {

	public static void main(String[] agrs){
		
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("leetcodel"));
		System.out.println(firstUniqChar("loveleetcode"));
	}
	static int firstUniqChar(String s) {
        
        HashMap<Character,Node> hm=new HashMap<Character,Node>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,new Node(1,i));
            }
            else{
                Node n=hm.get(c);
                n.count++;
                hm.put(c,n);
            }
        }
        
        int result=-1;
        for(char c:hm.keySet()){
            Node n=hm.get(c);
            if(n.count==1 && (result==-1 || result>n.index)){
                result=n.index;
            }
        }
        
        return result;
    }
}

class Node{
    int count=0;
    int index=-1;
    Node(int count,int index){
        this.count=count;
        this.index=index;
    }
}