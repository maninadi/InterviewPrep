package ctci;

import java.util.*;

public class Brackers {

    public static boolean isBalanced(String expression) {
    	HashMap<Character,Character> map=getBracketsMap();
    	Stack<Character> stack=new Stack<Character>();
    	for(char curr:expression.toCharArray()){
    		if(map.containsKey(curr)){
    			if(map.get(curr)!=stack.peek())
    				return false;
    			stack.pop();
    		}
    		else
    			stack.push(curr);
    		
    	}
    	if(!stack.isEmpty())
    		return false;
    	return true;
    }
 
   private static HashMap<Character, Character> getBracketsMap() {
	   HashMap<Character,Character> map=new HashMap<Character,Character>();
	   map.put(']', '[');
	   map.put(')', '(');
	   map.put('}', '{');
	   return map;
	}

public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
       for(int a0 = 0; a0 < t; a0++) {
           String expression = in.next();
           boolean answer = isBalanced(expression);
           if(answer)
               System.out.println("YES");
           else System.out.println("NO");
       }
       in.close();
   }
}
