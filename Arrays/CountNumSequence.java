package Arrays;


import java.util.*;

public class CountNumSequence {
	
	public static void main(String[] args){
		findNth(10);
	}

	static void findNth(int n){
		
		String curr="1";
		
		int i=1;
		while(i<=n){
			System.out.println(curr);
			StringBuilder next=new StringBuilder();
			char prev=curr.charAt(0);
			int count=1;
			for(int j=1;j<curr.length();j++){
				
				if(prev!=curr.charAt(j)){
					next.append(count);
					next.append(prev);
					count=1;
					prev=curr.charAt(j);
				}
				else{
					count++;
				}
			}
			next.append(count);
			next.append(prev);
			curr=next.toString();
			i++;
		}
		
	}
}

