package Strings;


/*
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.
	
	For example,
	123 -> "One Hundred Twenty Three"
	12345 -> "Twelve Thousand Three Hundred Forty Five"
	1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
	
	Did you see a pattern in dividing the number into chunk of words? For example, 123 and 123000.
 */


public class Integer2String {

	static String[] ones={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	static String[] tens={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	static String[] elevens={"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen",
			"Seventeen","Eighteen","Nineteen"};
	static String hundred="Hundred";
	static String[] bigs={"","Thousand","Million","Billion","Trillion"};
	
	public static void main(String[] args){
	
		System.out.println(convert2String(123));
		System.out.println(convert2String(12345));
		System.out.println(convert2String(1234567));
	}

	private static String convert2String(int n) {
		String output="";
		
		int count=0;
		while(n>0){
			
			int part=n%1000;
			if(part>0){
				output=convertPart(part)+bigs[count]+" "+output;
			}
			count++;
			n/=1000;
		}
		
		return output.trim();
	}
	
	static String convertPart(int part){
		StringBuilder sb=new StringBuilder();
		if(part>=100){
			sb.append(ones[part/100]);
			sb.append(" ");
			sb.append(hundred);
			sb.append(" ");
		}
		
		part%=100;
		if(part==10){
			sb.append(ones[10]);
			sb.append(" ");
		}
		else if(part>10 && part<20){
			sb.append(elevens[part%10]);
			sb.append(" ");
		}
		else{
		    if(part/10>0){
		        sb.append(tens[part/10]);
		        sb.append(" ");
		    }
			
			part%=10;
			if(part>0){
    			sb.append(ones[part]);    
			}
			
			
		}
		return sb.toString();
	}
	
}
