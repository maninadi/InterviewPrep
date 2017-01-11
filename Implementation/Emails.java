package Implementation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emails {

	  public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  
		  int n=in.nextInt();
		  String[] arr=new String[n];
		  
		  for(int i=0;i<n;i++){
			  String fname=in.next();
			  String email=in.next();
			  Pattern p = Pattern.compile("^[a-z]+(.[a-z]+)*@gmail.com");
			  Matcher m= p.matcher(email);
			  if(m.find())
				  arr[i]=fname;
			  else
				  arr[i]="";
		  }
		  
		  Arrays.sort(arr);
		  for(int i=0;i<n;i++)
			  if(arr[i].length()>0)
				  System.out.println(arr[i]);
		  in.close();
		  
	  }
}
