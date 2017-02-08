package queues;

import java.util.*;

/*
 * Given N and M find all stepping numbers in range N to M

	The stepping number:
	
	A number is called as a stepping number if the adjacent digits have a difference of 1.
	e.g 123 is stepping number, but 358 is not a stepping number
	
	Example:
	
	N = 10, M = 20
	all stepping numbers are 10 , 12 
	Return the numbers in sorted order.
 */
public class StepNumbersInRange {

	
	public static void main(String[] args){
		
		ArrayList<Integer> out = getStepNumbers(10, 25);
		
		for(int i:out){
			System.out.println(i);
		}
	}
	
	static ArrayList<Integer> getStepNumbers(int start,int end){
	
		ArrayList<Integer> out=new ArrayList<Integer>();
		for(int i=0;i<=9;i++){
			genNumbers(start,end,i,out);
		}
		
		return out;
	}

	private static void genNumbers(int start, int end,int n, ArrayList<Integer> out) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.add(n);
		
		while(!q.isEmpty()){
			
			int num=q.poll();
			
			int lastDigit=num%10;
			
			if(start<=num && num<=end)
				out.add(num);
			
			if(num==0 || num>=end)
				continue;
			
			int low=(num*10)+lastDigit-1;
			int high=(num*10)+lastDigit+1;
			
			if(lastDigit==0)
				q.add(high);
			else if (lastDigit==9)
				q.add(low);
			else{
				q.add(low);
				q.add(high);
			}
		}
	}
	
	
}
