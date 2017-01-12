package vmware;

public class SentenceRevers {
	
	public static void main(String[] args){
		System.out.println(reverse(new StringBuffer("this is an example")));
		System.out.println(reverse(new StringBuffer("")));
		System.out.println(reverse(new StringBuffer("this")));
		System.out.println(reverse(new StringBuffer("t")));
		System.out.println(reverse(new StringBuffer("this  is    an    example  ")));
	}

	static StringBuffer reverse(StringBuffer sentence){
	     
	     int prevIndex=0;
	     int curindex=sentence.indexOf(" ");
	     while(curindex!=-1){
	         
	         int i=prevIndex;
	         int j=curindex-1;
	         myReverse(sentence,i,j);
	         prevIndex=curindex+1;
	         curindex=sentence.indexOf(" ",prevIndex);
	         
	     }
	     myReverse(sentence,prevIndex,sentence.length()-1);
	     return myReverse(sentence,0,sentence.length()-1);
	 }
	 
	 
	 static StringBuffer  myReverse(StringBuffer s,int i,int j){
	     
	     
	     while(i<j){
	             char c= s.charAt(i);
	             s.replace(i, i+1, s.substring(j, j+1));
	             s.replace(j, j+1, ""+c);
	             i++;
	             j--;
	    }
	         
	     return s;
	 }
}
