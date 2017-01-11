package Strings;

public class StringTransformation {

	public static void main(String[] args){
		
		System.out.println(transform("a1b2c3d4e5f6g7"));
	}
	
	
	static String transform(String s){
		char[] str=transform(s.toCharArray());
		return new String(str);
	}

	private static char[] transform(char[] str) {
		
		int len=str.length;
		
		int loc=0;
		
		while(len>0){
			
			int k=0;
			while(Math.pow(3, k)+1<=len)
				k++;
			
			int prefixLen=(int) (Math.pow(3, k-1)+1);
			len-=prefixLen;
			cycleLeadIteration(str,loc,prefixLen);
			
			reverse(str,loc/2,loc-1);
			
			reverse(str,loc,loc+prefixLen/2-1);
			
			reverse(str,loc/2,loc+prefixLen/2-1);
			
			loc+=prefixLen;
		}
		return str;
	}

	private static void reverse(char[] str, int i, int j) {
		while(i<j){
			swap(str,i,j);
			i++;
			j--;
		}
			
	}

	private static void swap(char[] str, int i, int j) {
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}

	private static void cycleLeadIteration(char[] str, int loc, int len) {
		
		for(int i=1;i<len;i*=3){
			int j=i;
			char prev=str[j+loc];
			do{
				if(j%2!=0)
					j=len/2+j/2;
				else
					j/=2;
				char temp=str[j+loc];
				str[j+loc]=prev;
				prev=temp;
			}while(j!=i);
		}
		
	}
}
