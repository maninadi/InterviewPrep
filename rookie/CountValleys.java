package rookie;

import java.util.*;

public class CountValleys {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		String s=in.next();
		in. close();
		char[] c=s.toCharArray();
		
		int count=0;
		int height=0;
		for(int i=0;i<n;i++){
			if(c[i]=='U'){
				height++;
				if(height==0) count++;
			}
			else{
				height--;
			}
		}
		System.out.println(count);
    }
}
