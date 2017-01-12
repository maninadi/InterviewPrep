import java.util.ArrayList;


public class minDis {

	public static void main(String args[]){
		
		String a[]={"2", "1", "0", "2", "0", "3", "0"};
		String input[]={"1","2","3"};
		System.out.println(findMinDis(a,input));
		PrintNumbers("IDIDIDIDIDIDIDIDIDIDIDIDIDIDIDID");
	}
	
	static void PrintNumbers(String str) {
	    if (str.length() == 0) {
	        return;
	    }
	    int dCount = 0;
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == 'D') {
	            dCount++;
	        }
	    }
	    ArrayList<Integer> nums=new ArrayList<Integer>();
	    for (int i = 0; i <= str.length(); i++) {
	        nums.add(i+1);
	    }
	    
	    System.out.print(nums.get(dCount) + " ");
	    nums.set(dCount, -1);
	    int iCount = dCount+1;
	    dCount--;
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == 'I') {
	        	System.out.print(nums.get(iCount) + " ");
	        	nums.set(iCount, -1);
	        	iCount++;
	        }
	        else {
	        	System.out.print(nums.get(dCount)+ " ");
	            nums.set(dCount, -1);
	            dCount--;
	        }
	    }
	    System.out.println("");
	}
	
	static int findMinDis(String a[],String input[]){
		if(a.length==0 || input.length==0)
			return 0;
		int lo=Integer.MAX_VALUE;
		int hi=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(doesMatch(a[i],input)){
				lo=lo>i?i:lo;
				hi=hi<i?i:hi;
			}
		}
		return Math.abs(2*(hi-lo));
	}
	
	static boolean doesMatch(String s,String input[]){
		for (int i=0;i<input.length;i++)
			if(s.equalsIgnoreCase(input[i]))
				return true;
		return false;
	}
}
