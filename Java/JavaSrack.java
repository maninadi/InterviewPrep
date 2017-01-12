package Java;

import java.util.*;

public class JavaSrack {

	static HashSet<Character> openParen=new HashSet<Character>();
	static HashMap<Character,Character> match=new HashMap<Character,Character>();
	
	public static void main(String []argh)
	   {
		  openParen.add('{');
		  openParen.add('[');
		  openParen.add('(');
		  match.put('}', '{');
		  match.put(']', '[');
		  match.put(')', '(');
	      Scanner sc = new Scanner(System.in);
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	         System.out.println(analyze(input));
	      }
	      sc.close();
	   }
	
	
	private static boolean analyze(String input) {
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<input.length();i++){
			char c1=input.charAt(i);
			if(openParen.contains(c1))
				st.push(c1);
			else {
				char cc=match.get(c1);
				if(st.isEmpty() || cc!=st.pop())
					return false;
			}
		}
		
		return st.isEmpty()?true:false;
	}
}
