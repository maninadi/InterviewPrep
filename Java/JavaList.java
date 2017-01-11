package Java;

import java.util.*;

public class JavaList {
	public static void main(String[] args) {
       
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			l.add(in.nextInt());
		
		int q=in.nextInt();
		
		for(int i=0;i<q;i++){
			String s=in.next();
			int x=in.nextInt();
			if(s.compareTo("Insert")==0){
				int y=in.nextInt();
				l.add(x,y);
			}
			else if (s.compareTo("Delete")==0){
				l.remove(x);
			}
		}
		
		in.close();
		
		for(int i=0;i<l.size();i++)
			System.out.print(l.get(i)+" ");
    }
}
