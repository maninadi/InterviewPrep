package Implementation;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
	private int token;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getToken() {
		return token;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

public class JavaPQ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalEvents = Integer.parseInt(in.nextLine());
		PriorityQueue<Student> pq=new PriorityQueue<Student>();
		while(totalEvents>0){
			String event = in.next();
			String name = in.next();
			double cgpa=in.nextDouble();
			int token=in.nextInt();
			pq.add(new Student(token,name,cgpa));
			totalEvents--;
		}
	}
}
