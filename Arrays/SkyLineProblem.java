package Arrays;

import java.util.ArrayList;
import java.util.List;

import sun.security.action.GetIntegerAction;

public class SkyLineProblem {

	public static void main(String[] args){
		
		int[][] bs={ {1,11,5}, 
				{2,6,7}, 
				{3,13,9}, 
				{12,7,16}, 
				{14,3,25},
				{19,18,22},
				{23,13,29},
				{24,4,28}
				};
		
		for(int[]arr:getSkyLine(bs)){
			System.out.println(arr[0]+" "+arr[1]);
		}
	}
	
	static List<int[]> getSkyLine(int[][] b){
		
		return helper(b,0,b.length-1);
	}

	private static List<int[]> helper(int[][] buildings, int s, int e) {
		if(s>=e){
			ArrayList<int[]> res=new ArrayList<>();
			res.add(new int[]{buildings[s][0],buildings[s][1]});
			res.add(new int[]{buildings[s][2],0});
			return res;
		}
		
		int mid=(s+e)/2;
		
		List<int[]> first=helper(buildings,s,mid);
		List<int[]> second=helper(buildings,mid+1,e);
		
		int h1=0;
		int h2=0;
		
		int i=0;
		int j=0;
		ArrayList<int[]> res=new ArrayList<>();
		while(i<first.size() && j<second.size()){
			int[] a=first.get(i);
			int[] b=second.get(j);
			if(a[0]<b[0]){
				h1=a[1];
				int[] c=new int[]{a[0],Math.max(h1, h2)};
				a=getInterval(res,c);
				if(a!=null) res.add(a);
				i++;
			}
			else{
				h2=b[1];
				int[] c=new int[]{b[0],Math.max(h1, h2)};
				b=getInterval(res,c);
				if(b!=null) res.add(b);
				j++;
			}
		}
		
		while(i<first.size()){
			int[] a=first.get(i);
			h1=a[1];
			int[] c=new int[]{a[0],Math.max(h1, h2)};
			a=getInterval(res,c);
			if(a!=null) res.add(a);
			i++;
		}
		
		while(j<second.size()){
			int[] b=second.get(j);
			h2=b[1];
			int[] c=new int[]{b[0],Math.max(h1, h2)};
			b=getInterval(res,c);
			if(b!=null) res.add(b);
			j++;
		}
		return res;
	}
	
	static int[] getInterval(ArrayList<int[]> a,int[] b){
		int n=a.size();
		
		if(n>0 && a.get(n-1)[1]==b[1])
			return null;
		
		if(n>0 && a.get(n-1)[0]==b[0]){
			a.get(n-1)[1]=Math.max(a.get(n-1)[1], b[1]);
			return null;
		}
			
		return b;
		
	}
}
