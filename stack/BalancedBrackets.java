package stack;

import java.util.*;

public class BalancedBrackets {

	static HashMap<Character,Character> hm=new HashMap<Character,Character>();
    public static void main(String[] args) {
    	hm.put(']', '[');
    	hm.put(')', '(');
    	hm.put('}', '{');
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            System.out.println(isBalanced(s)?"YES":"NO");
        }
    }

	private static boolean isBalanced(String s) {
		Stack<Character> s1=new Stack<Character>();
		for(int i=0;i<s.length();i++){
			char cur=s.charAt(i);
			if(hm.containsKey(cur)){
				char c=s1.pop();
				if(c!=hm.get(cur))
					return false;
			}
			else{
				s1.push(cur);
			}
		}
		return s1.isEmpty()?true:false;
	}
}
