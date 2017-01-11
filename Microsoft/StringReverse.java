package Microsoft;

public class StringReverse {

	public static void main(String[] args){
		
		System.out.println(myReverse("abcdef",2,4));
	}
	
	static String myReverse(String s,int i,int j){
		
		char[] arr=s.toCharArray();
		int n=s.length()-1;
		arr=reverseS(arr,0,n);
		arr=reverseS(arr,0,n-j);
		arr=reverseS(arr,n-i,n);
		arr=reverseS(arr,i+1,j-1);
		
		return new String(arr);
	}
	
	static char[] reverseS(char[] arr,int i,int j){
		
		while(i<j){
			char t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
		
		return arr;
	}
	
}
