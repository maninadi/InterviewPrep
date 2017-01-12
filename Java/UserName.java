package Java;

import java.util.*;
import java.util.regex.*;
public class UserName {
	public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String username = in.nextLine();
	         String pattern = "^(?=^[\\p{Alpha}]+[_\\w]*$)(?:.{8,30})$";
	         Pattern r = Pattern.compile(pattern);
	         Matcher m = r.matcher(username);
	          
	         if (m.find( )) {
	            System.out.println("Valid");
	         } else {
	            System.out.println("Invalid");
	         }
	         testCases--;
	      }
	      in.close();
	 }
}
