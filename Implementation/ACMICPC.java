package Implementation;

import java.util.*;
import java.math.*;

public class ACMICPC {

	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      BigInteger[] a=new BigInteger[n];
      for(int i=0;i<n;i++){
    	  String s=in.next();
    	  a[i]=new BigInteger(s,2);
      }
      int max=0;
      int count=0;
      for(int i=0;i<n;i++){
    	  for(int j=i+1;j<n;j++){
    		  if(a[i].or(a[j]).bitCount()>max){
    			  max=a[i].or(a[j]).bitCount();
    			  count=0;
    			  count++;
    		  }
    		  else if(a[i].or(a[j]).bitCount()==max){
    			  count++;
    		  }
    	  }
      }
      System.out.println(max);
      System.out.println(count);
      in.close();
    }
}
