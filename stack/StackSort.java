package stack;

import java.util.*;

public class StackSort {

	public static void main(String[] args){
		
		Stack<Integer> in= new Stack<Integer>();
		
		in.push(10);
		in.push(1);
		in.push(20);
		in.push(11);
		in.push(5);
		in.push(4);
		in.push(100);
		in=sortStack(in);
		while(!in.isEmpty()){
			System.out.print(in.pop()+" ");
		}
	}
	
	static Stack<Integer>  sortStack(Stack<Integer> in){
		
		Stack<Integer> temp= new Stack<Integer>();
		
		while(!in.isEmpty()){
			
			int inTop=in.pop();
			
			while(!temp.isEmpty() && temp.peek()>inTop){
				in.push(temp.pop());
			}
			
			temp.push(inTop);
		}
		
		return temp;
	}
	
}
