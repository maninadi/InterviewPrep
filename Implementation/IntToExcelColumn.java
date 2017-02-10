package Implementation;

public class IntToExcelColumn {

	static char[] columns={'A','B','C','D','E','F','G','H',
			'I','J','K','L','M','N','O','P','Q','R',
		    'S','T','U','V','W','X','Y','Z'};
	
	public static void main(String[] args){
		
		System.out.println(convertToTitle(1));
		System.out.println(convertToTitle(11));
		System.out.println(convertToTitle(111));
		System.out.println(convertToTitle(27));
		System.out.println(convertToTitle(26));
		System.out.println(convertToTitle(98066));
	}
	
	static String convertToTitle(int a) {
	    StringBuilder res=new StringBuilder();
	    while(a>0){
	        
	        int remainder=a%26;
	        a/=26;
	        a-=remainder==0?1:0;
	        remainder=remainder==0?26:remainder;
	        res.append(columns[remainder-1]);
	        
	    }
	    
	    return res.reverse().toString();
	}
}
