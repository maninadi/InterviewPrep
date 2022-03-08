import java.util.*;

/*
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
	American keyboard
	Example 1:
	Input: ["Hello", "Alaska", "Dad", "Peace"]
	Output: ["Alaska", "Dad"]
	Note:
	You may use one character in the keyboard more than once.
	You may assume the input string will only contain letters of alphabet.
 */
public class KeyboardRow {

	HashSet<Character> first=new HashSet<>();
	HashSet<Character> second=new HashSet<>(); 
	HashSet<Character> third=new HashSet<>();
	
	public static void main(String[] args){
		KeyboardRow kr=new KeyboardRow();
		String[] words={"Hello", "Alaska", "Dad", "Peace"};
		for(String s:kr.findWords(words)){
			System.out.println(s);
		}
	}
	public String[] findWords(String[] words) {
		
		ArrayList<String> res=new ArrayList<>();
		fill();
		
		for(String s:words){
			s=s.toLowerCase();
			char c=s.charAt(0);
			HashSet<Character> hs=first.contains(c)?first:(
					second.contains(c)?second:third);
			boolean add=true;
			for(char k:s.toCharArray()){
				if(!hs.contains(k)){
					add=false;
					break;
				}
			}
			if(add) res.add(s);
		}
		
		return res.toArray(new String[0]);
    }
	
	void fill(){
		
		for(char c:"qwertyuiop".toCharArray()){
			first.add(c);
		}
		for(char c:"asdfghjkl".toCharArray()){
			second.add(c);
		}
		for(char c:"zxcvbnm".toCharArray()){
			third.add(c);
		}
	}
}
