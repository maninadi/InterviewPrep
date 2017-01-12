package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class JavaPQ {

	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      int totalEvents = Integer.parseInt(in.nextLine());
	      PriorityQueue<Student> pq=new PriorityQueue<Student>(1,new StudentChecker<Student>());
	      while(totalEvents>0){
	         String event = in.next();
	         
	         if(event.compareTo("ENTER")==0){
	        	 String name=in.next();
	        	 double cgpa=in.nextDouble();
	        	 int token=in.nextInt();
	        	 pq.add(new Student(token,name,cgpa));
	         }
	         else
	        	 pq.poll();
	         
	           
	         totalEvents--;
	      }
	      if(pq.isEmpty()){
	    	  System.out.println("EMPTY");
	    	  return;
	      }
	    	  
	      while(!pq.isEmpty()){
	    	  Student st=pq.poll();
	    	  System.out.println(st.getFname());
	      }
	}
}

