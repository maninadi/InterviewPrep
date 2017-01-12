package Arrays;


import java.util.*;

public class NextLargest {

	public static void main(String[] args){
		int[] in={13, 7, 6, 12};
		int[] out=nextLargest(in);
		for(int i=0;i<out.length;i++)
			System.out.print(out[i]+" ");
	}
	
	static int[] nextLargest(int[] in){
		int n=in.length;
		int[] out=new int[n];
		Arrays.fill(out, -1);
		Stack<Integer> st=new Stack<Integer>();
		st.push(0);
		for(int i=1;i<n;i++){
			int next=in[i];
			while(!st.isEmpty()){
				if(in[st.peek()]<next){
					out[st.pop()]=next;
				}
				else{
					break;
				}
			}
			st.push(i);
		}
		return out;
	}
}
