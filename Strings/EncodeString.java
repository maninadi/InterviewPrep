package Strings;


/*
 * Calculate and replace repeated characters in a string with 
 * their numbers of occurrences
 * 
 * Example
 * aaaabbcccczze
 * 4a2b4c2z1e
 */
public class EncodeString {

	public static void main(String[] args){
		
		System.out.println(encode("aaaabbcccczze"));
	}
	
	static String encode(String s){
		
		int i=1;
		StringBuilder sb=new StringBuilder();
		char prev=s.charAt(0);
		int count=1;
		while(i<s.length()){
			char c=s.charAt(i);
			if(c!=prev){
				sb.append(count);
				sb.append(prev);
				prev=c;
				count=1;
			}
			else{
				count++;
			}
			i++;
		}
		sb.append(count);
		sb.append(prev);
		return sb.toString();
	}
}
