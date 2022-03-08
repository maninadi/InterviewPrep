package ctci;

public class OneWayEdit {

	public static void main(String[] args){
		System.out.println(oneOp("pales","palkk"));
	}
	
	
	static boolean oneOp(String s1,String s2){
		
		boolean deleted=false;
		int i=0;
		int j=0;
		if(Math.abs(s1.length()-s2.length())>1)
			return false;
		
		while(i<s1.length() && j<s2.length()){
			if(s1.charAt(i)!=s2.charAt(j)){
				if(deleted)
					return false;
				deleted=true;
				if(s1.length()==s2.length()){
					i++;
				}
			}
			else{
				i++;
			}
			j++;
		}
		
		return true;
	}
}
