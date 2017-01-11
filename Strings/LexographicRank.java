package Strings;

public class LexographicRank {

	public static void main(String[] args){
		
		System.out.println(findRank("string"));
	}
	
	static int findRank(String s){
		
		
		int rank=1;;
		int len=s.length();
		int fact=getFact(s.length());
		
		for(int i=0;i<s.length();i++){
			fact/=(len-i);
			int count=findRightCount(s,i);
			rank+=(fact*count);
		}
		
		return rank;
		
	}

	private static int findRightCount(String s, int i) {
		
		int count=0;
		for(int j=i;j<s.length();j++){
			if(s.charAt(j)<s.charAt(i))
				count++;
		}
		return count;
	}

	private static int getFact(int length) {
		int result=1;
		for(int i=2;i<=length;i++){
			result*=i;
		}
		return result;
	}
}
